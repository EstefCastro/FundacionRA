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
@Table(name = "tbl_RaRolUsuario")
@NamedQueries({
    @NamedQuery(name = "TblRaRolUsuario.findAll", query = "SELECT t FROM TblRaRolUsuario t")})
public class TblRaRolUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "rusid")
    private Integer rusid;
    @Basic(optional = false)
    @Column(name = "rusestado")
    private String rusestado;
    @Basic(optional = false)
    @Column(name = "rusfecing")
    @Temporal(TemporalType.DATE)
    private Date rusfecing;
    @Basic(optional = false)
    @Column(name = "rususuingreso")
    private String rususuingreso;
    @Column(name = "rusfecmod")
    @Temporal(TemporalType.DATE)
    private Date rusfecmod;
    @Column(name = "rususumodifica")
    private String rususumodifica;
    @JoinColumn(name = "rususuid", referencedColumnName = "usuid")
    @ManyToOne(optional = false)
    private TblRaUsuarios rususuid;
    @JoinColumn(name = "rusrolid", referencedColumnName = "rolid")
    @ManyToOne(optional = false)
    private TblRaRoles rusrolid;

    public TblRaRolUsuario() {
    }

    public TblRaRolUsuario(Integer rusid) {
        this.rusid = rusid;
    }

    public TblRaRolUsuario(Integer rusid, String rusestado, Date rusfecing, String rususuingreso) {
        this.rusid = rusid;
        this.rusestado = rusestado;
        this.rusfecing = rusfecing;
        this.rususuingreso = rususuingreso;
    }

    public Integer getRusid() {
        return rusid;
    }

    public void setRusid(Integer rusid) {
        this.rusid = rusid;
    }

    public String getRusestado() {
        return rusestado;
    }

    public void setRusestado(String rusestado) {
        this.rusestado = rusestado;
    }

    public Date getRusfecing() {
        return rusfecing;
    }

    public void setRusfecing(Date rusfecing) {
        this.rusfecing = rusfecing;
    }

    public String getRususuingreso() {
        return rususuingreso;
    }

    public void setRususuingreso(String rususuingreso) {
        this.rususuingreso = rususuingreso;
    }

    public Date getRusfecmod() {
        return rusfecmod;
    }

    public void setRusfecmod(Date rusfecmod) {
        this.rusfecmod = rusfecmod;
    }

    public String getRususumodifica() {
        return rususumodifica;
    }

    public void setRususumodifica(String rususumodifica) {
        this.rususumodifica = rususumodifica;
    }

    public TblRaUsuarios getRususuid() {
        return rususuid;
    }

    public void setRususuid(TblRaUsuarios rususuid) {
        this.rususuid = rususuid;
    }

    public TblRaRoles getRusrolid() {
        return rusrolid;
    }

    public void setRusrolid(TblRaRoles rusrolid) {
        this.rusrolid = rusrolid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rusid != null ? rusid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblRaRolUsuario)) {
            return false;
        }
        TblRaRolUsuario other = (TblRaRolUsuario) object;
        if ((this.rusid == null && other.rusid != null) || (this.rusid != null && !this.rusid.equals(other.rusid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ra.model.TblRaRolUsuario[ rusid=" + rusid + " ]";
    }
    
}
