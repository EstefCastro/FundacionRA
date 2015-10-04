/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ra.dao;

import com.ra.model.TblRaOpciones;
import com.ra.model.TblRaRolOpcion;
import com.ra.model.TblRaRolUsuario;
import com.ra.model.TblRaUsuarios;
import com.ra.util.HibernateUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Administrador
 */
public class OpcionDao {
    private Session sesion;
    public OpcionDao() throws Exception {
        sesion= HibernateUtil.getSessionFactory().openSession();
        if (sesion==null)
            throw new Exception("Error al conectarse con Hibernate");
    }
    
     
    public List<TblRaOpciones> getOpcionesHijoByUsuario(TblRaUsuarios raUsuario) throws Exception{
        List<TblRaOpciones> listaOpciones= new ArrayList<>();
        try{
            StringBuilder sql = new StringBuilder();
            sql.append("from TblRaRolUsuario where rususuid.usuid=").append(raUsuario.getUsuid()).append(" and rusestado='ACT'");
            Query query= sesion.createQuery(sql.toString());
            TblRaRolUsuario raRolUsuario=(TblRaRolUsuario) query.uniqueResult();
            if (raRolUsuario!=null){
                sql= new StringBuilder();
                sql.append("from TblRaRolOpcion where roprolid.rolid=").append(raRolUsuario.getRusrolid().getRolid()).append(" and ropestado='ACT' ORDER BY ropopcid.opcorden");
                Query query2=sesion.createQuery(sql.toString());
                List<TblRaRolOpcion> listaRolOpcion=query2.list();
                for (TblRaRolOpcion rolOpcion:listaRolOpcion){
                    listaOpciones.add(rolOpcion.getRopopcid());
                }
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            sesion.close();
        }
        return listaOpciones;
    }
    
    public List<TblRaOpciones> getOpcionesPadreByHijoId(List<TblRaOpciones> opcionesHijos)throws Exception{
        List<TblRaOpciones> listaOpciones= new ArrayList<>();
        try{
            StringBuilder sql = new StringBuilder();
            sql.append("select distinct opcpadreid from tbl_RaOpciones where opcid in (");
            for (int i=0;i<opcionesHijos.size();i++){
                if (i+1==opcionesHijos.size()){
                    sql.append(opcionesHijos.get(i).getOpcid()).append(")");
                }else{
                    sql.append(opcionesHijos.get(i).getOpcid()).append(",");
                }
            }
            sql.append(" and opcestado='ACT'");
            PreparedStatement pr;
            pr = sesion.connection().prepareCall(sql.toString());
            ResultSet rs = pr.executeQuery();
            List<Integer> listaIdPadre= new ArrayList<>();
            while(rs.next()){
                listaIdPadre.add(rs.getInt(1));
            }
            if (!listaIdPadre.isEmpty()){
                sql= new StringBuilder();
                sql.append("from TblRaOpciones where opcid in (");
                for (int i=0;i<listaIdPadre.size();i++){
                    if (i+1==listaIdPadre.size()){
                        sql.append(listaIdPadre.get(i)).append(")");
                    }else{
                        sql.append(listaIdPadre.get(i)).append(",");
                    }
                }
                sql.append(" and opcestado='ACT'");
                Query query=sesion.createQuery(sql.toString());
                listaOpciones=query.list();
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            sesion.close();
        }
        return listaOpciones;
    }
    
    public List<TblRaOpciones> getOpcionesPadres()throws Exception{
        List<TblRaOpciones> opciones= new ArrayList<>();
        try{
            StringBuilder sql = new StringBuilder();
            sql.append("from TblRaOpciones where opcestado='ACT' and opcpadreid is null");
            Query query= sesion.createQuery(sql.toString());
            opciones=query.list();
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            sesion.close();
        }
        return opciones;
    }
    
    public List<TblRaOpciones> getOpcionesByPadreId(Integer padreid)throws Exception{
        List<TblRaOpciones> opciones= new ArrayList<>();
        try{
            StringBuilder sql = new StringBuilder();
            sql.append("from TblRaOpciones where opcestado='ACT' and opcpadreid = ").append(padreid);
            Query query= sesion.createQuery(sql.toString());
            opciones=query.list();
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            sesion.close();
        }
        return opciones;
    }
    
    public TblRaOpciones getOpcionesById(Integer id)throws Exception{
        TblRaOpciones opciones= new TblRaOpciones();
        try{
            StringBuilder sql = new StringBuilder();
            sql.append("from TblRaOpciones where opcestado='ACT' and opcid = ").append(id);
            Query query= sesion.createQuery(sql.toString());
            opciones=(TblRaOpciones) query.uniqueResult();
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            sesion.close();
        }
        return opciones;
    }
   


}
