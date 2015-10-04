/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ra.controller;

import com.ra.model.TblRaOpciones;
import com.ra.model.TblRaRolOpcion;
import com.ra.model.TblRaRoles;
import com.ra.services.OpcionServices;
import com.ra.services.RolOpcionServices;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Administrador
 */
@ManagedBean(name = "rolOpcionController")
@ViewScoped
public class RolOpcionController {
    @ManagedProperty(value = "#{loginController}")
    private LoginController loginController;
    @ManagedProperty(value = "#{rolOpcionServices}")
    private RolOpcionServices rolOpcionServices;
    @ManagedProperty(value = "#{opcionServices}")
    private OpcionServices opcionServices;

    private List<TblRaRolOpcion> listaPosRolOpcion;
    private List<TblRaOpciones> posOpciones;
    private TblRaOpciones opcionPadre;
    private TblRaRolOpcion posRolOpcion;
    private Integer idconsulta;
    @PostConstruct
    public void init() {
        try {
            opcionPadre = new TblRaOpciones();
            posRolOpcion = new TblRaRolOpcion();
            posRolOpcion.setRopopcid(new TblRaOpciones());
            posRolOpcion.setRoprolid(new TblRaRoles());
            listaPosRolOpcion = rolOpcionServices.getRolOpcion(new HashMap());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void selectionPadre() {
        try {
            posOpciones = opcionServices.getOpcionesByPadreId(opcionPadre.getOpcid());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void nuevo() {
        opcionPadre = new TblRaOpciones();
        posRolOpcion = new TblRaRolOpcion();
        posRolOpcion.setRopopcid(new TblRaOpciones());
        posRolOpcion.setRoprolid(new TblRaRoles());
    }

    public void grabar() {
        try {
            if (posRolOpcion.getRopid() != null) {
                posRolOpcion.setRopfecmod(new Date());
                posRolOpcion.setRopusumodifica(loginController.getUsuarios().getUsunombre());
            } else {
                posRolOpcion.setRopfecing(new Date());
                posRolOpcion.setRopusuingreso(loginController.getUsuarios().getUsunombre());
            }

            if (posRolOpcion.getRopopcid().getOpcid() == null || posRolOpcion.getRopopcid().getOpcid() == 0) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Datos incompletos", "Descripción: Seleccione el la opción"));
                return;
            }
            if (posRolOpcion.getRoprolid().getRolid() == null || posRolOpcion.getRoprolid().getRolid() == 0) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Datos incompletos", "Descripción: Seleccione el rol"));
                return;
            }
            rolOpcionServices.insertaRolOpcion(posRolOpcion);
            posRolOpcion = new TblRaRolOpcion();
            posRolOpcion.setRopopcid(new TblRaOpciones());
            posRolOpcion.setRoprolid(new TblRaRoles());
            opcionPadre = new TblRaOpciones();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Registro Guardado", "Descripción: Registro guardado con éxito"));
            consulta();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al insertar", "Descripción: " + e.getMessage()));
            e.printStackTrace();
        }
    }

    public void modificar(TblRaRolOpcion posRolOpcion) {
        try {
            this.posRolOpcion = (TblRaRolOpcion) posRolOpcion.clone();
            TblRaOpciones opcionPadre = opcionServices.getOpcionesById(posRolOpcion.getRopopcid().getOpcpadreid());
            if (opcionPadre == null) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al consular", "Descripción: No se encontro al padre de la opción"));
            } else {
                this.opcionPadre = opcionPadre;
                selectionPadre();
            }
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al consular", "Descripción: " + e.getMessage()));
        }
    }

    public void elimina(TblRaRolOpcion posRolOpcion) {
        try {
            this.posRolOpcion = posRolOpcion;
            posRolOpcion.setRopestado("INA");
            rolOpcionServices.insertaRolOpcion(posRolOpcion);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Registro Eliminado", "Descripción: Registro eliminado con éxito"));
            consulta();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al eliminar", "Descripción: " + e.getMessage()));
            e.printStackTrace();
        }
    }

    public void limpiar() {
        posRolOpcion = new TblRaRolOpcion();
        posRolOpcion.setRopopcid(new TblRaOpciones());
        posRolOpcion.setRoprolid(new TblRaRoles());
        opcionPadre = new TblRaOpciones();
    }
    
    public void consulta(){
        try {
            Map<String,Object> parametros= new HashMap<>();
            parametros.put("id", idconsulta);
            listaPosRolOpcion = rolOpcionServices.getRolOpcion(parametros);
        } catch (Exception ex) {
            Logger.getLogger(RolOpcionController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public LoginController getLoginController() {
        return loginController;
    }

    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }

    public List<TblRaRolOpcion> getListaPosRolOpcion() {
        return listaPosRolOpcion;
    }

    public void setListaPosRolOpcion(List<TblRaRolOpcion> listaPosRolOpcion) {
        this.listaPosRolOpcion = listaPosRolOpcion;
    }

    public List<TblRaOpciones> getPosOpciones() {
        return posOpciones;
    }

    public void setPosOpciones(List<TblRaOpciones> posOpciones) {
        this.posOpciones = posOpciones;
    }

    public TblRaOpciones getOpcionPadre() {
        return opcionPadre;
    }

    public void setOpcionPadre(TblRaOpciones opcionPadre) {
        this.opcionPadre = opcionPadre;
    }

    public TblRaRolOpcion getPosRolOpcion() {
        return posRolOpcion;
    }

    public void setPosRolOpcion(TblRaRolOpcion posRolOpcion) {
        this.posRolOpcion = posRolOpcion;
    }

    public Integer getIdconsulta() {
        return idconsulta;
    }

    public void setIdconsulta(Integer idconsulta) {
        this.idconsulta = idconsulta;
    }

    public RolOpcionServices getRolOpcionServices() {
        return rolOpcionServices;
    }

    public void setRolOpcionServices(RolOpcionServices rolOpcionServices) {
        this.rolOpcionServices = rolOpcionServices;
    }

    public OpcionServices getOpcionServices() {
        return opcionServices;
    }

    public void setOpcionServices(OpcionServices opcionServices) {
        this.opcionServices = opcionServices;
    }
    
    
    


}
