package com.forms.to.angular.oracle_form.guay_motivos.entities;
import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;



@Entity
public class GuayMotivos {
    
    @Id
    @Column(name = "CDMOTIVO", nullable = false, length = 4)
    private String cdMotivo;

    @Column(name = "DSMOTIVO", nullable = false, length = 100)
    private String dsMotivo;

    @Column(name = "DSABMOTIVO", nullable = false, length = 30)
    private String dsAbMotivo;

    @Column(name = "TPMOTIVO", nullable = false, length = 1)
    private String tpMotivo;

    @Column(name = "IDALTA", nullable = false, length = 12)
    private String idAlta;

    @Column(name = "FCALTA", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fcAlta;

    @Column(name = "IDMODI", length = 12)
    private String idModi;

    @Column(name = "FCMODI")
    @Temporal(TemporalType.DATE)
    private Date fcModi;

    @Column(name = "FCBAJA")
    @Temporal(TemporalType.DATE)
    private Date fcBaja;

    @Column(name = "CL_SUBSANACIONES", length = 4000)
    private String clSubsanaciones;

    // Getters and Setters

    public String getCdMotivo() {
        return cdMotivo;
    }

    public void setCdMotivo(String cdMotivo) {
        this.cdMotivo = cdMotivo;
    }

    public String getDsMotivo() {
        return dsMotivo;
    }

    public void setDsMotivo(String dsMotivo) {
        this.dsMotivo = dsMotivo;
    }

    public String getDsAbMotivo() {
        return dsAbMotivo;
    }

    public void setDsAbMotivo(String dsAbMotivo) {
        this.dsAbMotivo = dsAbMotivo;
    }

    public String getTpMotivo() {
        return tpMotivo;
    }

    public void setTpMotivo(String tpMotivo) {
        this.tpMotivo = tpMotivo;
    }

    public String getIdAlta() {
        return idAlta;
    }

    public void setIdAlta(String idAlta) {
        this.idAlta = idAlta;
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

    public Date getFcBaja() {
        return fcBaja;
    }

    public void setFcBaja(Date fcBaja) {
        this.fcBaja = fcBaja;
    }

    public String getClSubsanaciones() {
        return clSubsanaciones;
    }

    public void setClSubsanaciones(String clSubsanaciones) {
        this.clSubsanaciones = clSubsanaciones;
    }

}
