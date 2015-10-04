/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ra.services;

import com.ra.dao.OpcionDao;
import com.ra.model.TblRaOpciones;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Administrador
 */
@ManagedBean(name="opcionServices")
@ApplicationScoped
public class OpcionServices {
    public List<TblRaOpciones> getOpcionesPadre() throws Exception{
        return new OpcionDao().getOpcionesPadres();
    }
    
    public List<TblRaOpciones> getOpcionesByPadreId(Integer padreid) throws Exception{
        return new OpcionDao().getOpcionesByPadreId(padreid);
    }
    
    public TblRaOpciones getOpcionesById(Integer id)throws Exception{
        return new OpcionDao().getOpcionesById(id);
    }
}
