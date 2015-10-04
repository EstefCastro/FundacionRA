/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ra.services;

import com.ra.dao.RolDao;
import com.ra.model.TblRaRoles;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Administrador
 */
@ManagedBean(name="rolServices")
@ApplicationScoped
public class RolServices {
    public List<TblRaRoles> getRoles() throws Exception{
        return new RolDao().getRoles();
    }
    
    public void insertaRol(TblRaRoles rol) throws Exception{
        new RolDao().insertaRol(rol);
    }
   
    public void ActualizarRol(TblRaRoles rol) throws Exception{
        new RolDao().actualizaRol(rol);
    }
    
     public List<TblRaRoles> getRolesActivos() throws Exception{
        List<TblRaRoles> listaRoles=new RolDao().getRolesActivos();
       
        return listaRoles;
    }
}
