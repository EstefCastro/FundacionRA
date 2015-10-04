/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ra.controller;

import com.ra.model.TblRaOpciones;
import com.ra.services.MenuServices;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

/**
 *
 * @author Administrador
 */
@ManagedBean(name = "menuController")
@SessionScoped
public class MenuController {
    @ManagedProperty(value = "#{loginController}")
    private LoginController loginController;
    @ManagedProperty(value = "#{menuServices}")
    private MenuServices menuServices;
    private List<TblRaOpciones> listaOpcionesHijos;
    private List<TblRaOpciones> listaOpcionesPadres;
    private MenuModel menubar;
        
    public void init(){
        try {
            menubar= new DefaultMenuModel();
            listaOpcionesHijos = new ArrayList<>();
            listaOpcionesPadres = new ArrayList<>();
            listaOpcionesHijos = menuServices.getOpcionesHijoByUsuario(loginController.getUsuarios());
            listaOpcionesPadres = menuServices.getOpcionesPadreByHijoId(listaOpcionesHijos);
            CargaMenu();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void CargaMenu() {
        DefaultMenuItem itemPrincipal= new DefaultMenuItem("PRINCIPAL");
        itemPrincipal.setUrl("../Mantenimiento/index.xhtml");
        menubar.addElement(itemPrincipal);
        for (int i=0;i<listaOpcionesPadres.size();i++){
            if (listaOpcionesPadres.get(i).getOpcnombre().equals("APP")) continue;
            DefaultSubMenu Menu= new DefaultSubMenu(listaOpcionesPadres.get(i).getOpcnombre());
            for (int y=0;y<listaOpcionesHijos.size();y++){
                if (listaOpcionesHijos.get(y).getOpcpadreid()==listaOpcionesPadres.get(i).getOpcid()){
                    DefaultMenuItem item= new DefaultMenuItem(listaOpcionesHijos.get(y).getOpcnombre());
                    item.setUrl("../"+listaOpcionesHijos.get(y).getOpcurl());
                    item.setStyle("width:230px");
                    Menu.addElement(item);
                }
            }
            menubar.addElement(Menu);
        }
    }

    public LoginController getLoginController() {
        return loginController;
    }

    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }

    public MenuServices getMenuServices() {
        return menuServices;
    }

    public void setMenuServices(MenuServices menuServices) {
        this.menuServices = menuServices;
    }

    public MenuModel getMenubar() {
        return menubar;
    }

    public void setMenubar(MenuModel menubar) {
        this.menubar = menubar;
    }
    
    

    
}
