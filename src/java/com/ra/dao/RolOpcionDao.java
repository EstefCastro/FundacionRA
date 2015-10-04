/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ra.dao;

import com.ra.model.TblRaRolOpcion;
import com.ra.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Administrador
 */
public class RolOpcionDao {
    private Session sesion;
    public RolOpcionDao() throws Exception {
        sesion= HibernateUtil.getSessionFactory().openSession();
        if (sesion==null)
            throw new Exception("Error al conectarse con Hibernate");
    }
    
    public List<TblRaRolOpcion> getRolOpcion(Map parametros) throws Exception{
        List<TblRaRolOpcion> listaRolOpcion= new ArrayList<>();
        try{
            StringBuilder sql = new StringBuilder();
            sql.append("from TblRaRolOpcion ");
            if (parametros.get("id")!=null && !parametros.get("id").toString().isEmpty()){
                sql.append(" where roprolid.rolid=").append(Integer.parseInt(parametros.get("id").toString()));
            }
            sql.append(" order by ropestado");
            Query query= sesion.createQuery(sql.toString());
            listaRolOpcion=query.list();
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            sesion.close();
        }
        return listaRolOpcion;
    }
    
    
    public void insertaRolOpcion(TblRaRolOpcion rolOpcion) throws Exception{
        Transaction tx = sesion.beginTransaction();
        try{
            StringBuilder sql = new StringBuilder();
            TblRaRolOpcion posRolOpcion= new TblRaRolOpcion();
            if (rolOpcion.getRopid()!=null && rolOpcion.getRopid()!=0){
                sql.append("from TblRaRolOpcion where roprolid.rolid=").append(rolOpcion.getRoprolid().getRolid()).append(" and ropopcid.opcid=").append(rolOpcion.getRopopcid().getOpcid()).append(" and ropid<>").append(rolOpcion.getRopid());
            }else{
                sql.append("from TblRaRolOpcion where roprolid.rolid=").append(rolOpcion.getRoprolid().getRolid()).append(" and ropopcid.opcid=").append(rolOpcion.getRopopcid().getOpcid());
            }
            Query query=sesion.createQuery(sql.toString());
            posRolOpcion=(TblRaRolOpcion) query.uniqueResult();
            if (posRolOpcion!=null){
                throw new Exception("Rol y opción ya asignados");
            }
            sesion.saveOrUpdate(rolOpcion);
            tx.commit();
        }catch(Exception e){
            tx.rollback();
            throw new Exception(e.getMessage());
        }finally{
            sesion.close();
        }
    }
}
