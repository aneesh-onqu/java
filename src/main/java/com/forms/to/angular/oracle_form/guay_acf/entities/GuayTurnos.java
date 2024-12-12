package com.forms.to.angular.oracle_form.guay_acf.entities;
import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "GUAY_TURNOS")
public class GuayTurnos {

    @Id
    @Column(name = "CDTURNO", nullable = false, length = 3)
    private String cdTurno;

    @Column(name = "CDAYUDA", nullable = false, length = 4)
    private String cdAyuda;

    @Column(name = "DSTURNO", nullable = false, length = 40)
    private String dsTurno;

    @Column(name = "CDTURNO_ASOC", length = 3)
    private String cdTurnoAsoc;

    @Column(name = "IDALTA", nullable = false, length = 12)
    private String idAlta;

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

    @Column(name = "ICONSULTA_WEB", length = 1)
    private String iConsultaWeb;

    // Getters and Setters

    public String getCdTurno() {
        return cdTurno;
    }

    public void setCdTurno(String cdTurno) {
        this.cdTurno = cdTurno;
    }

    public String getCdAyuda() {
        return cdAyuda;
    }

    public void setCdAyuda(String cdAyuda) {
        this.cdAyuda = cdAyuda;
    }

    public String getDsTurno() {
        return dsTurno;
    }

    public void setDsTurno(String dsTurno) {
        this.dsTurno = dsTurno;
    }

    public String getCdTurnoAsoc() {
        return cdTurnoAsoc;
    }

    public void setCdTurnoAsoc(String cdTurnoAsoc) {
        this.cdTurnoAsoc = cdTurnoAsoc;
    }

    public String getIdAlta() {
        return idAlta;
    }

    public void setIdAlta(String idAlta) {
        this.idAlta = idAlta;
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

    public String getiConsultaWeb() {
        return iConsultaWeb;
    }

    public void setiConsultaWeb(String iConsultaWeb) {
        this.iConsultaWeb = iConsultaWeb;
    }
}







