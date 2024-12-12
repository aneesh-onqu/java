package com.forms.to.angular.oracle_form.guay_acf.entities;
import java.sql.Date;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
@Table(name = "GUAY_RES_TURNO")
public class GuayResTurno {
    @Id
    @Column(name = "CDAYUDA", nullable = false, length = 4)
    private String cdAyuda;

    @Column(name = "CDCURSO", nullable = false)
    private Integer cdCurso;

    @Column(name = "CDTURNO", nullable = false, length = 3)
    private String cdTurno;

    @Column(name = "CDTPRES", nullable = false, length = 1)
    private String cdTPres;

    @Column(name = "NMRESOLUCION", length = 4)
    private String nmResolucion;

    @Column(name = "FCRESOLUCION")
    private Date fcResolucion;

    @Column(name = "IDALTA", nullable = false, length = 12)
    private String idAlta;

    @Column(name = "FCPUBLICACION")
    private Date fcPublicacion;

    @Column(name = "FCALTA", nullable = false)
    private Date fcAlta;

    @Column(name = "IDMODI", length = 12)
    private String idModi;

    @Column(name = "FCMODI")
    private Date fcModi;

    @Column(name = "FCAPROBACION")
    private Date fcAprobacion;

    @Column(name = "FCDESDE_ERROR_HECHO")
    private Date fcDesdeErrorHecho;

    @Column(name = "FCHASTA_ERROR_HECHO")
    private Date fcHastaErrorHecho;

    @Column(name = "PUNTOS")
    private Double puntos;

    @Column(name = "NMSOLICITUDES")
    private Integer nmSolicitudes;

    @Column(name = "NMPETICION")
    private Integer nmPeticion;

    @Column(name = "FCGENERACION")
    private Date fcGeneracion;

    // Getters and Setters

    public String getCdAyuda() {
        return cdAyuda;
    }

    public void setCdAyuda(String cdAyuda) {
        this.cdAyuda = cdAyuda;
    }

    public Integer getCdCurso() {
        return cdCurso;
    }

    public void setCdCurso(Integer cdCurso) {
        this.cdCurso = cdCurso;
    }

    public String getCdTurno() {
        return cdTurno;
    }

    public void setCdTurno(String cdTurno) {
        this.cdTurno = cdTurno;
    }

    public String getCdTPres() {
        return cdTPres;
    }

    public void setCdTPres(String cdTPres) {
        this.cdTPres = cdTPres;
    }

    public String getNmResolucion() {
        return nmResolucion;
    }

    public void setNmResolucion(String nmResolucion) {
        this.nmResolucion = nmResolucion;
    }

    public Date getFcResolucion() {
        return fcResolucion;
    }

    public void setFcResolucion(Date fcResolucion) {
        this.fcResolucion = fcResolucion;
    }

    public String getIdAlta() {
        return idAlta;
    }

    public void setIdAlta(String idAlta) {
        this.idAlta = idAlta;
    }

    public Date getFcPublicacion() {
        return fcPublicacion;
    }

    public void setFcPublicacion(Date fcPublicacion) {
        this.fcPublicacion = fcPublicacion;
    }

    public Date getFcAlta() {
        return fcAlta;
    }

    public void setFcAlta(Date fcAlta) {
        this.fcAlta = fcAlta;
    }

    public String getIdModi() {
        return idModi;
    }

    public void setIdModi(String idModi) {
        this.idModi = idModi;
    }

    public Date getFcModi() {
        return fcModi;
    }

    public void setFcModi(Date fcModi) {
        this.fcModi = fcModi;
    }

    public Date getFcAprobacion() {
        return fcAprobacion;
    }

    public void setFcAprobacion(Date fcAprobacion) {
        this.fcAprobacion = fcAprobacion;
    }

    public Date getFcDesdeErrorHecho() {
        return fcDesdeErrorHecho;
    }

    public void setFcDesdeErrorHecho(Date fcDesdeErrorHecho) {
        this.fcDesdeErrorHecho = fcDesdeErrorHecho;
    }

    public Date getFcHastaErrorHecho() {
        return fcHastaErrorHecho;
    }

    public void setFcHastaErrorHecho(Date fcHastaErrorHecho) {
        this.fcHastaErrorHecho = fcHastaErrorHecho;
    }

    public Double getPuntos() {
        return puntos;
    }

    public void setPuntos(Double puntos) {
        this.puntos = puntos;
    }

    public Integer getNmSolicitudes() {
        return nmSolicitudes;
    }

    public void setNmSolicitudes(Integer nmSolicitudes) {
        this.nmSolicitudes = nmSolicitudes;
    }

    public Integer getNmPeticion() {
        return nmPeticion;
    }

    public void setNmPeticion(Integer nmPeticion) {
        this.nmPeticion = nmPeticion;
    }

    public Date getFcGeneracion() {
        return fcGeneracion;
    }

    public void setFcGeneracion(Date fcGeneracion) {
        this.fcGeneracion = fcGeneracion;
    }
}
