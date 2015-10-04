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
@Table(name = "tbl_RaTipoFuncion")
@NamedQueries({
    @NamedQuery(name = "TblRaTipoFuncion.findAll", query = "SELECT t FROM TblRaTipoFuncion t")})
public class TblRaTipoFuncion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tfuid")
    private Integer tfuid;
    @Basic(optional = false)
    @Column(name = "tfunombre")
    private String tfunombre;
    @Basic(optional = false)
    @Column(name = "tfuestado")
    private String tfuestado;
    @Basic(optional = false)
    @Column(name = "tfufecing")
    @Temporal(TemporalType.DATE)
    private Date tfufecing;
    @Basic(optional = false)
    @Column(name = "tfuusuingreso")
    private String tfuusuingreso;
    @Column(name = "tfufecmod")
    @Temporal(TemporalType.DATE)
    private Date tfufecmod;
    @Column(name = "tfuusumodifica")
    private String tfuusumodifica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pertfuid")
    private List<TblRaPersona> tblRaPersonaList;

    public TblRaTipoFuncion() {
    }

    public TblRaTipoFuncion(Integer tfuid) {
        this.tfuid = tfuid;
    }

    public TblRaTipoFuncion(Integer tfuid, String tfunombre, String tfuestado, Date tfufecing, String tfuusuingreso) {
        this.tfuid = tfuid;
        this.tfunombre = tfunombre;
        this.tfuestado = tfuestado;
        this.tfufecing = tfufecing;
        this.tfuusuingreso = tfuusuingreso;
    }

    public Integer getTfuid() {
        return tfuid;
    }

    public void setTfuid(Integer tfuid) {
        this.tfuid = tfuid;
    }

    public String getTfunombre() {
        return tfunombre;
    }

    public void setTfunombre(String tfunombre) {
        this.tfunombre = tfunombre;
    }

    public String getTfuestado() {
        return tfuestado;
    }

    public void setTfuestado(String tfuestado) {
        this.tfuestado = tfuestado;
    }

    public Date getTfufecing() {
        return tfufecing;
    }

    public void setTfufecing(Date tfufecing) {
        this.tfufecing = tfufecing;
    }

    public String getTfuusuingreso() {
        return tfuusuingreso;
    }

    public void setTfuusuingreso(String tfuusuingreso) {
        this.tfuusuingreso = tfuusuingreso;
    }

    public Date getTfufecmod() {
        return tfufecmod;
    }

    public void setTfufecmod(Date tfufecmod) {
        this.tfufecmod = tfufecmod;
    }

    public String getTfuusumodifica() {
        return tfuusumodifica;
    }

    public void setTfuusumodifica(String tfuusumodifica) {
        this.tfuusumodifica = tfuusumodifica;
    }

    public List<TblRaPersona> getTblRaPersonaList() {
        return tblRaPersonaList;
    }

    public void setTblRaPersonaList(List<TblRaPersona> tblRaPersonaList) {
        this.tblRaPersonaList = tblRaPersonaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tfuid != null ? tfuid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblRaTipoFuncion)) {
            return false;
        }
        TblRaTipoFuncion other = (TblRaTipoFuncion) object;
        if ((this.tfuid == null && other.tfuid != null) || (this.tfuid != null && !this.tfuid.equals(other.tfuid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ra.model.TblRaTipoFuncion[ tfuid=" + tfuid + " ]";
    }
    
}
