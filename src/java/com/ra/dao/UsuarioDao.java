/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ra.dao;

import com.ra.model.TblRaUsuarios;
import com.ra.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Administrador
 */
public class UsuarioDao {
    private Session sesion;
    public UsuarioDao() throws Exception {
        sesion= HibernateUtil.getSessionFactory().openSession();
        if (sesion==null)
            throw new Exception("Error al conectarse con Hibernate");
    }
    
    public TblRaUsuarios buscarUsuarioByUsuarioContrasenia(String usuario, String contrasenia) throws Exception{
        TblRaUsuarios usuarios;
        try{
            StringBuilder sql= new StringBuilder();
            sql.append("from TblRaUsuarios o where o.usunombre='").append(usuario).append("' and o.usuclave='").append(contrasenia).append("' and usuestado='ACT'");
            Query query=sesion.createQuery(sql.toString());
            usuarios=(TblRaUsuarios) query.uniqueResult();
            if (usuarios!=null)
            {    if (usuarios.getTblRaRolUsuarioList().get(0).getRusrolid().getRolestado().equals("INA"))
                    usuarios=null;
                usuarios.getTblRaPersonaList().size();
                usuarios.getTblRaPersonaList().get(0).getTblRaAdopcionList().size();
                usuarios.getTblRaPersonaList().get(0).getTblRaRescateList().size();
                usuarios.getTblRaPersonaList().get(0).getTblRaVoluntariadoList().size();
                usuarios.getTblRaPersonaList().get(0).getPertfuid().getTblRaPersonaList().size();
                usuarios.getTblRaRolUsuarioList().size();
                usuarios.getTblRaRolUsuarioList().get(0).getRusrolid().getTblRaRolOpcionList().size();
                usuarios.getTblRaRolUsuarioList().get(0).getRusrolid().getTblRaRolUsuarioList().size();
                
            }        
        }catch(Exception e){
            throw new Exception("Error al consultar el usuario: " + e.getMessage());
        }finally{
            sesion.close();
        }
        return usuarios;
    }
    
    
}
