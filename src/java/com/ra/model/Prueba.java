/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ra.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "prueba")
@NamedQueries({
    @NamedQuery(name = "Prueba.findAll", query = "SELECT p FROM Prueba p")})
public class Prueba implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idprueba")
    private Integer idprueba;
    @Size(max = 45)
    @Column(name = "pruebaDetalle")
    private String pruebaDetalle;

    public Prueba() {
    }

    public Prueba(Integer idprueba) {
        this.idprueba = idprueba;
    }

    public Integer getIdprueba() {
        return idprueba;
    }

    public void setIdprueba(Integer idprueba) {
        this.idprueba = idprueba;
    }

    public String getPruebaDetalle() {
        return pruebaDetalle;
    }

    public void setPruebaDetalle(String pruebaDetalle) {
        this.pruebaDetalle = pruebaDetalle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprueba != null ? idprueba.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prueba)) {
            return false;
        }
        Prueba other = (Prueba) object;
        if ((this.idprueba == null && other.idprueba != null) || (this.idprueba != null && !this.idprueba.equals(other.idprueba))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ra.model.Prueba[ idprueba=" + idprueba + " ]";
    }
    
}
