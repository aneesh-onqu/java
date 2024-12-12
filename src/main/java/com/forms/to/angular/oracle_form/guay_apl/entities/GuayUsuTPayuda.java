package com.forms.to.angular.oracle_form.guay_apl.entities;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "GUAY_USU_TPAYUDA")
public class GuayUsuTPayuda {
    
    @Id
    @Column(name = "COD_USUARIO", nullable = false, length = 12)
    private String codUsuario;

    @Column(name = "CDAYUDA", nullable = false, length = 4)
    private String cdayuda;

    @Column(name = "IDALTA", nullable = false, length = 12)
    private String idAlta;

    @Column(name = "FCALTA", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fcAlta;

    @Column(name = "FCBAJA")
    @Temporal(TemporalType.DATE)
    private Date fcBaja;

    @Column(name = "GRUPO_PERFIL", nullable = false)
    private Integer grupoPerfil;

    @Column(name = "ITPERMISO", nullable = false, length = 1)
    private String itPermiso;

    // Getters and Setters
    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getCdayuda() {
        return cdayuda;
    }

    public void setCdayuda(String cdayuda) {
        this.cdayuda = cdayuda;
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

    public Date getFcBaja() {
        return fcBaja;
    }

    public void setFcBaja(Date fcBaja) {
        this.fcBaja = fcBaja;
    }

    public Integer getGrupoPerfil() {
        return grupoPerfil;
    }

    public void setGrupoPerfil(Integer grupoPerfil) {
        this.grupoPerfil = grupoPerfil;
    }

    public String getItPermiso() {
        return itPermiso;
    }

    public void setItPermiso(String itPermiso) {
        this.itPermiso = itPermiso;
    }
}
