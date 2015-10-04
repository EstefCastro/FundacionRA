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
@Table(name = "tbl_RaMascotas")
@NamedQueries({
    @NamedQuery(name = "TblRaMascotas.findAll", query = "SELECT t FROM TblRaMascotas t")})
public class TblRaMascotas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "masid")
    private Integer masid;
    @Basic(optional = false)
    @Column(name = "masnombre")
    private String masnombre;
    @Column(name = "massexo")
    private String massexo;
    @Column(name = "mascolor")
    private String mascolor;
    @Column(name = "masespecie")
    private String masespecie;
    @Column(name = "masraza")
    private String masraza;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "masedad")
    private Double masedad;
    @Basic(optional = false)
    @Column(name = "masestado")
    private String masestado;
    @Basic(optional = false)
    @Column(name = "masfecing")
    @Temporal(TemporalType.DATE)
    private Date masfecing;
    @Basic(optional = false)
    @Column(name = "masusuingreso")
    private String masusuingreso;
    @Column(name = "masfecmod")
    @Temporal(TemporalType.DATE)
    private Date masfecmod;
    @Column(name = "masusumodifica")
    private String masusumodifica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "adomasid")
    private List<TblRaAdopcion> tblRaAdopcionList;
    @JoinColumn(name = "masemaid", referencedColumnName = "emaid")
    @ManyToOne
    private TblRaEstMascota masemaid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "resmasid")
    private List<TblRaRescate> tblRaRescateList;

    public TblRaMascotas() {
    }

    public TblRaMascotas(Integer masid) {
        this.masid = masid;
    }

    public TblRaMascotas(Integer masid, String masnombre, String masestado, Date masfecing, String masusuingreso) {
        this.masid = masid;
        this.masnombre = masnombre;
        this.masestado = masestado;
        this.masfecing = masfecing;
        this.masusuingreso = masusuingreso;
    }

    public Integer getMasid() {
        return masid;
    }

    public void setMasid(Integer masid) {
        this.masid = masid;
    }

    public String getMasnombre() {
        return masnombre;
    }

    public void setMasnombre(String masnombre) {
        this.masnombre = masnombre;
    }

    public String getMassexo() {
        return massexo;
    }

    public void setMassexo(String massexo) {
        this.massexo = massexo;
    }

    public String getMascolor() {
        return mascolor;
    }

    public void setMascolor(String mascolor) {
        this.mascolor = mascolor;
    }

    public String getMasespecie() {
        return masespecie;
    }

    public void setMasespecie(String masespecie) {
        this.masespecie = masespecie;
    }

    public String getMasraza() {
        return masraza;
    }

    public void setMasraza(String masraza) {
        this.masraza = masraza;
    }

    public Double getMasedad() {
        return masedad;
    }

    public void setMasedad(Double masedad) {
        this.masedad = masedad;
    }

    public String getMasestado() {
        return masestado;
    }

    public void setMasestado(String masestado) {
        this.masestado = masestado;
    }

    public Date getMasfecing() {
        return masfecing;
    }

    public void setMasfecing(Date masfecing) {
        this.masfecing = masfecing;
    }

    public String getMasusuingreso() {
        return masusuingreso;
    }

    public void setMasusuingreso(String masusuingreso) {
        this.masusuingreso = masusuingreso;
    }

    public Date getMasfecmod() {
        return masfecmod;
    }

    public void setMasfecmod(Date masfecmod) {
        this.masfecmod = masfecmod;
    }

    public String getMasusumodifica() {
        return masusumodifica;
    }

    public void setMasusumodifica(String masusumodifica) {
        this.masusumodifica = masusumodifica;
    }

    public List<TblRaAdopcion> getTblRaAdopcionList() {
        return tblRaAdopcionList;
    }

    public void setTblRaAdopcionList(List<TblRaAdopcion> tblRaAdopcionList) {
        this.tblRaAdopcionList = tblRaAdopcionList;
    }

    public TblRaEstMascota getMasemaid() {
        return masemaid;
    }

    public void setMasemaid(TblRaEstMascota masemaid) {
        this.masemaid = masemaid;
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
        hash += (masid != null ? masid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblRaMascotas)) {
            return false;
        }
        TblRaMascotas other = (TblRaMascotas) object;
        if ((this.masid == null && other.masid != null) || (this.masid != null && !this.masid.equals(other.masid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ra.model.TblRaMascotas[ masid=" + masid + " ]";
    }
    
}
