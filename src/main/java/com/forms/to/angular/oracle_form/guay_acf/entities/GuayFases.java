package com.forms.to.angular.oracle_form.guay_acf.entities;
import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class GuayFases {
    @Id
    @Column(name = "CDFASE", nullable = false, length = 1)
    private String cdFase;

    @Column(name = "DSFASE", nullable = false, length = 20)
    private String dsFase;

    // Getters and Setters
    public String getCdFase() {
        return cdFase;
    }

    public void setCdFase(String cdFase) {
        this.cdFase = cdFase;
    }

    public String getDsFase() {
        return dsFase;
    }

    public void setDsFase(String dsFase) {
        this.dsFase = dsFase;
    }
}
