package com.forms.to.angular.oracle_form.guay_acf.entities;
import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class GuayResDat {


    @Id
    @Column(name = "CDAYUDA", nullable = false, length = 4)
    private String cdAyuda;

    @Column(name = "CDCURSO", nullable = false)
    private Integer cdCurso;

    @Column(name = "CDTURNO", nullable = false, length = 3)
    private String cdTurno;

    @Column(name = "CDTPRES", nullable = false, length = 1)
    private String cdTPres;

    @Column(name = "CDSUBDIR", nullable = false, length = 1)
    private String cdSubDir;

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

    @Column(name = "ITCONSULTA_WEB", length = 1)
    private String itConsultaWeb;

    @Column(name = "ITGENERADA", length = 1)
    private String itGenerada;

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

    public String getCdSubDir() {
        return cdSubDir;
    }

    public void setCdSubDir(String cdSubDir) {
        this.cdSubDir = cdSubDir;
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

    public String getItConsultaWeb() {
        return itConsultaWeb;
    }

    public void setItConsultaWeb(String itConsultaWeb) {
        this.itConsultaWeb = itConsultaWeb;
    }

    public String getItGenerada() {
        return itGenerada;
    }

    public void setItGenerada(String itGenerada) {
        this.itGenerada = itGenerada;
    }
}


