
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ra.services;

import com.ra.dao.RolOpcionDao;
import com.ra.model.TblRaRolOpcion;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Administrador
 */
@ManagedBean(name="rolOpcionServices")
@ApplicationScoped
public class RolOpcionServices {
    public List<TblRaRolOpcion> getRolOpcion(Map parametros) throws Exception{
        return new RolOpcionDao().getRolOpcion(parametros);
    }
    
    public void insertaRolOpcion(TblRaRolOpcion posRolOpcion) throws Exception{
        new RolOpcionDao().insertaRolOpcion(posRolOpcion);
    }
}
