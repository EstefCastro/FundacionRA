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
import javax.validation.constraints.Size;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "tbl_RaInfMedica")
@NamedQueries({
    @NamedQuery(name = "TblRaInfMedica.findAll", query = "SELECT t FROM TblRaInfMedica t")})
public class TblRaInfMedica implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "imeid")
    private Integer imeid;
    @Column(name = "imefecha")
    @Temporal(TemporalType.DATE)
    private Date imefecha;
    @Column(name = "imenovedad")
    private String imenovedad;
    @Column(name = "imediagnostico")
    private String imediagnostico;
    @Column(name = "imetratamiento")
    private String imetratamiento;
    @Column(name = "imeobservacion")
    private String imeobservacion;
    @Column(name = "imeestado")
    private String imeestado;
    @Column(name = "imefecing")
    @Temporal(TemporalType.DATE)
    private Date imefecing;
    @Column(name = "imeusuingreso")
    private String imeusuingreso;
    @Column(name = "imefecmod")
    @Temporal(TemporalType.DATE)
    private Date imefecmod;
    @Column(name = "imeusumodifica")
    private String imeusumodifica;
    @JoinColumn(name = "imeresid", referencedColumnName = "resid")
    @ManyToOne(optional = false)
    private TblRaRescate imeresid;

    public TblRaInfMedica() {
    }

    public TblRaInfMedica(Integer imeid) {
        this.imeid = imeid;
    }

    public Integer getImeid() {
        return imeid;
    }

    public void setImeid(Integer imeid) {
        this.imeid = imeid;
    }

    public Date getImefecha() {
        return imefecha;
    }

    public void setImefecha(Date imefecha) {
        this.imefecha = imefecha;
    }

    public String getImenovedad() {
        return imenovedad;
    }

    public void setImenovedad(String imenovedad) {
        this.imenovedad = imenovedad;
    }

    public String getImediagnostico() {
        return imediagnostico;
    }

    public void setImediagnostico(String imediagnostico) {
        this.imediagnostico = imediagnostico;
    }

    public String getImetratamiento() {
        return imetratamiento;
    }

    public void setImetratamiento(String imetratamiento) {
        this.imetratamiento = imetratamiento;
    }

    public String getImeobservacion() {
        return imeobservacion;
    }

    public void setImeobservacion(String imeobservacion) {
        this.imeobservacion = imeobservacion;
    }

    public String getImeestado() {
        return imeestado;
    }

    public void setImeestado(String imeestado) {
        this.imeestado = imeestado;
    }

    public Date getImefecing() {
        return imefecing;
    }

    public void setImefecing(Date imefecing) {
        this.imefecing = imefecing;
    }

    public String getImeusuingreso() {
        return imeusuingreso;
    }

    public void setImeusuingreso(String imeusuingreso) {
        this.imeusuingreso = imeusuingreso;
    }

    public Date getImefecmod() {
        return imefecmod;
    }

    public void setImefecmod(Date imefecmod) {
        this.imefecmod = imefecmod;
    }

    public String getImeusumodifica() {
        return imeusumodifica;
    }

    public void setImeusumodifica(String imeusumodifica) {
        this.imeusumodifica = imeusumodifica;
    }

    public TblRaRescate getImeresid() {
        return imeresid;
    }

    public void setImeresid(TblRaRescate imeresid) {
        this.imeresid = imeresid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imeid != null ? imeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblRaInfMedica)) {
            return false;
        }
        TblRaInfMedica other = (TblRaInfMedica) object;
        if ((this.imeid == null && other.imeid != null) || (this.imeid != null && !this.imeid.equals(other.imeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ra.model.TblRaInfMedica[ imeid=" + imeid + " ]";
    }
    
}
