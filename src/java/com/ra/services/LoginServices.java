/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ra.services;

import com.ra.dao.UsuarioDao;
import com.ra.model.TblRaUsuarios;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Administrador
 */
@ManagedBean(name="loginServices")
@ApplicationScoped
public class LoginServices {
    
    public TblRaUsuarios buscarUsuarioByUsuarioContrasenia(String usuario, String contrasenia) throws Exception{
        UsuarioDao usuDao= new UsuarioDao();
        TblRaUsuarios usuarios= new TblRaUsuarios();
        usuarios=usuDao.buscarUsuarioByUsuarioContrasenia(usuario, contrasenia);
        usuDao=null;
        return usuarios;
    }
    
    
}
