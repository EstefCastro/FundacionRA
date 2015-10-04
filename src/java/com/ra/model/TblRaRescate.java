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
@Table(name = "tbl_RaRescate")
@NamedQueries({
    @NamedQuery(name = "TblRaRescate.findAll", query = "SELECT t FROM TblRaRescate t")})
public class TblRaRescate implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "resid")
    private Integer resid;
    @Column(name = "resfecha")
    @Temporal(TemporalType.DATE)
    private Date resfecha;
    @Column(name = "restvt")
    private String restvt;
    @Column(name = "rescortes")
    private String rescortes;
    @Column(name = "resgusanera")
    private String resgusanera;
    @Column(name = "resgarrapata")
    private String resgarrapata;
    @Column(name = "resprobpiel")
    private String resprobpiel;
    @Column(name = "resotros")
    private String resotros;
    @Column(name = "resdirencon")
    private String resdirencon;
    @Column(name = "rescondicion")
    private String rescondicion;
    @Column(name = "resobservacion")
    private String resobservacion;
    @Column(name = "resexamenes")
    private String resexamenes;
    @Column(name = "resdiagnostico")
    private String resdiagnostico;
    @Column(name = "restratamiento")
    private String restratamiento;
    @Column(name = "restiempo")
    private String restiempo;
    @Column(name = "resvetobserv")
    private String resvetobserv;
    @Basic(optional = false)
    @Column(name = "resestado")
    private String resestado;
    @Basic(optional = false)
    @Column(name = "resfecing")
    @Temporal(TemporalType.DATE)
    private Date resfecing;
    @Basic(optional = false)
    @Column(name = "resusuingreso")
    private String resusuingreso;
    @Column(name = "resfecmod")
    @Temporal(TemporalType.DATE)
    private Date resfecmod;
    @Column(name = "resusumodifica")
    private String resusumodifica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hteresid")
    private List<TblRaHogarTemp> tblRaHogarTempList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "imeresid")
    private List<TblRaInfMedica> tblRaInfMedicaList;
    @JoinColumn(name = "resvolid", referencedColumnName = "volid")
    @ManyToOne(optional = false)
    private TblRaVoluntariado resvolid;
    @JoinColumn(name = "resveterinaria", referencedColumnName = "perid")
    @ManyToOne(optional = false)
    private TblRaPersona resveterinaria;
    @JoinColumn(name = "resmasid", referencedColumnName = "masid")
    @ManyToOne(optional = false)
    private TblRaMascotas resmasid;

    public TblRaRescate() {
    }

    public TblRaRescate(Integer resid) {
        this.resid = resid;
    }

    public TblRaRescate(Integer resid, String resestado, Date resfecing, String resusuingreso) {
        this.resid = resid;
        this.resestado = resestado;
        this.resfecing = resfecing;
        this.resusuingreso = resusuingreso;
    }

    public Integer getResid() {
        return resid;
    }

    public void setResid(Integer resid) {
        this.resid = resid;
    }

    public Date getResfecha() {
        return resfecha;
    }

    public void setResfecha(Date resfecha) {
        this.resfecha = resfecha;
    }

    public String getRestvt() {
        return restvt;
    }

    public void setRestvt(String restvt) {
        this.restvt = restvt;
    }

    public String getRescortes() {
        return rescortes;
    }

    public void setRescortes(String rescortes) {
        this.rescortes = rescortes;
    }

    public String getResgusanera() {
        return resgusanera;
    }

    public void setResgusanera(String resgusanera) {
        this.resgusanera = resgusanera;
    }

    public String getResgarrapata() {
        return resgarrapata;
    }

    public void setResgarrapata(String resgarrapata) {
        this.resgarrapata = resgarrapata;
    }

    public String getResprobpiel() {
        return resprobpiel;
    }

    public void setResprobpiel(String resprobpiel) {
        this.resprobpiel = resprobpiel;
    }

    public String getResotros() {
        return resotros;
    }

    public void setResotros(String resotros) {
        this.resotros = resotros;
    }

    public String getResdirencon() {
        return resdirencon;
    }

    public void setResdirencon(String resdirencon) {
        this.resdirencon = resdirencon;
    }

    public String getRescondicion() {
        return rescondicion;
    }

    public void setRescondicion(String rescondicion) {
        this.rescondicion = rescondicion;
    }

    public String getResobservacion() {
        return resobservacion;
    }

    public void setResobservacion(String resobservacion) {
        this.resobservacion = resobservacion;
    }

    public String getResexamenes() {
        return resexamenes;
    }

    public void setResexamenes(String resexamenes) {
        this.resexamenes = resexamenes;
    }

    public String getResdiagnostico() {
        return resdiagnostico;
    }

    public void setResdiagnostico(String resdiagnostico) {
        this.resdiagnostico = resdiagnostico;
    }

    public String getRestratamiento() {
        return restratamiento;
    }

    public void setRestratamiento(String restratamiento) {
        this.restratamiento = restratamiento;
    }

    public String getRestiempo() {
        return restiempo;
    }

    public void setRestiempo(String restiempo) {
        this.restiempo = restiempo;
    }

    public String getResvetobserv() {
        return resvetobserv;
    }

    public void setResvetobserv(String resvetobserv) {
        this.resvetobserv = resvetobserv;
    }

    public String getResestado() {
        return resestado;
    }

    public void setResestado(String resestado) {
        this.resestado = resestado;
    }

    public Date getResfecing() {
        return resfecing;
    }

    public void setResfecing(Date resfecing) {
        this.resfecing = resfecing;
    }

    public String getResusuingreso() {
        return resusuingreso;
    }

    public void setResusuingreso(String resusuingreso) {
        this.resusuingreso = resusuingreso;
    }

    public Date getResfecmod() {
        return resfecmod;
    }

    public void setResfecmod(Date resfecmod) {
        this.resfecmod = resfecmod;
    }

    public String getResusumodifica() {
        return resusumodifica;
    }

    public void setResusumodifica(String resusumodifica) {
        this.resusumodifica = resusumodifica;
    }

    public List<TblRaHogarTemp> getTblRaHogarTempList() {
        return tblRaHogarTempList;
    }

    public void setTblRaHogarTempList(List<TblRaHogarTemp> tblRaHogarTempList) {
        this.tblRaHogarTempList = tblRaHogarTempList;
    }

    public List<TblRaInfMedica> getTblRaInfMedicaList() {
        return tblRaInfMedicaList;
    }

    public void setTblRaInfMedicaList(List<TblRaInfMedica> tblRaInfMedicaList) {
        this.tblRaInfMedicaList = tblRaInfMedicaList;
    }

    public TblRaVoluntariado getResvolid() {
        return resvolid;
    }

    public void setResvolid(TblRaVoluntariado resvolid) {
        this.resvolid = resvolid;
    }

    public TblRaPersona getResveterinaria() {
        return resveterinaria;
    }

    public void setResveterinaria(TblRaPersona resveterinaria) {
        this.resveterinaria = resveterinaria;
    }

    public TblRaMascotas getResmasid() {
        return resmasid;
    }

    public void setResmasid(TblRaMascotas resmasid) {
        this.resmasid = resmasid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (resid != null ? resid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblRaRescate)) {
            return false;
        }
        TblRaRescate other = (TblRaRescate) object;
        if ((this.resid == null && other.resid != null) || (this.resid != null && !this.resid.equals(other.resid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ra.model.TblRaRescate[ resid=" + resid + " ]";
    }
    
}
