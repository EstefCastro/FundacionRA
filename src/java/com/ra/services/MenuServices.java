/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ra.services;

import com.ra.dao.OpcionDao;
import com.ra.model.TblRaOpciones;
import com.ra.model.TblRaUsuarios;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Administrador
 */
@ManagedBean(name = "menuServices")
@ApplicationScoped
public class MenuServices {
    public List<TblRaOpciones> getOpcionesHijoByUsuario(TblRaUsuarios raUsuario) throws Exception{
        return new OpcionDao().getOpcionesHijoByUsuario(raUsuario);
    }
    
    public List<TblRaOpciones> getOpcionesPadreByHijoId(List<TblRaOpciones> opcionesHijos)throws Exception{
        return new OpcionDao().getOpcionesPadreByHijoId(opcionesHijos);
    }
    
}
