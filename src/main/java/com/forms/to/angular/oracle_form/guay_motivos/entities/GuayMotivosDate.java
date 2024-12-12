package com.forms.to.angular.oracle_form.guay_motivos.entities;
import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;



@Entity
public class GuayMotivosDate {
    
    @Id
    @Column(name = "CDMOTIVO", nullable = false, length = 4)
    private String cdMotivo;

    @Column(name = "IDMODI", length = 12)
    private String idModi;

    @Column(name = "FCMODI")
    @Temporal(TemporalType.DATE)
    private Date fcModi;

    @Column(name = "FCBAJA")
    @Temporal(TemporalType.DATE)
    private Date fcBaja;

    // Getters and Setters

    public String getCdMotivo() {
        return cdMotivo;
    }

    public void setCdMotivo(String cdMotivo) {
        this.cdMotivo = cdMotivo;
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

  

}


