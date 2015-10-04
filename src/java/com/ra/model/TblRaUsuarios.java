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

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "tbl_RaUsuarios")
@NamedQueries({
    @NamedQuery(name = "TblRaUsuarios.findAll", query = "SELECT t FROM TblRaUsuarios t")})
public class TblRaUsuarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "usuid")
    private Integer usuid;
    @Basic(optional = false)
    @Column(name = "usunombre")
    private String usunombre;
    @Basic(optional = false)
    @Column(name = "usuclave")
    private String usuclave;
    @Basic(optional = false)
    @Column(name = "usuestado")
    private String usuestado;
    @Basic(optional = false)
    @Column(name = "usufecing")
    @Temporal(TemporalType.DATE)
    private Date usufecing;
    @Basic(optional = false)
    @Column(name = "usuingreso")
    private String usuingreso;
    @Column(name = "usufecmod")
    @Temporal(TemporalType.DATE)
    private Date usufecmod;
    @Column(name = "usumodifica")
    private String usumodifica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rususuid")
    private List<TblRaRolUsuario> tblRaRolUsuarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "perusuid")
    private List<TblRaPersona> tblRaPersonaList;

    public TblRaUsuarios() {
    }

    public TblRaUsuarios(Integer usuid) {
        this.usuid = usuid;
    }

    public TblRaUsuarios(Integer usuid, String usunombre, String usuclave, String usuestado, Date usufecing, String usuingreso) {
        this.usuid = usuid;
        this.usunombre = usunombre;
        this.usuclave = usuclave;
        this.usuestado = usuestado;
        this.usufecing = usufecing;
        this.usuingreso = usuingreso;
    }

    public Integer getUsuid() {
        return usuid;
    }

    public void setUsuid(Integer usuid) {
        this.usuid = usuid;
    }

    public String getUsunombre() {
        return usunombre;
    }

    public void setUsunombre(String usunombre) {
        this.usunombre = usunombre;
    }

    public String getUsuclave() {
        return usuclave;
    }

    public void setUsuclave(String usuclave) {
        this.usuclave = usuclave;
    }

    public String getUsuestado() {
        return usuestado;
    }

    public void setUsuestado(String usuestado) {
        this.usuestado = usuestado;
    }

    public Date getUsufecing() {
        return usufecing;
    }

    public void setUsufecing(Date usufecing) {
        this.usufecing = usufecing;
    }

    public String getUsuingreso() {
        return usuingreso;
    }

    public void setUsuingreso(String usuingreso) {
        this.usuingreso = usuingreso;
    }

    public Date getUsufecmod() {
        return usufecmod;
    }

    public void setUsufecmod(Date usufecmod) {
        this.usufecmod = usufecmod;
    }

    public String getUsumodifica() {
        return usumodifica;
    }

    public void setUsumodifica(String usumodifica) {
        this.usumodifica = usumodifica;
    }

    public List<TblRaRolUsuario> getTblRaRolUsuarioList() {
        return tblRaRolUsuarioList;
    }

    public void setTblRaRolUsuarioList(List<TblRaRolUsuario> tblRaRolUsuarioList) {
        this.tblRaRolUsuarioList = tblRaRolUsuarioList;
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
        hash += (usuid != null ? usuid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblRaUsuarios)) {
            return false;
        }
        TblRaUsuarios other = (TblRaUsuarios) object;
        if ((this.usuid == null && other.usuid != null) || (this.usuid != null && !this.usuid.equals(other.usuid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ra.model.TblRaUsuarios[ usuid=" + usuid + " ]";
    }
    
}
