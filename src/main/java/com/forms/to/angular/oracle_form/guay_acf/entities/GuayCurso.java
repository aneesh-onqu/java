package com.forms.to.angular.oracle_form.guay_acf.entities;
import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "GUAY_CURSO")
public class GuayCurso {

    @Id
    @Column(name = "CDCURSO", nullable = false, precision = 2, scale = 0)
    private Integer cdCurso;

    @Column(name = "DSCURSO", nullable = false, length = 9)
    private String dsCurso;

    @Column(name = "ACTUAL", nullable = false, length = 1)
    private String actual;

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

    // Getters and Setters

    public Integer getCdCurso() {
        return cdCurso;
    }

    public void setCdCurso(Integer cdCurso) {
        this.cdCurso = cdCurso;
    }

    public String getDsCurso() {
        return dsCurso;
    }

    public void setDsCurso(String dsCurso) {
        this.dsCurso = dsCurso;
    }

    public String getActual() {
        return actual;
    }

    public void setActual(String actual) {
        this.actual = actual;
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
}