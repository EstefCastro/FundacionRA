/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ra.controller;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Administrador
 */
@ManagedBean(name = "bannerController")
@ViewScoped
public class BannerController {
    private List<String> listaImagen, listaImagen2;
    @PostConstruct
    public void init(){
       listaImagen= new ArrayList<>();
       listaImagen.add("/RescateAnimal/resource/imagenes/Banner-adopciones.jpg");
       //listaImagen.add("/RescateAnimal/resource/imagenes/Banner-educacion.jpg");
       //listaImagen.add("/RescateAnimal/resource/imagenes/Banner-esterilizaciones.jpg");
       listaImagen2= new ArrayList<>();
       listaImagen2.add("/RescateAnimal/resource/imagenes/Banner-adopciones.jpg");
       listaImagen2.add("/RescateAnimal/resource/imagenes/Banner-educacion.jpg");
       listaImagen2.add("/RescateAnimal/resource/imagenes/Banner-esterilizaciones.jpg");
       
    }

    public List<String> getListaImagen() {
        return listaImagen;
    }

    public void setListaImagen(List<String> listaImagen) {
        this.listaImagen = listaImagen;
    }

    public List<String> getListaImagen2() {
        return listaImagen2;
    }

    public void setListaImagen2(List<String> listaImagen2) {
        this.listaImagen2 = listaImagen2;
    }
    
    
}
