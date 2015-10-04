/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ra.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "tbl_RaExperVolun")
@NamedQueries({
    @NamedQuery(name = "TblRaExperVolun.findAll", query = "SELECT t FROM TblRaExperVolun t")})
public class TblRaExperVolun implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "evoid")
    private Integer evoid;
    @Basic(optional = false)
    @Column(name = "evonombre")
    private String evonombre;
    @Basic(optional = false)
    @Column(name = "evoestado")
    private String evoestado;
    @Basic(optional = false)
    @Column(name = "evofecing")
    @Temporal(TemporalType.DATE)
    private Date evofecing;
    @Basic(optional = false)
    @Column(name = "evousuingreso")
    private String evousuingreso;
    @Column(name = "evofecmod")
    @Temporal(TemporalType.DATE)
    private Date evofecmod;
    @Column(name = "evousumodifica")
    private String evousumodifica;

    public TblRaExperVolun() {
    }

    public TblRaExperVolun(Integer evoid) {
        this.evoid = evoid;
    }

    public TblRaExperVolun(Integer evoid, String evonombre, String evoestado, Date evofecing, String evousuingreso) {
        this.evoid = evoid;
        this.evonombre = evonombre;
        this.evoestado = evoestado;
        this.evofecing = evofecing;
        this.evousuingreso = evousuingreso;
    }

    public Integer getEvoid() {
        return evoid;
    }

    public void setEvoid(Integer evoid) {
        this.evoid = evoid;
    }

    public String getEvonombre() {
        return evonombre;
    }

    public void setEvonombre(String evonombre) {
        this.evonombre = evonombre;
    }

    public String getEvoestado() {
        return evoestado;
    }

    public void setEvoestado(String evoestado) {
        this.evoestado = evoestado;
    }

    public Date getEvofecing() {
        return evofecing;
    }

    public void setEvofecing(Date evofecing) {
        this.evofecing = evofecing;
    }

    public String getEvousuingreso() {
        return evousuingreso;
    }

    public void setEvousuingreso(String evousuingreso) {
        this.evousuingreso = evousuingreso;
    }

    public Date getEvofecmod() {
        return evofecmod;
    }

    public void setEvofecmod(Date evofecmod) {
        this.evofecmod = evofecmod;
    }

    public String getEvousumodifica() {
        return evousumodifica;
    }

    public void setEvousumodifica(String evousumodifica) {
        this.evousumodifica = evousumodifica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (evoid != null ? evoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblRaExperVolun)) {
            return false;
        }
        TblRaExperVolun other = (TblRaExperVolun) object;
        if ((this.evoid == null && other.evoid != null) || (this.evoid != null && !this.evoid.equals(other.evoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ra.model.TblRaExperVolun[ evoid=" + evoid + " ]";
    }
    
}
