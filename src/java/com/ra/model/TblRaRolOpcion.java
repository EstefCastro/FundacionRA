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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tbl_RaRolOpcion")
@NamedQueries({
    @NamedQuery(name = "TblRaRolOpcion.findAll", query = "SELECT t FROM TblRaRolOpcion t")})
public class TblRaRolOpcion implements Serializable,Cloneable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ropid")
    private Integer ropid;
    @Basic(optional = false)
    @Column(name = "ropestado")
    private String ropestado;
    @Basic(optional = false)
    @Column(name = "ropfecing")
    @Temporal(TemporalType.DATE)
    private Date ropfecing;
    @Basic(optional = false)
    @Column(name = "ropusuingreso")
    private String ropusuingreso;
    @Column(name = "ropfecmod")
    @Temporal(TemporalType.DATE)
    private Date ropfecmod;
    @Column(name = "ropusumodifica")
    private String ropusumodifica;
    @JoinColumn(name = "roprolid", referencedColumnName = "rolid")
    @ManyToOne(optional = false)
    private TblRaRoles roprolid;
    @JoinColumn(name = "ropopcid", referencedColumnName = "opcid")
    @ManyToOne(optional = false)
    private TblRaOpciones ropopcid;

    public TblRaRolOpcion() {
    }

    public TblRaRolOpcion(Integer ropid) {
        this.ropid = ropid;
    }

    public TblRaRolOpcion(Integer ropid, String ropestado, Date ropfecing, String ropusuingreso) {
        this.ropid = ropid;
        this.ropestado = ropestado;
        this.ropfecing = ropfecing;
        this.ropusuingreso = ropusuingreso;
    }

    public Integer getRopid() {
        return ropid;
    }

    public void setRopid(Integer ropid) {
        this.ropid = ropid;
    }

    public String getRopestado() {
        return ropestado;
    }

    public void setRopestado(String ropestado) {
        this.ropestado = ropestado;
    }

    public Date getRopfecing() {
        return ropfecing;
    }

    public void setRopfecing(Date ropfecing) {
        this.ropfecing = ropfecing;
    }

    public String getRopusuingreso() {
        return ropusuingreso;
    }

    public void setRopusuingreso(String ropusuingreso) {
        this.ropusuingreso = ropusuingreso;
    }

    public Date getRopfecmod() {
        return ropfecmod;
    }

    public void setRopfecmod(Date ropfecmod) {
        this.ropfecmod = ropfecmod;
    }

    public String getRopusumodifica() {
        return ropusumodifica;
    }

    public void setRopusumodifica(String ropusumodifica) {
        this.ropusumodifica = ropusumodifica;
    }

    public TblRaRoles getRoprolid() {
        return roprolid;
    }

    public void setRoprolid(TblRaRoles roprolid) {
        this.roprolid = roprolid;
    }

    public TblRaOpciones getRopopcid() {
        return ropopcid;
    }

    public void setRopopcid(TblRaOpciones ropopcid) {
        this.ropopcid = ropopcid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ropid != null ? ropid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblRaRolOpcion)) {
            return false;
        }
        TblRaRolOpcion other = (TblRaRolOpcion) object;
        if ((this.ropid == null && other.ropid != null) || (this.ropid != null && !this.ropid.equals(other.ropid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ra.model.TblRaRolOpcion[ ropid=" + ropid + " ]";
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
