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
@Table(name = "tbl_RaHogarTemp")
@NamedQueries({
    @NamedQuery(name = "TblRaHogarTemp.findAll", query = "SELECT t FROM TblRaHogarTemp t")})
public class TblRaHogarTemp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "hteid")
    private Integer hteid;
    @Column(name = "htetelefono")
    private Integer htetelefono;
    @Column(name = "htedireccion")
    private String htedireccion;
    @Column(name = "htefechaing")
    @Temporal(TemporalType.DATE)
    private Date htefechaing;
    @Column(name = "hteobservacionres")
    private String hteobservacionres;
    @Basic(optional = false)
    @Column(name = "hteestado")
    private String hteestado;
    @Basic(optional = false)
    @Column(name = "htefecing")
    @Temporal(TemporalType.DATE)
    private Date htefecing;
    @Basic(optional = false)
    @Column(name = "hteusuingreso")
    private String hteusuingreso;
    @Column(name = "htefecmod")
    @Temporal(TemporalType.DATE)
    private Date htefecmod;
    @Column(name = "hteusumodifica")
    private String hteusumodifica;
    @JoinColumn(name = "hteresid", referencedColumnName = "resid")
    @ManyToOne(optional = false)
    private TblRaRescate hteresid;

    public TblRaHogarTemp() {
    }

    public TblRaHogarTemp(Integer hteid) {
        this.hteid = hteid;
    }

    public TblRaHogarTemp(Integer hteid, String hteestado, Date htefecing, String hteusuingreso) {
        this.hteid = hteid;
        this.hteestado = hteestado;
        this.htefecing = htefecing;
        this.hteusuingreso = hteusuingreso;
    }

    public Integer getHteid() {
        return hteid;
    }

    public void setHteid(Integer hteid) {
        this.hteid = hteid;
    }

    public Integer getHtetelefono() {
        return htetelefono;
    }

    public void setHtetelefono(Integer htetelefono) {
        this.htetelefono = htetelefono;
    }

    public String getHtedireccion() {
        return htedireccion;
    }

    public void setHtedireccion(String htedireccion) {
        this.htedireccion = htedireccion;
    }

    public Date getHtefechaing() {
        return htefechaing;
    }

    public void setHtefechaing(Date htefechaing) {
        this.htefechaing = htefechaing;
    }

    public String getHteobservacionres() {
        return hteobservacionres;
    }

    public void setHteobservacionres(String hteobservacionres) {
        this.hteobservacionres = hteobservacionres;
    }

    public String getHteestado() {
        return hteestado;
    }

    public void setHteestado(String hteestado) {
        this.hteestado = hteestado;
    }

    public Date getHtefecing() {
        return htefecing;
    }

    public void setHtefecing(Date htefecing) {
        this.htefecing = htefecing;
    }

    public String getHteusuingreso() {
        return hteusuingreso;
    }

    public void setHteusuingreso(String hteusuingreso) {
        this.hteusuingreso = hteusuingreso;
    }

    public Date getHtefecmod() {
        return htefecmod;
    }

    public void setHtefecmod(Date htefecmod) {
        this.htefecmod = htefecmod;
    }

    public String getHteusumodifica() {
        return hteusumodifica;
    }

    public void setHteusumodifica(String hteusumodifica) {
        this.hteusumodifica = hteusumodifica;
    }

    public TblRaRescate getHteresid() {
        return hteresid;
    }

    public void setHteresid(TblRaRescate hteresid) {
        this.hteresid = hteresid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hteid != null ? hteid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblRaHogarTemp)) {
            return false;
        }
        TblRaHogarTemp other = (TblRaHogarTemp) object;
        if ((this.hteid == null && other.hteid != null) || (this.hteid != null && !this.hteid.equals(other.hteid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ra.model.TblRaHogarTemp[ hteid=" + hteid + " ]";
    }
    
}
