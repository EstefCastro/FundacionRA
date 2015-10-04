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
@Table(name = "tbl_RaOpciones")
@NamedQueries({
    @NamedQuery(name = "TblRaOpciones.findAll", query = "SELECT t FROM TblRaOpciones t")})
public class TblRaOpciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "opcid")
    private Integer opcid;
    @Basic(optional = false)
    @Column(name = "opcnombre")
    private String opcnombre;
    @Column(name = "opcurl")
    private String opcurl;
    @Basic(optional = false)
    @Column(name = "opcorden")
    private String opcorden;
    @Column(name = "opcpadreid")
    private Integer opcpadreid;
    @Basic(optional = false)
    @Column(name = "opcestado")
    private String opcestado;
    @Basic(optional = false)
    @Column(name = "opcfecing")
    @Temporal(TemporalType.DATE)
    private Date opcfecing;
    @Basic(optional = false)
    @Column(name = "opcusuingreso")
    private String opcusuingreso;
    @Column(name = "opcfecmod")
    @Temporal(TemporalType.DATE)
    private Date opcfecmod;
    @Column(name = "opcusumodifica")
    private String opcusumodifica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ropopcid")
    private List<TblRaRolOpcion> tblRaRolOpcionList;

    public TblRaOpciones() {
    }

    public TblRaOpciones(Integer opcid) {
        this.opcid = opcid;
    }

    public TblRaOpciones(Integer opcid, String opcnombre, String opcorden, String opcestado, Date opcfecing, String opcusuingreso) {
        this.opcid = opcid;
        this.opcnombre = opcnombre;
        this.opcorden = opcorden;
        this.opcestado = opcestado;
        this.opcfecing = opcfecing;
        this.opcusuingreso = opcusuingreso;
    }

    public Integer getOpcid() {
        return opcid;
    }

    public void setOpcid(Integer opcid) {
        this.opcid = opcid;
    }

    public String getOpcnombre() {
        return opcnombre;
    }

    public void setOpcnombre(String opcnombre) {
        this.opcnombre = opcnombre;
    }

    public String getOpcurl() {
        return opcurl;
    }

    public void setOpcurl(String opcurl) {
        this.opcurl = opcurl;
    }

    public String getOpcorden() {
        return opcorden;
    }

    public void setOpcorden(String opcorden) {
        this.opcorden = opcorden;
    }

    public Integer getOpcpadreid() {
        return opcpadreid;
    }

    public void setOpcpadreid(Integer opcpadreid) {
        this.opcpadreid = opcpadreid;
    }

    public String getOpcestado() {
        return opcestado;
    }

    public void setOpcestado(String opcestado) {
        this.opcestado = opcestado;
    }

    public Date getOpcfecing() {
        return opcfecing;
    }

    public void setOpcfecing(Date opcfecing) {
        this.opcfecing = opcfecing;
    }

    public String getOpcusuingreso() {
        return opcusuingreso;
    }

    public void setOpcusuingreso(String opcusuingreso) {
        this.opcusuingreso = opcusuingreso;
    }

    public Date getOpcfecmod() {
        return opcfecmod;
    }

    public void setOpcfecmod(Date opcfecmod) {
        this.opcfecmod = opcfecmod;
    }

    public String getOpcusumodifica() {
        return opcusumodifica;
    }

    public void setOpcusumodifica(String opcusumodifica) {
        this.opcusumodifica = opcusumodifica;
    }

    public List<TblRaRolOpcion> getTblRaRolOpcionList() {
        return tblRaRolOpcionList;
    }

    public void setTblRaRolOpcionList(List<TblRaRolOpcion> tblRaRolOpcionList) {
        this.tblRaRolOpcionList = tblRaRolOpcionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (opcid != null ? opcid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblRaOpciones)) {
            return false;
        }
        TblRaOpciones other = (TblRaOpciones) object;
        if ((this.opcid == null && other.opcid != null) || (this.opcid != null && !this.opcid.equals(other.opcid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ra.model.TblRaOpciones[ opcid=" + opcid + " ]";
    }
    
}
