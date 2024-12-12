package com.forms.to.angular.oracle_form.guay_acf.entities;
import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
public class GuayConvocatoria {

    @Id
    @Column(name = "CDAYUDA", nullable = false)
    private String cdAyuda;

    @Column(name = "CDCURSO", nullable = false)
    private Integer cdCurso;

    @Column(name = "CDTURNO_ACTUAL", nullable = false)
    private String cdTurnoActual;

    @Column(name = "CDTPPAGO", nullable = false)
    private String cdTpPago;

    @Column(name = "CDFASE", nullable = false)
    private String cdFase;

    @Column(name = "ESTADO", nullable = false)
    private String estado;

    @Column(name = "DSCONVO", length = 255)
    private String dsConvo;

    @Column(name = "NMORDEN")
    private Integer nmOrden;

    @Column(name = "FCORDEN")
    @Temporal(TemporalType.DATE)
    private Date fcOrden;

    @Column(name = "FCPLAZO_DESDE")
    @Temporal(TemporalType.DATE)
    private Date fcPlazoDesde;

    @Column(name = "FCBOCM")
    @Temporal(TemporalType.DATE)
    private Date fcBocm;

    @Column(name = "FCPLAZO_HASTA")
    @Temporal(TemporalType.DATE)
    private Date fcPlazoHasta;

    @Column(name = "PRESUPUESTO")
    private Double presupuesto;

    @Column(name = "FC_LIM_NORMA")
    @Temporal(TemporalType.DATE)
    private Date fcLimNorma;

    @Column(name = "AADO_A", length = 50)
    private String aadoA;

    @Column(name = "TPDO_A", length = 50)
    private String tpdoA;

    @Column(name = "IDALTA", length = 12)
    private String idAlta;

    @Column(name = "GGDO_A", length = 50)
    private String ggdoA;

    @Column(name = "FCALTA")
    @Temporal(TemporalType.DATE)
    private Date fcAlta;

    @Column(name = "NMDO_A", length = 50)
    private String nmdoA;

    @Column(name = "IDMODI", length = 12)
    private String idModi;

    @Column(name = "FCMODI")
    @Temporal(TemporalType.DATE)
    private Date fcModi;

    @Column(name = "FCBAJA")
    @Temporal(TemporalType.DATE)
    private Date fcBaja;

    @Column(name = "IMP_ADJUDIC")
    private Double impAdjudic;

    @Column(name = "MOD_MANU", length = 50)
    private String modManu;

    @Column(name = "IMP_PRIM_ANU")
    private Double impPrimAnu;

    @Column(name = "IMP_SEG_ANU")
    private Double impSegAnu;

    @Column(name = "PORCEN_SEG_PAGO")
    private Double porcenSegPago;

    @Column(name = "DD_LECTIVOS")
    private Integer ddLectivos;

    @Column(name = "PORCEN_PRIM_ANU")
    private Double porcenPrimAnu;

    @Column(name = "ITPARTES", length = 1)
    private String itPartes;

    @Column(name = "FCNAC_MAX")
    @Temporal(TemporalType.DATE)
    private Date fcnacMax;

    @Column(name = "FCTOPE_DOC")
    @Temporal(TemporalType.DATE)
    private Date fctopeDoc;

    @Column(name = "IT_TELEMATICA", length = 1)
    private String itTelematica;

    @Column(name = "FCINI_JUSTIFICACION")
    @Temporal(TemporalType.DATE)
    private Date fciniJustificacion;

    @Column(name = "FCFIN_JUSTIFICACION")
    @Temporal(TemporalType.DATE)
    private Date fcfinJustificacion;

    @Column(name = "FCPLAZO_DESDE_S")
    @Temporal(TemporalType.DATE)
    private Date fcPlazoDesdeS;

    @Column(name = "FCPLAZO_HASTA_S")
    @Temporal(TemporalType.DATE)
    private Date fcPlazoHastaS;

    @Column(name = "FCPLAZO_DESDE_R")
    @Temporal(TemporalType.DATE)
    private Date fcPlazoDesdeR;

    @Column(name = "FCPLAZO_HASTA_R")
    @Temporal(TemporalType.DATE)
    private Date fcPlazoHastaR;

    @Column(name = "FCPUBLICACION")
    @Temporal(TemporalType.DATE)
    private Date fcPublicacion;

    @Column(name = "NMORDEN_REC")
    private Integer nmOrdenRec;

    @Column(name = "FCORDEN_REC")
    @Temporal(TemporalType.DATE)
    private Date fcOrdenRec;

    @Column(name = "PUNTOS_CORTE")
    private Double puntosCorte;

    @Column(name = "RENTA_CORTE")
    private Double rentaCorte;

    @Column(name = "RECU_SEG_PAGO")
    private Double recuSegPago;

    @Column(name = "RECU_TER_PAGO")
    private Double recuTerPago;

    @Column(name = "CDCURSO_RENTA")
    private Integer cdCursoRenta;

    @Column(name = "NMPORCEN_SSM")
    private Double nmPorcenSsm;

    @Column(name = "FCINICIO_JUST")
    @Temporal(TemporalType.DATE)
    private Date fcInicioJust;

    @Column(name = "FCFIN_JUST")
    @Temporal(TemporalType.DATE)
    private Date fcFinJust;

    @Column(name = "PRECIO_COMA")
    private Double precioComa;

    @Column(name = "RENTA_MAX")
    private Double rentaMax;

    @Column(name = "IT_TELEMATICA_R", length = 1)
    private String itTelematicaR;

    @Column(name = "IT_CRUCE_DEUDAS", length = 1)
    private String itCruceDeudas;

    @Column(name = "IT_CRUCE_OBLIG_TRIB", length = 1)
    private String itCruceObligTrib;

    @Column(name = "IT_CRUCE_OBLIG_SS", length = 1)
    private String itCruceObligSs;

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

    public String getCdTurnoActual() {
        return cdTurnoActual;
    }

    public void setCdTurnoActual(String cdTurnoActual) {
        this.cdTurnoActual = cdTurnoActual;
    }

    public String getCdTpPago() {
        return cdTpPago;
    }

    public void setCdTpPago(String cdTpPago) {
        this.cdTpPago = cdTpPago;
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

    public String getDsConvo() {
        return dsConvo;
    }

    public void setDsConvo(String dsConvo) {
        this.dsConvo = dsConvo;
    }

    public Integer getNmOrden() {
        return nmOrden;
    }

    public void setNmOrden(Integer nmOrden) {
        this.nmOrden = nmOrden;
    }

    public Date getFcOrden() {
        return fcOrden;
    }

    public void setFcOrden(Date fcOrden) {
        this.fcOrden = fcOrden;
    }

    public Date getFcPlazoDesde() {
        return fcPlazoDesde;
    }

    public void setFcPlazoDesde(Date fcPlazoDesde) {
        this.fcPlazoDesde = fcPlazoDesde;
    }

    public Date getFcBocm() {
        return fcBocm;
    }

    public void setFcBocm(Date fcBocm) {
        this.fcBocm = fcBocm;
    }

    public Date getFcPlazoHasta() {
        return fcPlazoHasta;
    }

    public void setFcPlazoHasta(Date fcPlazoHasta) {
        this.fcPlazoHasta = fcPlazoHasta;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Date getFcLimNorma() {
        return fcLimNorma;
    }

    public void setFcLimNorma(Date fcLimNorma) {
        this.fcLimNorma = fcLimNorma;
    }

    public String getAadoA() {
        return aadoA;
    }

    public void setAadoA(String aadoA) {
        this.aadoA = aadoA;
    }

    public String getTpdoA() {
        return tpdoA;
    }

    public void setTpdoA(String tpdoA) {
        this.tpdoA = tpdoA;
    }

    public String getIdAlta() {
        return idAlta;
    }

    public void setIdAlta(String idAlta) {
        this.idAlta = idAlta;
    }

    public String getGgdoA() {
        return ggdoA;
    }

    public void setGgdoA(String ggdoA) {
        this.ggdoA = ggdoA;
    }

    public Date getFcAlta() {
        return fcAlta;
    }

    public void setFcAlta(Date fcAlta) {
        this.fcAlta = fcAlta;
    }

    public String getNmdoA() {
        return nmdoA;
    }

    public void setNmdoA(String nmdoA) {
        this.nmdoA = nmdoA;
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

    public Double getImpAdjudic() {
        return impAdjudic;
    }

    public void setImpAdjudic(Double impAdjudic) {
        this.impAdjudic = impAdjudic;
    }

    public String getModManu() {
        return modManu;
    }

    public void setModManu(String modManu) {
        this.modManu = modManu;
    }

    public Double getImpPrimAnu() {
        return impPrimAnu;
    }

    public void setImpPrimAnu(Double impPrimAnu) {
        this.impPrimAnu = impPrimAnu;
    }

    public Double getImpSegAnu() {
        return impSegAnu;
    }

    public void setImpSegAnu(Double impSegAnu) {
        this.impSegAnu = impSegAnu;
    }

    public Double getPorcenSegPago() {
        return porcenSegPago;
    }

    public void setPorcenSegPago(Double porcenSegPago) {
        this.porcenSegPago = porcenSegPago;
    }

    public Integer getDdLectivos() {
        return ddLectivos;
    }

    public void setDdLectivos(Integer ddLectivos) {
        this.ddLectivos = ddLectivos;
    }

    public Double getPorcenPrimAnu() {
        return porcenPrimAnu;
    }

    public void setPorcenPrimAnu(Double porcenPrimAnu) {
        this.porcenPrimAnu = porcenPrimAnu;
    }

    public String getItPartes() {
        return itPartes;
    }

    public void setItPartes(String itPartes) {
        this.itPartes = itPartes;
    }

    public Date getFcnacMax() {
        return fcnacMax;
    }

    public void setFcnacMax(Date fcnacMax) {
        this.fcnacMax = fcnacMax;
    }

    public Date getFctopeDoc() {
        return fctopeDoc;
    }

    public void setFctopeDoc(Date fctopeDoc) {
        this.fctopeDoc = fctopeDoc;
    }

    public String getItTelematica() {
        return itTelematica;
    }

    public void setItTelematica(String itTelematica) {
        this.itTelematica = itTelematica;
    }

    public Date getFciniJustificacion() {
        return fciniJustificacion;
    }

    public void setFciniJustificacion(Date fciniJustificacion) {
        this.fciniJustificacion = fciniJustificacion;
    }

    public Date getFcfinJustificacion() {
        return fcfinJustificacion;
    }

    public void setFcfinJustificacion(Date fcfinJustificacion) {
        this.fcfinJustificacion = fcfinJustificacion;
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

    public Date getFcPublicacion() {
        return fcPublicacion;
    }

    public void setFcPublicacion(Date fcPublicacion) {
        this.fcPublicacion = fcPublicacion;
    }

    public Integer getNmOrdenRec() {
        return nmOrdenRec;
    }

    public void setNmOrdenRec(Integer nmOrdenRec) {
        this.nmOrdenRec = nmOrdenRec;
    }

    public Date getFcOrdenRec() {
        return fcOrdenRec;
    }

    public void setFcOrdenRec(Date fcOrdenRec) {
        this.fcOrdenRec = fcOrdenRec;
    }

    public Double getPuntosCorte() {
        return puntosCorte;
    }

    public void setPuntosCorte(Double puntosCorte) {
        this.puntosCorte = puntosCorte;
    }

    public Double getRentaCorte() {
        return rentaCorte;
    }

    public void setRentaCorte(Double rentaCorte) {
        this.rentaCorte = rentaCorte;
    }

    public Double getRecuSegPago() {
        return recuSegPago;
    }

    public void setRecuSegPago(Double recuSegPago) {
        this.recuSegPago = recuSegPago;
    }

    public Double getRecuTerPago() {
        return recuTerPago;
    }

    public void setRecuTerPago(Double recuTerPago) {
        this.recuTerPago = recuTerPago;
    }

    public Integer getCdCursoRenta() {
        return cdCursoRenta;
    }

    public void setCdCursoRenta(Integer cdCursoRenta) {
        this.cdCursoRenta = cdCursoRenta;
    }

    public Double getNmPorcenSsm() {
        return nmPorcenSsm;
    }

    public void setNmPorcenSsm(Double nmPorcenSsm) {
        this.nmPorcenSsm = nmPorcenSsm;
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

    public Double getPrecioComa() {
        return precioComa;
    }

    public void setPrecioComa(Double precioComa) {
        this.precioComa = precioComa;
    }

    public Double getRentaMax() {
        return rentaMax;
    }

    public void setRentaMax(Double rentaMax) {
        this.rentaMax = rentaMax;
    }

    public String getItTelematicaR() {
        return itTelematicaR;
    }

    public void setItTelematicaR(String itTelematicaR) {
        this.itTelematicaR = itTelematicaR;
    }

    public String getItCruceDeudas() {
        return itCruceDeudas;
    }

    public void setItCruceDeudas(String itCruceDeudas) {
        this.itCruceDeudas = itCruceDeudas;
    }

    public String getItCruceObligTrib() {
        return itCruceObligTrib;
    }

    public void setItCruceObligTrib(String itCruceObligTrib) {
        this.itCruceObligTrib = itCruceObligTrib;
    }

    public String getItCruceObligSs() {
        return itCruceObligSs;
    }

    public void setItCruceObligSs(String itCruceObligSs) {
        this.itCruceObligSs = itCruceObligSs;
    }
}
