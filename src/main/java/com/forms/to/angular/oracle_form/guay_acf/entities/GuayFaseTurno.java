package com.forms.to.angular.oracle_form.guay_acf.entities;
import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
public class GuayFaseTurno {
    @Id
    @Column(name = "CDAYUDA", nullable = false, length = 4)
    private String cdAyuda;

    @Column(name = "CDCURSO", nullable = false)
    private Integer cdCurso;

    @Column(name = "CDTURNO", nullable = false, length = 3)
    private String cdTurno;

    @Column(name = "CDFASE", length = 1)
    private String cdFase;

    @Column(name = "ESTADO", length = 1)
    private String estado;

    @Column(name = "FCALTA")
    @Temporal(TemporalType.DATE)
    private Date fcAlta;

    @Column(name = "IDMODI", length = 12)
    private String idModi;

    @Column(name = "FCMODI")
    @Temporal(TemporalType.DATE)
    private Date fcModi;

    @Column(name = "FCPLAZO_DESDE")
    @Temporal(TemporalType.DATE)
    private Date fcPlazoDesde;

    @Column(name = "FCPLAZO_HASTA")
    @Temporal(TemporalType.DATE)
    private Date fcPlazoHasta;

    @Column(name = "FCINICIO_JUST")
    @Temporal(TemporalType.DATE)
    private Date fcInicioJust;

    @Column(name = "FCFIN_JUST")
    @Temporal(TemporalType.DATE)
    private Date fcFinJust;

    @Column(name = "FCPLAZO_DESDE_R")
    @Temporal(TemporalType.DATE)
    private Date fcPlazoDesdeR;

    @Column(name = "FCPLAZO_HASTA_R")
    @Temporal(TemporalType.DATE)
    private Date fcPlazoHastaR;

    @Column(name = "FCPLAZO_DESDE_S")
    @Temporal(TemporalType.DATE)
    private Date fcPlazoDesdeS;

    @Column(name = "FCPLAZO_HASTA_S")
    @Temporal(TemporalType.DATE)
    private Date fcPlazoHastaS;

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

    public String getCdFase() {
        return cdFase;
    }

    public void setCdFase(String cdFase) {
        this.cdFase = cdFase;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public Date getFcPlazoDesde() {
        return fcPlazoDesde;
    }

    public void setFcPlazoDesde(Date fcPlazoDesde) {
        this.fcPlazoDesde = fcPlazoDesde;
    }

    public Date getFcPlazoHasta() {
        return fcPlazoHasta;
    }

    public void setFcPlazoHasta(Date fcPlazoHasta) {
        this.fcPlazoHasta = fcPlazoHasta;
    }

    public Date getFcInicioJust() {
        return fcInicioJust;
    }

    public void setFcInicioJust(Date fcInicioJust) {
        this.fcInicioJust = fcInicioJust;
    }

    public Date getFcFinJust() {
        return fcFinJust;
    }

    public void setFcFinJust(Date fcFinJust) {
        this.fcFinJust = fcFinJust;
    }

    public Date getFcPlazoDesdeR() {
        return fcPlazoDesdeR;
    }

    public void setFcPlazoDesdeR(Date fcPlazoDesdeR) {
        this.fcPlazoDesdeR = fcPlazoDesdeR;
    }

    public Date getFcPlazoHastaR() {
        return fcPlazoHastaR;
    }

    public void setFcPlazoHastaR(Date fcPlazoHastaR) {
        this.fcPlazoHastaR = fcPlazoHastaR;
    }

    public Date getFcPlazoDesdeS() {
        return fcPlazoDesdeS;
    }

    public void setFcPlazoDesdeS(Date fcPlazoDesdeS) {
        this.fcPlazoDesdeS = fcPlazoDesdeS;
    }

    public Date getFcPlazoHastaS() {
        return fcPlazoHastaS;
    }

    public void setFcPlazoHastaS(Date fcPlazoHastaS) {
        this.fcPlazoHastaS = fcPlazoHastaS;
    }
}
