package com.forms.to.angular.oracle_form.guay_acf.service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.forms.to.angular.oracle_form.guay_acf.entities.GuayAyuda;
import com.forms.to.angular.oracle_form.guay_acf.entities.GuayTurnos;
import com.forms.to.angular.oracle_form.guay_acf.entities.GuayCurso;
import com.forms.to.angular.oracle_form.guay_acf.entities.GuayFaseTurno;
import com.forms.to.angular.oracle_form.guay_acf.entities.GuayFases;
import com.forms.to.angular.oracle_form.guay_acf.entities.GuayResTurno;
import com.forms.to.angular.oracle_form.guay_acf.entities.GuayResDat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
@Service
public class GuayACFService {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public GuayACFService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

   public List<GuayAyuda> findAyudaLOV() throws SQLException {
        String sql = "SELECT * FROM GUAY_TPAYUDA WHERE UPPER(TICONTROL_FASE) = 'S' AND FCBAJA IS NULL ORDER BY 1";

        try{
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            GuayAyuda guayAyuda = new GuayAyuda();
            guayAyuda.setCdAyuda(rs.getString("CDAYUDA"));
            guayAyuda.setCdTpDis(rs.getString("CDTPDIS"));
            guayAyuda.setDsAyuda(rs.getString("DSAYUDA"));
            guayAyuda.setIdAlta(rs.getString("IDALTA"));
            guayAyuda.setTiControlFase(rs.getString("TICONTROL_FASE"));
            guayAyuda.setfCalta(rs.getDate("FCALTA"));
            guayAyuda.setIdModi(rs.getString("IDMODI"));
            guayAyuda.setfCModi(rs.getDate("FCMODI"));
            guayAyuda.setfCbaja(rs.getDate("FCBAJA"));
            guayAyuda.setCdCurso(rs.getDouble("CDCURSO"));
            guayAyuda.setiTConsultaWeb(rs.getString("ITCONSULTA_WEB"));
            guayAyuda.setiTDesgloseInf(rs.getString("ITDESGLOSEINF"));
            return guayAyuda;
        });

         } catch (DataAccessException e) {
          
            System.err.println("Error executing query: " + e.getMessage());
            e.printStackTrace();
            return null; 
        } catch (Exception e) {
            
            System.err.println("Unexpected error: " + e.getMessage());
            e.printStackTrace();
            return null; 
        }

    };

        
    @SuppressWarnings("deprecation")
    public List<GuayTurnos> findTurnoLOV(String id) {
        String sql = "SELECT * FROM GUAY_TURNOS WHERE CDAYUDA = ? ORDER BY 1";

        try {
            return jdbcTemplate.query(sql, new Object[]{id}, (ResultSet rs, int rowNum) -> {
                GuayTurnos guayTurnos = new GuayTurnos();
                guayTurnos.setCdTurno(rs.getString("CDTURNO"));
                guayTurnos.setCdAyuda(rs.getString("CDAYUDA"));
                guayTurnos.setCdTurnoAsoc(rs.getString("CDTURNO_ASOC"));
                guayTurnos.setDsTurno(rs.getString("DSTURNO"));
                guayTurnos.setfCalta(rs.getDate("FCALTA"));
                guayTurnos.setfCbaja(rs.getDate("FCBAJA"));
                guayTurnos.setfCModi(rs.getDate("FCMODI"));
                guayTurnos.setiConsultaWeb(rs.getString("ICONSULTA_WEB"));
                guayTurnos.setIdAlta(rs.getString("IDALTA"));
                guayTurnos.setIdModi(rs.getString("IDMODI"));
                return guayTurnos;
            });

       
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }

    @SuppressWarnings("deprecation")
    public List<GuayCurso> findCursoLOV(String id) {
        String sql = "SELECT DISTINCT GC.CDCURSO codigo, GC.DSCURSO descripcion, GC.ACTUAL actual, GC.FCALTA fcalta, GC.FCBAJA fcbaja, GC.FCMODI fcmodi, GC.IDALTA idalta, GC.IDMODI idmodi "
                   + "FROM GUAY_CURSO GC, GUAY_CONVOCATORIA GV "
                   + "WHERE GC.FCBAJA IS NULL AND GC.CDCURSO = GV.CDCURSO AND GV.CDAYUDA = ? "
                   + "ORDER BY 1";

        try {
            return jdbcTemplate.query(sql, new Object[]{id}, (ResultSet rs, int rowNum) -> {
                GuayCurso guayCurso = new GuayCurso();
                guayCurso.setCdCurso(rs.getInt("codigo"));
                guayCurso.setActual(rs.getString("actual"));
                guayCurso.setDsCurso(rs.getString("descripcion"));
                guayCurso.setfCalta(rs.getDate("fcalta"));
                guayCurso.setfCbaja(rs.getDate("fcbaja"));
                guayCurso.setfCModi(rs.getDate("fcmodi"));
                guayCurso.setIdAlta(rs.getString("idalta"));
                guayCurso.setIdModi(rs.getString("idmodi"));
                return guayCurso;
            });
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    
    @SuppressWarnings("deprecation")
    public Map<String, Object> checkAyuda(String id) throws SQLException {
        
        String sql = "SELECT * FROM GUAY_TPAYUDA WHERE UPPER(TICONTROL_FASE)='S' AND FCBAJA IS NULL AND CDAYUDA = ?";
        Map<String, Object> response = new HashMap<>();
        try {
            int count = jdbcTemplate.query(sql, new Object[]{id}, (ResultSet rs) -> {
                int rowCount = 0;
                while (rs.next()) {
                    rowCount++;
                }
                return rowCount; 
            });

            if (count == 0) {
                response.put("count", count);
                response.put("status", "failure");
            } else {
                response.put("count", count);
                response.put("status", "success");
            }
       
        } catch (Exception e) {
            e.printStackTrace();
            response.put("count", 0);
            response.put("status", "failure");
        }

        return response;
    }

    @SuppressWarnings("deprecation")
    public  List<GuayFaseTurno> Acf_filterList(String cdayuda, String cdcursos, String cdtureno) throws SQLException {
        String query = "SELECT * FROM GUAY_FASE_TURNO WHERE CDAYUDA = ? AND CDCURSO = ? AND CDTURNO = ?";

        return jdbcTemplate.query(query, new Object[]{cdayuda, cdcursos, cdtureno}, (ResultSet rs, int rowNum) -> {
            GuayFaseTurno guayfase = new GuayFaseTurno();

            guayfase.setCdAyuda(rs.getString("CDAYUDA"));
            guayfase.setCdCurso(rs.getInt("CDCURSO"));
            guayfase.setCdFase(rs.getString("CDFASE"));
            guayfase.setCdTurno(rs.getString("CDTURNO"));
            guayfase.setEstado(rs.getString("ESTADO"));
            guayfase.setFcAlta(rs.getDate("FCALTA"));
            guayfase.setFcFinJust(rs.getDate("FCFIN_JUST"));
            guayfase.setFcInicioJust(rs.getDate("FCINICIO_JUST"));
            guayfase.setFcModi(rs.getDate("FCMODI"));
            guayfase.setFcPlazoDesde(rs.getDate("FCPLAZO_DESDE"));
            guayfase.setFcPlazoDesdeR(rs.getDate("FCPLAZO_DESDE_R"));
            guayfase.setFcPlazoDesdeS(rs.getDate("FCPLAZO_DESDE_S"));
            guayfase.setFcPlazoHasta(rs.getDate("FCPLAZO_HASTA"));
            guayfase.setFcPlazoHastaR(rs.getDate("FCPLAZO_HASTA_R"));
            guayfase.setFcPlazoHastaS(rs.getDate("FCPLAZO_HASTA_S"));
            guayfase.setIdModi(rs.getString("IDMODI"));

            return guayfase; 
        });
    }


    public List<GuayFases> findfaseList() throws SQLException {
        String query = "SELECT * FROM GUAY_FASES";
        try {
            return jdbcTemplate.query(query, (ResultSet rs, int rowNum) -> {
                GuayFases guayFases = new GuayFases();
                guayFases.setCdFase(rs.getString("CDFASE"));
                guayFases.setDsFase(rs.getString("DSFASE"));
                return guayFases;
            });
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       


    public Map<String, Object> Hay_Resolucion_Ejecutando() throws SQLException {
        
        Map<String, Object> response = new HashMap<>();
        String query = "SELECT * FROM qujb_trabajos WHERE IT_PARAMETROS LIKE '%GUAY_PAQ_RESOLUCION%'";
            try {
                int count = jdbcTemplate.queryForObject(query, Integer.class); 
                if (count == 0) {
                    response.put("status", false);
                } else {
                    response.put("status", true);
                }
                
            } catch (DataAccessException e) {
                e.printStackTrace();
                response.put("status", false);
            }

            return response;
    }

    
    public Map<String, Object> createAndUpdate(String faseCombo, String estadoCombo, String comboFase, String comboEstado, String cdayuda, int cdcurso, String cdturno) {
        Map<String, Object> response = new HashMap<>();

        
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
        String formattedDate = currentDate.format(formatter);

        System.out.println(formattedDate);

      
        if ((faseCombo == null || !faseCombo.equals(comboFase)) || !estadoCombo.equals(comboEstado)) {
            try {
                String idmodi = "user01";  
                String fcmodi = formattedDate;
                String fcalta = formattedDate;

                
                String checkSql = "SELECT COUNT(*) FROM GUAY_FASE_TURNO WHERE CDAYUDA = ? AND CDCURSO = ? AND CDTURNO = ?";
                int count = jdbcTemplate.queryForObject(checkSql, Integer.class, cdayuda, cdcurso, cdturno);
                if (count > 0) {
                    String updateSql = "UPDATE GUAY_FASE_TURNO SET CDFASE = ?, ESTADO = ?, FCMODI = ?, IDMODI = ? WHERE CDAYUDA = ? AND CDCURSO = ? AND CDTURNO = ?";
                    int updateResult = jdbcTemplate.update(updateSql, comboFase, comboEstado, fcmodi, idmodi, cdayuda, cdcurso, cdturno);
                    System.out.println("updateResult: " + updateResult);
                } else {
                    String insertSql = "INSERT INTO GUAY_FASE_TURNO (CDAYUDA, CDCURSO, CDTURNO, CDFASE, ESTADO, FCALTA, IDMODI, FCMODI) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                    int insertResult = jdbcTemplate.update(insertSql, cdayuda, cdcurso, cdturno, comboFase, comboEstado, fcalta, idmodi, fcmodi);
                    System.out.println("insertResult: " + insertResult);
                }
                String updateConvocatoriaSql = "UPDATE GUAY_CONVOCATORIA SET CDFASE = ?, ESTADO = ?, FCMODI = ?, IDMODI = ? WHERE CDAYUDA = ? AND CDCURSO = ? AND CDTURNO_ACTUAL = ?";
                int updateConvocatoriaResult = jdbcTemplate.update(updateConvocatoriaSql, comboFase, comboEstado, fcmodi, idmodi, cdayuda, cdcurso, cdturno);
                System.out.println("updateConvocatoriaResult: " + updateConvocatoriaResult);

                if (updateConvocatoriaResult == 1) {
                    response.put("message", "success");
                } else {
                    response.put("message", "failure");
                }
            } catch (Exception e) {
                e.printStackTrace();
                response.put("message", "mismatch");
            }
        } else {
            response.put("message", "no change");
        }

        return response;
    }

    @SuppressWarnings("deprecation")
    public List<Object> PROC_OBTENER_RESOLUCION(Map<String, String> params) throws SQLException {
        try {
            String cdayuda = params.get("CDAYUDA");
            String cdcursos = params.get("CDCURSO");
            String cdtureno = params.get("CDTURNO");
            String query;
            if ("TRAN".equals(cdayuda)) {
                query = "SELECT * FROM GUAY_RES_DAT WHERE CDAYUDA = ? AND CDCURSO = ? AND CDTURNO = ? AND CDSUBDIR IS NULL";
                
                return jdbcTemplate.query(query, new Object[]{cdayuda, cdcursos, cdtureno}, (ResultSet rs, int rowNum) -> {
                
                    GuayResDat guayresdat = new GuayResDat();
                    guayresdat.setCdAyuda(rs.getString("CDAYUDA"));
                    guayresdat.setCdCurso(rs.getInt("CDCURSO"));
                    guayresdat.setCdTurno(rs.getString("CDTURNO"));
                    guayresdat.setCdTPres(rs.getString("CDTPRES"));
                    guayresdat.setCdSubDir(rs.getString("CDSUBDIR"));
                    guayresdat.setNmResolucion(rs.getString("NMRESOLUCION"));
                    guayresdat.setFcResolucion(rs.getDate("FCRESOLUCION"));
                    guayresdat.setIdAlta(rs.getString("IDALTA"));
                    guayresdat.setFcPublicacion(rs.getDate("FCPUBLICACION"));
                    guayresdat.setFcAlta(rs.getDate("FCALTA"));
                    guayresdat.setIdModi(rs.getString("IDMODI"));
                    guayresdat.setFcModi(rs.getDate("FCMODI"));
                    guayresdat.setFcAprobacion(rs.getDate("FCAPROBACION"));
                    guayresdat.setItConsultaWeb(rs.getString("ITCONSULTA_WEB"));
                    guayresdat.setItGenerada(rs.getString("ITGENERADA"));
        
                    return guayresdat; 
                });
            } else {
                query = "SELECT * FROM GUAY_RES_TURNO WHERE CDAYUDA = ? AND CDCURSO = ? AND CDTURNO = ?";
                
                return jdbcTemplate.query(query, new Object[]{cdayuda, cdcursos, cdtureno}, (ResultSet rs, int rowNum) -> {
                    GuayResTurno guayresrurno = new GuayResTurno();
                    guayresrurno.setCdAyuda(rs.getString("CDAYUDA"));
                    guayresrurno.setCdCurso(rs.getInt("CDCURSO"));
                    guayresrurno.setCdTurno(rs.getString("CDTURNO"));
                    guayresrurno.setCdTPres(rs.getString("CDTPRES"));
                    guayresrurno.setNmResolucion(rs.getString("NMRESOLUCION"));
                    guayresrurno.setFcResolucion(rs.getDate("FCRESOLUCION"));
                    guayresrurno.setIdAlta(rs.getString("IDALTA"));
                    guayresrurno.setFcPublicacion(rs.getDate("FCPUBLICACION"));
                    guayresrurno.setFcAlta(rs.getDate("FCALTA"));
                    guayresrurno.setIdModi(rs.getString("IDMODI"));
                    guayresrurno.setFcModi(rs.getDate("FCMODI"));
                    guayresrurno.setFcAprobacion(rs.getDate("FCAPROBACION"));
                    guayresrurno.setFcDesdeErrorHecho(rs.getDate("FCDESDE_ERROR_HECHO"));
                    guayresrurno.setFcHastaErrorHecho(rs.getDate("FCHASTA_ERROR_HECHO"));
                    guayresrurno.setPuntos(rs.getDouble("PUNTOS"));
                    guayresrurno.setNmSolicitudes(rs.getInt("NMSOLICITUDES"));
                    guayresrurno.setNmPeticion(rs.getInt("NMPETICION"));
                    guayresrurno.setFcGeneracion(rs.getDate("FCGENERACION"));
        
                    return guayresrurno; 
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        
    }


}