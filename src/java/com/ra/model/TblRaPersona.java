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
@Table(name = "tbl_RaPersona")
@NamedQueries({
    @NamedQuery(name = "TblRaPersona.findAll", query = "SELECT t FROM TblRaPersona t")})
public class TblRaPersona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "perid")
    private Integer perid;
    @Basic(optional = false)
    @Column(name = "pernombres")
    private String pernombres;
    @Basic(optional = false)
    @Column(name = "perapellidos")
    private String perapellidos;
    @Column(name = "percedula")
    private Integer percedula;
    @Column(name = "perfecnac")
    @Temporal(TemporalType.DATE)
    private Date perfecnac;
    @Column(name = "pernacionalidad")
    private String pernacionalidad;
    @Column(name = "perdirdomicilio")
    private String perdirdomicilio;
    @Column(name = "perteldomicilio")
    private Integer perteldomicilio;
    @Basic(optional = false)
    @Column(name = "percorreo")
    private String percorreo;
    @Column(name = "perdirtrabajo")
    private String perdirtrabajo;
    @Column(name = "perteltrabajo")
    private Integer perteltrabajo;
    @Column(name = "pertelmovil")
    private Integer pertelmovil;
    @Column(name = "percuentatw")
    private String percuentatw;
    @Column(name = "perprofesion")
    private String perprofesion;
    @Column(name = "perlugartrab")
    private String perlugartrab;
    @Column(name = "percarrera")
    private String percarrera;
    @Column(name = "pervehiculo")
    private String pervehiculo;
    @Basic(optional = false)
    @Column(name = "perestado")
    private String perestado;
    @Basic(optional = false)
    @Column(name = "perfecing")
    @Temporal(TemporalType.DATE)
    private Date perfecing;
    @Basic(optional = false)
    @Column(name = "perusuingreso")
    private String perusuingreso;
    @Column(name = "perfecmod")
    @Temporal(TemporalType.DATE)
    private Date perfecmod;
    @Column(name = "perusumodifica")
    private String perusumodifica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "volperid")
    private List<TblRaVoluntariado> tblRaVoluntariadoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "adoperid")
    private List<TblRaAdopcion> tblRaAdopcionList;
    @JoinColumn(name = "perusuid", referencedColumnName = "usuid")
    @ManyToOne(optional = false)
    private TblRaUsuarios perusuid;
    @JoinColumn(name = "pertfuid", referencedColumnName = "tfuid")
    @ManyToOne(optional = false)
    private TblRaTipoFuncion pertfuid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "resveterinaria")
    private List<TblRaRescate> tblRaRescateList;

    public TblRaPersona() {
    }

    public TblRaPersona(Integer perid) {
        this.perid = perid;
    }

    public TblRaPersona(Integer perid, String pernombres, String perapellidos, String percorreo, String perestado, Date perfecing, String perusuingreso) {
        this.perid = perid;
        this.pernombres = pernombres;
        this.perapellidos = perapellidos;
        this.percorreo = percorreo;
        this.perestado = perestado;
        this.perfecing = perfecing;
        this.perusuingreso = perusuingreso;
    }

    public Integer getPerid() {
        return perid;
    }

    public void setPerid(Integer perid) {
        this.perid = perid;
    }

    public String getPernombres() {
        return pernombres;
    }

    public void setPernombres(String pernombres) {
        this.pernombres = pernombres;
    }

    public String getPerapellidos() {
        return perapellidos;
    }

    public void setPerapellidos(String perapellidos) {
        this.perapellidos = perapellidos;
    }

    public Integer getPercedula() {
        return percedula;
    }

    public void setPercedula(Integer percedula) {
        this.percedula = percedula;
    }

    public Date getPerfecnac() {
        return perfecnac;
    }

    public void setPerfecnac(Date perfecnac) {
        this.perfecnac = perfecnac;
    }

    public String getPernacionalidad() {
        return pernacionalidad;
    }

    public void setPernacionalidad(String pernacionalidad) {
        this.pernacionalidad = pernacionalidad;
    }

    public String getPerdirdomicilio() {
        return perdirdomicilio;
    }

    public void setPerdirdomicilio(String perdirdomicilio) {
        this.perdirdomicilio = perdirdomicilio;
    }

    public Integer getPerteldomicilio() {
        return perteldomicilio;
    }

    public void setPerteldomicilio(Integer perteldomicilio) {
        this.perteldomicilio = perteldomicilio;
    }

    public String getPercorreo() {
        return percorreo;
    }

    public void setPercorreo(String percorreo) {
        this.percorreo = percorreo;
    }

    public String getPerdirtrabajo() {
        return perdirtrabajo;
    }

    public void setPerdirtrabajo(String perdirtrabajo) {
        this.perdirtrabajo = perdirtrabajo;
    }

    public Integer getPerteltrabajo() {
        return perteltrabajo;
    }

    public void setPerteltrabajo(Integer perteltrabajo) {
        this.perteltrabajo = perteltrabajo;
    }

    public Integer getPertelmovil() {
        return pertelmovil;
    }

    public void setPertelmovil(Integer pertelmovil) {
        this.pertelmovil = pertelmovil;
    }

    public String getPercuentatw() {
        return percuentatw;
    }

    public void setPercuentatw(String percuentatw) {
        this.percuentatw = percuentatw;
    }

    public String getPerprofesion() {
        return perprofesion;
    }

    public void setPerprofesion(String perprofesion) {
        this.perprofesion = perprofesion;
    }

    public String getPerlugartrab() {
        return perlugartrab;
    }

    public void setPerlugartrab(String perlugartrab) {
        this.perlugartrab = perlugartrab;
    }

    public String getPercarrera() {
        return percarrera;
    }

    public void setPercarrera(String percarrera) {
        this.percarrera = percarrera;
    }

    public String getPervehiculo() {
        return pervehiculo;
    }

    public void setPervehiculo(String pervehiculo) {
        this.pervehiculo = pervehiculo;
    }

    public String getPerestado() {
        return perestado;
    }

    public void setPerestado(String perestado) {
        this.perestado = perestado;
    }

    public Date getPerfecing() {
        return perfecing;
    }

    public void setPerfecing(Date perfecing) {
        this.perfecing = perfecing;
    }

    public String getPerusuingreso() {
        return perusuingreso;
    }

    public void setPerusuingreso(String perusuingreso) {
        this.perusuingreso = perusuingreso;
    }

    public Date getPerfecmod() {
        return perfecmod;
    }

    public void setPerfecmod(Date perfecmod) {
        this.perfecmod = perfecmod;
    }

    public String getPerusumodifica() {
        return perusumodifica;
    }

    public void setPerusumodifica(String perusumodifica) {
        this.perusumodifica = perusumodifica;
    }

    public List<TblRaVoluntariado> getTblRaVoluntariadoList() {
        return tblRaVoluntariadoList;
    }

    public void setTblRaVoluntariadoList(List<TblRaVoluntariado> tblRaVoluntariadoList) {
        this.tblRaVoluntariadoList = tblRaVoluntariadoList;
    }

    public List<TblRaAdopcion> getTblRaAdopcionList() {
        return tblRaAdopcionList;
    }

    public void setTblRaAdopcionList(List<TblRaAdopcion> tblRaAdopcionList) {
        this.tblRaAdopcionList = tblRaAdopcionList;
    }

    public TblRaUsuarios getPerusuid() {
        return perusuid;
    }

    public void setPerusuid(TblRaUsuarios perusuid) {
        this.perusuid = perusuid;
    }

    public TblRaTipoFuncion getPertfuid() {
        return pertfuid;
    }

    public void setPertfuid(TblRaTipoFuncion pertfuid) {
        this.pertfuid = pertfuid;
    }

    public List<TblRaRescate> getTblRaRescateList() {
        return tblRaRescateList;
    }

    public void setTblRaRescateList(List<TblRaRescate> tblRaRescateList) {
        this.tblRaRescateList = tblRaRescateList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (perid != null ? perid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblRaPersona)) {
            return false;
        }
        TblRaPersona other = (TblRaPersona) object;
        if ((this.perid == null && other.perid != null) || (this.perid != null && !this.perid.equals(other.perid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ra.model.TblRaPersona[ perid=" + perid + " ]";
    }
    
}
