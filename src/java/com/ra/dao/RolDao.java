/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ra.dao;

import com.ra.model.TblRaRoles;
import com.ra.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Administrador
 */
public class RolDao {
    private Session sesion;
    public RolDao() throws Exception {
        sesion= HibernateUtil.getSessionFactory().openSession();
        if (sesion==null)
            throw new Exception("Error al conectarse con Hibernate");
    }
    
    public List<TblRaRoles> getRoles() throws Exception{
        List<TblRaRoles> listaRoles= new ArrayList<>();
        try{
            StringBuilder sql = new StringBuilder();
            sql.append("from TblRaRoles order by rolestado");
            Query query= sesion.createQuery(sql.toString());
            listaRoles=query.list();
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            sesion.close();
        } 
        return listaRoles;
    }
    
    public void insertaRol(TblRaRoles rol) throws Exception{
        Transaction tx = sesion.beginTransaction();
        try{
            sesion.saveOrUpdate(rol);
            tx.commit();
        }catch(Exception e){
            tx.rollback();
            throw new Exception(e.getMessage());
        }finally{
            sesion.close();
        }
    }
    
    public void actualizaRol(TblRaRoles rol) throws Exception{
        Transaction tx = sesion.beginTransaction();
        try{
            sesion.update(rol);
            tx.commit();
        }catch(Exception e){
            tx.rollback();
            throw new Exception(e.getMessage());
        }finally{
            sesion.close();
        }
    }
    
    public List<TblRaRoles> getRolesActivos() throws Exception{
        List<TblRaRoles> listaRoles= new ArrayList<>();
        try{
            StringBuilder sql = new StringBuilder();
            sql.append("from TblRaRoles where rolestado='ACT'");
            Query query= sesion.createQuery(sql.toString());
            listaRoles=query.list();
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            sesion.close();
        } 
        return listaRoles;
    }
}
