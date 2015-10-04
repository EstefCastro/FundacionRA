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
@Table(name = "tbl_RaAdopcion")
@NamedQueries({
    @NamedQuery(name = "TblRaAdopcion.findAll", query = "SELECT t FROM TblRaAdopcion t")})
public class TblRaAdopcion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "adoid")
    private Integer adoid;
    @Column(name = "adomasnomb")
    private String adomasnomb;
    @Column(name = "adomasespecie")
    private String adomasespecie;
    @Column(name = "adomasgenero")
    private String adomasgenero;
    @Column(name = "adomastamanio")
    private String adomastamanio;
    @Column(name = "adohabitantes")
    private Integer adohabitantes;
    @Column(name = "adoexperiencia")
    private String adoexperiencia;
    @Column(name = "adodetalleexp")
    private String adodetalleexp;
    @Column(name = "adoasma")
    private String adoasma;
    @Column(name = "adoembarazo")
    private String adoembarazo;
    @Column(name = "adodetallecaso")
    private String adodetallecaso;
    @Column(name = "adogastos")
    private String adogastos;
    @Column(name = "adoanterior")
    private String adoanterior;
    @Column(name = "adodeacuerdo")
    private String adodeacuerdo;
    @Column(name = "adovivienda")
    private String adovivienda;
    @Column(name = "adopertvivienda")
    private String adopertvivienda;
    @Column(name = "adopatio")
    private String adopatio;
    @Column(name = "adoplanmudanza")
    private String adoplanmudanza;
    @Column(name = "adomasant")
    private String adomasant;
    @Column(name = "adomasact")
    private String adomasact;
    @Column(name = "adomasactnum")
    private Integer adomasactnum;
    @Column(name = "adomasenferma")
    private String adomasenferma;
    @Column(name = "adomasmotivo")
    private String adomasmotivo;
    @Size(max = 45)
    @Column(name = "adomasviaje")
    private String adomasviaje;
    @Column(name = "adomasalimento")
    private String adomasalimento;
    @Column(name = "adotoxoplasmosis")
    private String adotoxoplasmosis;
    @Column(name = "adomasfallecido")
    private String adomasfallecido;
    @Column(name = "adoesterilizacion")
    private String adoesterilizacion;
    @Column(name = "adoreferencia")
    private String adoreferencia;
    @Basic(optional = false)
    @Column(name = "adoestado")
    private String adoestado;
    @Basic(optional = false)
    @Column(name = "adofecing")
    @Temporal(TemporalType.DATE)
    private Date adofecing;
    @Basic(optional = false)
    @Column(name = "adousuingreso")
    private String adousuingreso;
    @Column(name = "adofecmod")
    @Temporal(TemporalType.DATE)
    private Date adofecmod;
    @Column(name = "adousumodifica")
    private String adousumodifica;
    @JoinColumn(name = "adoperid", referencedColumnName = "perid")
    @ManyToOne(optional = false)
    private TblRaPersona adoperid;
    @JoinColumn(name = "adomasid", referencedColumnName = "masid")
    @ManyToOne(optional = false)
    private TblRaMascotas adomasid;

    public TblRaAdopcion() {
    }

    public TblRaAdopcion(Integer adoid) {
        this.adoid = adoid;
    }

    public TblRaAdopcion(Integer adoid, String adoestado, Date adofecing, String adousuingreso) {
        this.adoid = adoid;
        this.adoestado = adoestado;
        this.adofecing = adofecing;
        this.adousuingreso = adousuingreso;
    }

    public Integer getAdoid() {
        return adoid;
    }

    public void setAdoid(Integer adoid) {
        this.adoid = adoid;
    }

    public String getAdomasnomb() {
        return adomasnomb;
    }

    public void setAdomasnomb(String adomasnomb) {
        this.adomasnomb = adomasnomb;
    }

    public String getAdomasespecie() {
        return adomasespecie;
    }

    public void setAdomasespecie(String adomasespecie) {
        this.adomasespecie = adomasespecie;
    }

    public String getAdomasgenero() {
        return adomasgenero;
    }

    public void setAdomasgenero(String adomasgenero) {
        this.adomasgenero = adomasgenero;
    }

    public String getAdomastamanio() {
        return adomastamanio;
    }

    public void setAdomastamanio(String adomastamanio) {
        this.adomastamanio = adomastamanio;
    }

    public Integer getAdohabitantes() {
        return adohabitantes;
    }

    public void setAdohabitantes(Integer adohabitantes) {
        this.adohabitantes = adohabitantes;
    }

    public String getAdoexperiencia() {
        return adoexperiencia;
    }

    public void setAdoexperiencia(String adoexperiencia) {
        this.adoexperiencia = adoexperiencia;
    }

    public String getAdodetalleexp() {
        return adodetalleexp;
    }

    public void setAdodetalleexp(String adodetalleexp) {
        this.adodetalleexp = adodetalleexp;
    }

    public String getAdoasma() {
        return adoasma;
    }

    public void setAdoasma(String adoasma) {
        this.adoasma = adoasma;
    }

    public String getAdoembarazo() {
        return adoembarazo;
    }

    public void setAdoembarazo(String adoembarazo) {
        this.adoembarazo = adoembarazo;
    }

    public String getAdodetallecaso() {
        return adodetallecaso;
    }

    public void setAdodetallecaso(String adodetallecaso) {
        this.adodetallecaso = adodetallecaso;
    }

    public String getAdogastos() {
        return adogastos;
    }

    public void setAdogastos(String adogastos) {
        this.adogastos = adogastos;
    }

    public String getAdoanterior() {
        return adoanterior;
    }

    public void setAdoanterior(String adoanterior) {
        this.adoanterior = adoanterior;
    }

    public String getAdodeacuerdo() {
        return adodeacuerdo;
    }

    public void setAdodeacuerdo(String adodeacuerdo) {
        this.adodeacuerdo = adodeacuerdo;
    }

    public String getAdovivienda() {
        return adovivienda;
    }

    public void setAdovivienda(String adovivienda) {
        this.adovivienda = adovivienda;
    }

    public String getAdopertvivienda() {
        return adopertvivienda;
    }

    public void setAdopertvivienda(String adopertvivienda) {
        this.adopertvivienda = adopertvivienda;
    }

    public String getAdopatio() {
        return adopatio;
    }

    public void setAdopatio(String adopatio) {
        this.adopatio = adopatio;
    }

    public String getAdoplanmudanza() {
        return adoplanmudanza;
    }

    public void setAdoplanmudanza(String adoplanmudanza) {
        this.adoplanmudanza = adoplanmudanza;
    }

    public String getAdomasant() {
        return adomasant;
    }

    public void setAdomasant(String adomasant) {
        this.adomasant = adomasant;
    }

    public String getAdomasact() {
        return adomasact;
    }

    public void setAdomasact(String adomasact) {
        this.adomasact = adomasact;
    }

    public Integer getAdomasactnum() {
        return adomasactnum;
    }

    public void setAdomasactnum(Integer adomasactnum) {
        this.adomasactnum = adomasactnum;
    }

    public String getAdomasenferma() {
        return adomasenferma;
    }

    public void setAdomasenferma(String adomasenferma) {
        this.adomasenferma = adomasenferma;
    }

    public String getAdomasmotivo() {
        return adomasmotivo;
    }

    public void setAdomasmotivo(String adomasmotivo) {
        this.adomasmotivo = adomasmotivo;
    }

    public String getAdomasviaje() {
        return adomasviaje;
    }

    public void setAdomasviaje(String adomasviaje) {
        this.adomasviaje = adomasviaje;
    }

    public String getAdomasalimento() {
        return adomasalimento;
    }

    public void setAdomasalimento(String adomasalimento) {
        this.adomasalimento = adomasalimento;
    }

    public String getAdotoxoplasmosis() {
        return adotoxoplasmosis;
    }

    public void setAdotoxoplasmosis(String adotoxoplasmosis) {
        this.adotoxoplasmosis = adotoxoplasmosis;
    }

    public String getAdomasfallecido() {
        return adomasfallecido;
    }

    public void setAdomasfallecido(String adomasfallecido) {
        this.adomasfallecido = adomasfallecido;
    }

    public String getAdoesterilizacion() {
        return adoesterilizacion;
    }

    public void setAdoesterilizacion(String adoesterilizacion) {
        this.adoesterilizacion = adoesterilizacion;
    }

    public String getAdoreferencia() {
        return adoreferencia;
    }

    public void setAdoreferencia(String adoreferencia) {
        this.adoreferencia = adoreferencia;
    }

    public String getAdoestado() {
        return adoestado;
    }

    public void setAdoestado(String adoestado) {
        this.adoestado = adoestado;
    }

    public Date getAdofecing() {
        return adofecing;
    }

    public void setAdofecing(Date adofecing) {
        this.adofecing = adofecing;
    }

    public String getAdousuingreso() {
        return adousuingreso;
    }

    public void setAdousuingreso(String adousuingreso) {
        this.adousuingreso = adousuingreso;
    }

    public Date getAdofecmod() {
        return adofecmod;
    }

    public void setAdofecmod(Date adofecmod) {
        this.adofecmod = adofecmod;
    }

    public String getAdousumodifica() {
        return adousumodifica;
    }

    public void setAdousumodifica(String adousumodifica) {
        this.adousumodifica = adousumodifica;
    }

    public TblRaPersona getAdoperid() {
        return adoperid;
    }

    public void setAdoperid(TblRaPersona adoperid) {
        this.adoperid = adoperid;
    }

    public TblRaMascotas getAdomasid() {
        return adomasid;
    }

    public void setAdomasid(TblRaMascotas adomasid) {
        this.adomasid = adomasid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adoid != null ? adoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblRaAdopcion)) {
            return false;
        }
        TblRaAdopcion other = (TblRaAdopcion) object;
        if ((this.adoid == null && other.adoid != null) || (this.adoid != null && !this.adoid.equals(other.adoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ra.model.TblRaAdopcion[ adoid=" + adoid + " ]";
    }
    
}
