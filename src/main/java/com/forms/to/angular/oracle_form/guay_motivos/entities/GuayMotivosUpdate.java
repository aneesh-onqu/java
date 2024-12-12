package com.forms.to.angular.oracle_form.guay_motivos.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class GuayMotivosUpdate {
    @Id
    @Column(name = "CDMOTIVO", nullable = false, length = 4)
    private String cdMotivo;

    @Column(name = "DSMOTIVO", nullable = false, length = 100)
    private String dsMotivo;

    @Column(name = "DSABMOTIVO", nullable = false, length = 30)
    private String dsAbMotivo;

    @Column(name = "TPMOTIVO", nullable = false, length = 1)
    private String tpMotivo;

   

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

    
}
