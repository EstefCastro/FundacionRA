/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ra.controller;

import com.ra.model.TblRaRoles;
import com.ra.services.RolServices;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Administrador
 */
@ManagedBean(name="rolController")
@ViewScoped
public class RolController {
    @ManagedProperty(value = "#{rolServices}")
    private RolServices rolServices;
    @ManagedProperty(value = "#{loginController}")
    private LoginController loginController;
    private List<TblRaRoles> listaRoles;
    private TblRaRoles rol;
    @PostConstruct
    public void init(){
        try {
            listaRoles=rolServices.getRoles();
            rol= new TblRaRoles();
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al inicializar", "Descripción: " + ex.getMessage()));
        }
    }
    public void nuevo(){
        rol= new TblRaRoles();
    }
    public void grabar(){
        try{
            if (rol.getRolnombre()==null || rol.getRolnombre().equals("")){
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Datos incompletos", "Descripción: Ingrese el nombre del rol a ingresar"));
                return;
            }
            
            if (rol.getRolestado()==null || rol.getRolestado().equals("")){
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Datos incompletos", "Descripción: Seleccione el estado del rol a ingresar"));
                return;
            }
            if (rol.getRolid()!=null){
                rol.setRolusumodifica(loginController.getUsuarios().getUsunombre());
                rol.setRolfecmod(new Date());
            }else{
                rol.setRolusuingreso(loginController.getUsuarios().getUsunombre());
                rol.setRolfecing(new Date());
            }
            rolServices.insertaRol(rol);
            rol= new TblRaRoles();
            listaRoles=rolServices.getRoles();
            RequestContext.getCurrentInstance().execute("PF('dlgIngreso').hide();");
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Registro Guardado", "Descripción: Registro guardado con éxito"));
        }catch(Exception e){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al insertar", "Descripción: " + e.getMessage()));
        }
    }
    
    public void eliminar(TblRaRoles posRol){
        try{
            
            posRol.setRolusuingreso(loginController.getUsuarios().getUsunombre());
            posRol.setRolfecing(new Date());
            posRol.setRolestado("INA");
            rolServices.ActualizarRol(posRol);
            listaRoles=rolServices.getRoles();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Registro Eliminado", "Descripción: Registro eliminado con éxito"));
        }catch(Exception e){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al Eliminar", "Descripción: " + e.getMessage()));
        }
    }
    public void limpiar(){
        try {
            rol= new TblRaRoles();
            listaRoles=rolServices.getRoles();
        } catch (Exception ex) {
            Logger.getLogger(RolController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void modifica(TblRaRoles posRol){
        rol=posRol;
    }

    public RolServices getRolServices() {
        return rolServices;
    }

    public void setRolServices(RolServices rolServices) {
        this.rolServices = rolServices;
    }

    public LoginController getLoginController() {
        return loginController;
    }

    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }

    public List<TblRaRoles> getListaRoles() {
        return listaRoles;
    }

    public void setListaRoles(List<TblRaRoles> listaRoles) {
        this.listaRoles = listaRoles;
    }

    public TblRaRoles getRol() {
        return rol;
    }

    public void setRol(TblRaRoles rol) {
        this.rol = rol;
    }
    
}
