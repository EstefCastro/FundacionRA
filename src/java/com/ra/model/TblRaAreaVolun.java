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
@Table(name = "tbl_RaAreaVolun")
@NamedQueries({
    @NamedQuery(name = "TblRaAreaVolun.findAll", query = "SELECT t FROM TblRaAreaVolun t")})
public class TblRaAreaVolun implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "avoid")
    private Integer avoid;
    @Basic(optional = false)
    @Column(name = "avonombre")
    private String avonombre;
    @Basic(optional = false)
    @Size(min = 1, max = 3)
    @Column(name = "avoestado")
    private String avoestado;
    @Basic(optional = false)
    @Column(name = "avofecing")
    @Temporal(TemporalType.DATE)
    private Date avofecing;
    @Basic(optional = false)
    @Column(name = "avousuingreso")
    private String avousuingreso;
    @Column(name = "avofecmod")
    @Temporal(TemporalType.DATE)
    private Date avofecmod;
    @Column(name = "avousumodifica")
    private String avousumodifica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "volavoid")
    private List<TblRaVoluntariado> tblRaVoluntariadoList;

    public TblRaAreaVolun() {
    }

    public TblRaAreaVolun(Integer avoid) {
        this.avoid = avoid;
    }

    public TblRaAreaVolun(Integer avoid, String avonombre, String avoestado, Date avofecing, String avousuingreso) {
        this.avoid = avoid;
        this.avonombre = avonombre;
        this.avoestado = avoestado;
        this.avofecing = avofecing;
        this.avousuingreso = avousuingreso;
    }

    public Integer getAvoid() {
        return avoid;
    }

    public void setAvoid(Integer avoid) {
        this.avoid = avoid;
    }

    public String getAvonombre() {
        return avonombre;
    }

    public void setAvonombre(String avonombre) {
        this.avonombre = avonombre;
    }

    public String getAvoestado() {
        return avoestado;
    }

    public void setAvoestado(String avoestado) {
        this.avoestado = avoestado;
    }

    public Date getAvofecing() {
        return avofecing;
    }

    public void setAvofecing(Date avofecing) {
        this.avofecing = avofecing;
    }

    public String getAvousuingreso() {
        return avousuingreso;
    }

    public void setAvousuingreso(String avousuingreso) {
        this.avousuingreso = avousuingreso;
    }

    public Date getAvofecmod() {
        return avofecmod;
    }

    public void setAvofecmod(Date avofecmod) {
        this.avofecmod = avofecmod;
    }

    public String getAvousumodifica() {
        return avousumodifica;
    }

    public void setAvousumodifica(String avousumodifica) {
        this.avousumodifica = avousumodifica;
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
        hash += (avoid != null ? avoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblRaAreaVolun)) {
            return false;
        }
        TblRaAreaVolun other = (TblRaAreaVolun) object;
        if ((this.avoid == null && other.avoid != null) || (this.avoid != null && !this.avoid.equals(other.avoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ra.model.TblRaAreaVolun[ avoid=" + avoid + " ]";
    }
    
}
