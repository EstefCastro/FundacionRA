/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ra.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "tbl_RaHorarioVolun")
@NamedQueries({
    @NamedQuery(name = "TblRaHorarioVolun.findAll", query = "SELECT t FROM TblRaHorarioVolun t")})
public class TblRaHorarioVolun implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "hvoid")
    private Integer hvoid;
    @Basic(optional = false)
    @Column(name = "hvonombre")
    private String hvonombre;
    @Basic(optional = false)
    @Column(name = "hvoestado")
    private String hvoestado;
    @Basic(optional = false)
    @Column(name = "hvofecing")
    @Temporal(TemporalType.DATE)
    private Date hvofecing;
    @Basic(optional = false)
    @Column(name = "hvousuingreso")
    private String hvousuingreso;
    @Column(name = "hvofecmod")
    @Temporal(TemporalType.DATE)
    private Date hvofecmod;
    @Column(name = "hvousumodifica")
    private String hvousumodifica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "volhvoid")
    private List<TblRaVoluntariado> tblRaVoluntariadoList;

    public TblRaHorarioVolun() {
    }

    public TblRaHorarioVolun(Integer hvoid) {
        this.hvoid = hvoid;
    }

    public TblRaHorarioVolun(Integer hvoid, String hvonombre, String hvoestado, Date hvofecing, String hvousuingreso) {
        this.hvoid = hvoid;
        this.hvonombre = hvonombre;
        this.hvoestado = hvoestado;
        this.hvofecing = hvofecing;
        this.hvousuingreso = hvousuingreso;
    }

    public Integer getHvoid() {
        return hvoid;
    }

    public void setHvoid(Integer hvoid) {
        this.hvoid = hvoid;
    }

    public String getHvonombre() {
        return hvonombre;
    }

    public void setHvonombre(String hvonombre) {
        this.hvonombre = hvonombre;
    }

    public String getHvoestado() {
        return hvoestado;
    }

    public void setHvoestado(String hvoestado) {
        this.hvoestado = hvoestado;
    }

    public Date getHvofecing() {
        return hvofecing;
    }

    public void setHvofecing(Date hvofecing) {
        this.hvofecing = hvofecing;
    }

    public String getHvousuingreso() {
        return hvousuingreso;
    }

    public void setHvousuingreso(String hvousuingreso) {
        this.hvousuingreso = hvousuingreso;
    }

    public Date getHvofecmod() {
        return hvofecmod;
    }

    public void setHvofecmod(Date hvofecmod) {
        this.hvofecmod = hvofecmod;
    }

    public String getHvousumodifica() {
        return hvousumodifica;
    }

    public void setHvousumodifica(String hvousumodifica) {
        this.hvousumodifica = hvousumodifica;
    }

    public List<TblRaVoluntariado> getTblRaVoluntariadoList() {
        return tblRaVoluntariadoList;
    }

    public void setTblRaVoluntariadoList(List<TblRaVoluntariado> tblRaVoluntariadoList) {
        this.tblRaVoluntariadoList = tblRaVoluntariadoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hvoid != null ? hvoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblRaHorarioVolun)) {
            return false;
        }
        TblRaHorarioVolun other = (TblRaHorarioVolun) object;
        if ((this.hvoid == null && other.hvoid != null) || (this.hvoid != null && !this.hvoid.equals(other.hvoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ra.model.TblRaHorarioVolun[ hvoid=" + hvoid + " ]";
    }
    
}
