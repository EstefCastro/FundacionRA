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
@Table(name = "tbl_RaEstMascota")
@NamedQueries({
    @NamedQuery(name = "TblRaEstMascota.findAll", query = "SELECT t FROM TblRaEstMascota t")})
public class TblRaEstMascota implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "emaid")
    private Integer emaid;
    @Basic(optional = false)
    @Column(name = "emanombre")
    private String emanombre;
    @Basic(optional = false)
    @Column(name = "emaestado")
    private String emaestado;
    @Basic(optional = false)
    @Column(name = "emafecing")
    @Temporal(TemporalType.DATE)
    private Date emafecing;
    @Basic(optional = false)
    @Column(name = "emausuingreso")
    private String emausuingreso;
    @Column(name = "emafecmod")
    @Temporal(TemporalType.DATE)
    private Date emafecmod;
    @Column(name = "emausumodifica")
    private String emausumodifica;
    @OneToMany(mappedBy = "masemaid")
    private List<TblRaMascotas> tblRaMascotasList;

    public TblRaEstMascota() {
    }

    public TblRaEstMascota(Integer emaid) {
        this.emaid = emaid;
    }

    public TblRaEstMascota(Integer emaid, String emanombre, String emaestado, Date emafecing, String emausuingreso) {
        this.emaid = emaid;
        this.emanombre = emanombre;
        this.emaestado = emaestado;
        this.emafecing = emafecing;
        this.emausuingreso = emausuingreso;
    }

    public Integer getEmaid() {
        return emaid;
    }

    public void setEmaid(Integer emaid) {
        this.emaid = emaid;
    }

    public String getEmanombre() {
        return emanombre;
    }

    public void setEmanombre(String emanombre) {
        this.emanombre = emanombre;
    }

    public String getEmaestado() {
        return emaestado;
    }

    public void setEmaestado(String emaestado) {
        this.emaestado = emaestado;
    }

    public Date getEmafecing() {
        return emafecing;
    }

    public void setEmafecing(Date emafecing) {
        this.emafecing = emafecing;
    }

    public String getEmausuingreso() {
        return emausuingreso;
    }

    public void setEmausuingreso(String emausuingreso) {
        this.emausuingreso = emausuingreso;
    }

    public Date getEmafecmod() {
        return emafecmod;
    }

    public void setEmafecmod(Date emafecmod) {
        this.emafecmod = emafecmod;
    }

    public String getEmausumodifica() {
        return emausumodifica;
    }

    public void setEmausumodifica(String emausumodifica) {
        this.emausumodifica = emausumodifica;
    }

    public List<TblRaMascotas> getTblRaMascotasList() {
        return tblRaMascotasList;
    }

    public void setTblRaMascotasList(List<TblRaMascotas> tblRaMascotasList) {
        this.tblRaMascotasList = tblRaMascotasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emaid != null ? emaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblRaEstMascota)) {
            return false;
        }
        TblRaEstMascota other = (TblRaEstMascota) object;
        if ((this.emaid == null && other.emaid != null) || (this.emaid != null && !this.emaid.equals(other.emaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ra.model.TblRaEstMascota[ emaid=" + emaid + " ]";
    }
    
}
