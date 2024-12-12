package com.forms.to.angular.oracle_form.guay_acf.entities;

import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "GUAY_TPAYUDA")
public class GuayAyuda {

    @Id
    @Column(name = "CDAYUDA", nullable = false, length = 4)
    private String cdAyuda;

    @Column(name = "CDTPDIS", nullable = false, length = 4)
    private String cdTpDis;

    @Column(name = "DSAYUDA", nullable = false, length = 100)
    private String dsAyuda;

    @Column(name = "IDALTA", nullable = false, length = 12)
    private String idAlta;

    @Column(name = "TICONTROL_FASE", nullable = false, length = 1)
    private String TiControlFase;

    @Column(name = "FCALTA", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fCalta;

    @Column(name = "IDMODI", length = 12)
    private String idModi;

    @Column(name = "FCMODI")
    @Temporal(TemporalType.DATE)
    private Date fCModi;

    @Column(name = "FCBAJA")
    @Temporal(TemporalType.DATE)
    private Date fCbaja;

    @Column(name = "CDCURSO", precision = 2, scale = 0)
    private Double cdCurso;

    @Column(name = "ITCONSULTA_WEB", length = 1)
    private String iTConsultaWeb;

    @Column(name = "ITDESGLOSEINF", length = 1)
    private String iTDesgloseInf;

    // Getters and Setters

    public String getCdAyuda() {
        return cdAyuda;
    }

    public void setCdAyuda(String cdAyuda) {
        this.cdAyuda = cdAyuda;
    }

    public String getCdTpDis() {
        return cdTpDis;
    }

    public void setCdTpDis(String cdTpDis) {
        this.cdTpDis = cdTpDis;
    }

    public String getDsAyuda() {
        return dsAyuda;
    }

    public void setDsAyuda(String dsAyuda) {
        this.dsAyuda = dsAyuda;
    }

    public String getIdAlta() {
        return idAlta;
    }

    public void setIdAlta(String idAlta) {
        this.idAlta = idAlta;
    }

    public String getTiControlFase() {
        return TiControlFase;
    }

    public void setTiControlFase(String TiControlFase) {
        this.TiControlFase = TiControlFase;
    }

    public Date getfCalta() {
        return fCalta;
    }

    public void setfCalta(Date fCalta) {
        this.fCalta = fCalta;
    }

    public String getIdModi() {
        return idModi;
    }

    public void setIdModi(String idModi) {
        this.idModi = idModi;
    }

    public Date getfCModi() {
        return fCModi;
    }

    public void setfCModi(Date fCModi) {
        this.fCModi = fCModi;
    }

    public Date getfCbaja() {
        return fCbaja;
    }

    public void setfCbaja(Date fCbaja) {
        this.fCbaja = fCbaja;
    }

    public Double getCdCurso() {
        return cdCurso;
    }

    public void setCdCurso(Double cdCurso) {
        this.cdCurso = cdCurso;
    }

    public String getiTConsultaWeb() {
        return iTConsultaWeb;
    }

    public void setiTConsultaWeb(String iTConsultaWeb) {
        this.iTConsultaWeb = iTConsultaWeb;
    }

    public String getiTDesgloseInf() {
        return iTDesgloseInf;
    }

    public void setiTDesgloseInf(String iTDesgloseInf) {
        this.iTDesgloseInf = iTDesgloseInf;
    }
}



