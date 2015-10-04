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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tbl_RaVoluntariado")
@NamedQueries({
    @NamedQuery(name = "TblRaVoluntariado.findAll", query = "SELECT t FROM TblRaVoluntariado t")})
public class TblRaVoluntariado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "volid")
    private Integer volid;
    @Basic(optional = false)
    @Column(name = "voldetalle")
    private String voldetalle;
    @Basic(optional = false)
    @Column(name = "volestado")
    private String volestado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "volfecing")
    @Temporal(TemporalType.DATE)
    private Date volfecing;
    @Basic(optional = false)
    @Column(name = "volusuingreso")
    private String volusuingreso;
    @Column(name = "volfecmod")
    @Temporal(TemporalType.DATE)
    private Date volfecmod;
    @Column(name = "volusumodifica")
    private String volusumodifica;
    @JoinColumn(name = "volperid", referencedColumnName = "perid")
    @ManyToOne(optional = false)
    private TblRaPersona volperid;
    @JoinColumn(name = "volhvoid", referencedColumnName = "hvoid")
    @ManyToOne(optional = false)
    private TblRaHorarioVolun volhvoid;
    @JoinColumn(name = "volavoid", referencedColumnName = "avoid")
    @ManyToOne(optional = false)
    private TblRaAreaVolun volavoid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "resvolid")
    private List<TblRaRescate> tblRaRescateList;

    public TblRaVoluntariado() {
    }

    public TblRaVoluntariado(Integer volid) {
        this.volid = volid;
    }

    public TblRaVoluntariado(Integer volid, String voldetalle, String volestado, Date volfecing, String volusuingreso) {
        this.volid = volid;
        this.voldetalle = voldetalle;
        this.volestado = volestado;
        this.volfecing = volfecing;
        this.volusuingreso = volusuingreso;
    }

    public Integer getVolid() {
        return volid;
    }

    public void setVolid(Integer volid) {
        this.volid = volid;
    }

    public String getVoldetalle() {
        return voldetalle;
    }

    public void setVoldetalle(String voldetalle) {
        this.voldetalle = voldetalle;
    }

    public String getVolestado() {
        return volestado;
    }

    public void setVolestado(String volestado) {
        this.volestado = volestado;
    }

    public Date getVolfecing() {
        return volfecing;
    }

    public void setVolfecing(Date volfecing) {
        this.volfecing = volfecing;
    }

    public String getVolusuingreso() {
        return volusuingreso;
    }

    public void setVolusuingreso(String volusuingreso) {
        this.volusuingreso = volusuingreso;
    }

    public Date getVolfecmod() {
        return volfecmod;
    }

    public void setVolfecmod(Date volfecmod) {
        this.volfecmod = volfecmod;
    }

    public String getVolusumodifica() {
        return volusumodifica;
    }

    public void setVolusumodifica(String volusumodifica) {
        this.volusumodifica = volusumodifica;
    }

    public TblRaPersona getVolperid() {
        return volperid;
    }

    public void setVolperid(TblRaPersona volperid) {
        this.volperid = volperid;
    }

    public TblRaHorarioVolun getVolhvoid() {
        return volhvoid;
    }

    public void setVolhvoid(TblRaHorarioVolun volhvoid) {
        this.volhvoid = volhvoid;
    }

    public TblRaAreaVolun getVolavoid() {
        return volavoid;
    }

    public void setVolavoid(TblRaAreaVolun volavoid) {
        this.volavoid = volavoid;
    }

    public List<TblRaRescate> getTblRaRescateList() {
        return tblRaRescateList;
    }

    public void setTblRaRescateList(List<TblRaRescate> tblRaRescateList) {
        this.tblRaRescateList = tblRaRescateList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (volid != null ? volid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblRaVoluntariado)) {
            return false;
        }
        TblRaVoluntariado other = (TblRaVoluntariado) object;
        if ((this.volid == null && other.volid != null) || (this.volid != null && !this.volid.equals(other.volid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ra.model.TblRaVoluntariado[ volid=" + volid + " ]";
    }
    
}
