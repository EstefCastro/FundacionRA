/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ra.controller;

import com.ra.model.TblRaUsuarios;
import com.ra.services.LoginServices;
import java.io.IOException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Administrador
 */
@ManagedBean(name="loginController")
@SessionScoped
public class LoginController {
    private  TblRaUsuarios usuarios;
    @ManagedProperty(value = "#{loginServices}")
    private LoginServices loginServices;
    
    public void ingresar(){
         try {
            if ((usuarios.getUsunombre()==null || usuarios.equals("")) || (usuarios.getUsuclave()==null || usuarios.getUsuclave().equals(""))){
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Datos incompletos", "Descripción: Ingrese los campos de usuario y clave"));
                return;
            }
            usuarios=loginServices.buscarUsuarioByUsuarioContrasenia(usuarios.getUsunombre(), usuarios.getUsuclave());
            if(usuarios==null){
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Datos incorrectos", "Descripción: No existe el usuario ingresado"));
                usuarios= new TblRaUsuarios();
                return;
            }
            FacesContext facesContext = FacesContext.getCurrentInstance();
            facesContext.getExternalContext().redirect("Mantenimiento/index.xhtml");
            
             
         }catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al inicializar", "Descripción: "+ ex.getMessage()));
        }
    }
    
    public void cerrarSesion() throws IOException{
        usuarios= new TblRaUsuarios();
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.getExternalContext().redirect("../Login.xhtml");
    }
    
    public void regresar()throws IOException{
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.getExternalContext().redirect("../Mantenimiento/index.xhtml");
    }
    
    public void inicializar() throws Exception{
        usuarios= new TblRaUsuarios();
    }

    public TblRaUsuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(TblRaUsuarios usuarios) {
        this.usuarios = usuarios;
    }

    public LoginServices getLoginServices() {
        return loginServices;
    }

    public void setLoginServices(LoginServices loginServices) {
        this.loginServices = loginServices;
    }
    
    
    
}
