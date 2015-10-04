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
@Table(name = "tbl_RaRoles")
@NamedQueries({
    @NamedQuery(name = "TblRaRoles.findAll", query = "SELECT t FROM TblRaRoles t")})
public class TblRaRoles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "rolid")
    private Integer rolid;
    @Basic(optional = false)
    @Column(name = "rolnombre")
    private String rolnombre;
    @Basic(optional = false)
    @Column(name = "rolestado")
    private String rolestado;
    @Basic(optional = false)
    @Column(name = "rolfecing")
    @Temporal(TemporalType.DATE)
    private Date rolfecing;
    @Basic(optional = false)
    @Column(name = "rolusuingreso")
    private String rolusuingreso;
    @Column(name = "rolfecmod")
    @Temporal(TemporalType.DATE)
    private Date rolfecmod;
    @Column(name = "rolusumodifica")
    private String rolusumodifica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rusrolid")
    private List<TblRaRolUsuario> tblRaRolUsuarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roprolid")
    private List<TblRaRolOpcion> tblRaRolOpcionList;

    public TblRaRoles() {
    }

    public TblRaRoles(Integer rolid) {
        this.rolid = rolid;
    }

    public TblRaRoles(Integer rolid, String rolnombre, String rolestado, Date rolfecing, String rolusuingreso) {
        this.rolid = rolid;
        this.rolnombre = rolnombre;
        this.rolestado = rolestado;
        this.rolfecing = rolfecing;
        this.rolusuingreso = rolusuingreso;
    }

    public Integer getRolid() {
        return rolid;
    }

    public void setRolid(Integer rolid) {
        this.rolid = rolid;
    }

    public String getRolnombre() {
        return rolnombre;
    }

    public void setRolnombre(String rolnombre) {
        this.rolnombre = rolnombre;
    }

    public String getRolestado() {
        return rolestado;
    }

    public void setRolestado(String rolestado) {
        this.rolestado = rolestado;
    }

    public Date getRolfecing() {
        return rolfecing;
    }

    public void setRolfecing(Date rolfecing) {
        this.rolfecing = rolfecing;
    }

    public String getRolusuingreso() {
        return rolusuingreso;
    }

    public void setRolusuingreso(String rolusuingreso) {
        this.rolusuingreso = rolusuingreso;
    }

    public Date getRolfecmod() {
        return rolfecmod;
    }

    public void setRolfecmod(Date rolfecmod) {
        this.rolfecmod = rolfecmod;
    }

    public String getRolusumodifica() {
        return rolusumodifica;
    }

    public void setRolusumodifica(String rolusumodifica) {
        this.rolusumodifica = rolusumodifica;
    }

    public List<TblRaRolUsuario> getTblRaRolUsuarioList() {
        return tblRaRolUsuarioList;
    }

    public void setTblRaRolUsuarioList(List<TblRaRolUsuario> tblRaRolUsuarioList) {
        this.tblRaRolUsuarioList = tblRaRolUsuarioList;
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
        hash += (rolid != null ? rolid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblRaRoles)) {
            return false;
        }
        TblRaRoles other = (TblRaRoles) object;
        if ((this.rolid == null && other.rolid != null) || (this.rolid != null && !this.rolid.equals(other.rolid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ra.model.TblRaRoles[ rolid=" + rolid + " ]";
    }
    
}
