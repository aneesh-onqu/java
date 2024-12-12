package com.forms.to.angular.oracle_form.guay_motivos.service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Connection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.forms.to.angular.oracle_form.guay_motivos.entities.GuayMotivos;
import com.forms.to.angular.oracle_form.guay_motivos.entities.GuayMotivosDate;
import com.forms.to.angular.oracle_form.guay_motivos.entities.GuayMotivosUpdate;
import java.sql.Timestamp;
@Service
public class GuayMotivosService {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public GuayMotivosService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<GuayMotivos> findLOV() throws SQLException {
        String sql = "SELECT * FROM GUAY_MOT_NO_CONCESION";

        try{
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            GuayMotivos guayMotivos = new GuayMotivos();
            guayMotivos.setCdMotivo(rs.getString("CDMOTIVO"));
            guayMotivos.setDsMotivo(rs.getString("DSMOTIVO"));
            guayMotivos.setDsAbMotivo(rs.getString("DSABMOTIVO"));
            return guayMotivos;
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
    public List<GuayMotivos> findAllList() throws SQLException {
        String sql = "SELECT * FROM GUAY_MOT_NO_CONCESION ORDER by CDMOTIVO";

        try{
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            GuayMotivos guayMotivos = new GuayMotivos();
            guayMotivos.setCdMotivo(rs.getString("CDMOTIVO"));
            guayMotivos.setDsMotivo(rs.getString("DSMOTIVO"));
            guayMotivos.setDsAbMotivo(rs.getString("DSABMOTIVO"));
            guayMotivos.setTpMotivo(rs.getString("TPMOTIVO"));
            guayMotivos.setIdAlta(rs.getString("IDALTA"));
            guayMotivos.setFcAlta(rs.getDate("FCALTA"));
            guayMotivos.setIdModi(rs.getString("IDMODI"));
            guayMotivos.setFcModi(rs.getDate("FCMODI"));
            guayMotivos.setFcBaja(rs.getDate("FCBAJA"));
            guayMotivos.setClSubsanaciones(rs.getString("CL_SUBSANACIONES"));
            return guayMotivos;
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

    public List<GuayMotivos> findPDFList() throws SQLException {
        String sql = "SELECT * FROM GUAY_MOT_NO_CONCESION WHERE FCBAJA IS NULL ORDER by CDMOTIVO";

        try{
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            GuayMotivos guayMotivos = new GuayMotivos();
            guayMotivos.setCdMotivo(rs.getString("CDMOTIVO"));
            guayMotivos.setDsMotivo(rs.getString("DSMOTIVO"));
            guayMotivos.setDsAbMotivo(rs.getString("DSABMOTIVO"));
            guayMotivos.setTpMotivo(rs.getString("TPMOTIVO"));
            guayMotivos.setIdAlta(rs.getString("IDALTA"));
            guayMotivos.setFcAlta(rs.getDate("FCALTA"));
            guayMotivos.setIdModi(rs.getString("IDMODI"));
            guayMotivos.setFcModi(rs.getDate("FCMODI"));
            guayMotivos.setFcBaja(rs.getDate("FCBAJA"));
            guayMotivos.setClSubsanaciones(rs.getString("CL_SUBSANACIONES"));
            return guayMotivos;
        });

         } catch (Exception e) {
            
            System.err.println("Unexpected error: " + e.getMessage());
            e.printStackTrace();
            return null; 
        }

    };

    @SuppressWarnings("deprecation")
    public GuayMotivos findById(String id) throws SQLException {
        String sql = "SELECT * FROM GUAY_MOT_NO_CONCESION WHERE CDMOTIVO = ?";
        try {
            return jdbcTemplate.queryForObject(sql, new Object[]{id}, (ResultSet rs, int rowNum) -> {
                GuayMotivos guayMotivos = new GuayMotivos();
                guayMotivos.setCdMotivo(rs.getString("CDMOTIVO"));
                guayMotivos.setDsMotivo(rs.getString("DSMOTIVO"));
                guayMotivos.setDsAbMotivo(rs.getString("DSABMOTIVO"));
                guayMotivos.setTpMotivo(rs.getString("TPMOTIVO"));
                guayMotivos.setIdAlta(rs.getString("IDALTA"));
                guayMotivos.setFcAlta(rs.getDate("FCALTA"));
                guayMotivos.setIdModi(rs.getString("IDMODI"));
                guayMotivos.setFcModi(rs.getDate("FCMODI"));
                guayMotivos.setFcBaja(rs.getDate("FCBAJA"));
                guayMotivos.setClSubsanaciones(rs.getString("CL_SUBSANACIONES"));
                return guayMotivos;
            });

        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }
    }

    public Map<String, String> create(GuayMotivos guayMotivos) {
        
        try {
            String sql = "INSERT INTO GUAY_MOT_NO_CONCESION (CDMOTIVO, DSMOTIVO, DSABMOTIVO, TPMOTIVO, IDALTA, FCALTA, IDMODI, FCMODI, FCBAJA, CL_SUBSANACIONES) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            int insert = jdbcTemplate.update(sql, guayMotivos.getCdMotivo(), guayMotivos.getDsMotivo(), guayMotivos.getDsAbMotivo(), guayMotivos.getTpMotivo(), guayMotivos.getIdAlta(), guayMotivos.getFcAlta(), guayMotivos.getIdModi(), guayMotivos.getFcModi(), guayMotivos.getFcBaja(), guayMotivos.getClSubsanaciones());
            if (insert == 1) {
                return Map.of("message", "success");
            } else {
                return Map.of("message", "failure");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return Map.of("message", "failure");
        }
      
    }

    @SuppressWarnings("deprecation")
    public Map<String, Object> alreadyexist(String id) throws SQLException {
         String sql = "SELECT * FROM GUAY_MOT_NO_CONCESION WHERE CDMOTIVO = ?";
        Map<String, Object> response = new HashMap<>();
        try {
            
            int count = jdbcTemplate.query(sql, new Object[]{id}, (ResultSet rs) -> {
                int rowCount = 0;
                if(rs.next()) {
                    rowCount++;
                }
                return rowCount; 
            });

            response.put("count", count);
            response.put("status", "success");

        } catch (Exception e) {
            e.printStackTrace();
            response.put("count", 0);
            response.put("status", "failure");
        }

        return response;
    }

    public Map<String, String> delete(String id) {
        
        try {
            String sql = "DELETE FROM GUAY_MOT_NO_CONCESION WHERE CDMOTIVO = ?";
            int delete = jdbcTemplate.update(sql, id);
            if (delete == 1) {
                return Map.of("message", "success");
            } else {
                return Map.of("message", "failure");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return Map.of("message", "failure");
        }
      
    }

    public Map<String, Object> updateDate(GuayMotivosDate data) throws SQLException {
        System.out.println(data.getCdMotivo());
              
        Properties props = new Properties();
        props.setProperty("user", "DBA_GUAY");
        props.setProperty("password", "guay");
        props.setProperty("internal_logon", "SYSDBA");

        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1523:orcl", props);
        try {
            String sql = "UPDATE GUAY_MOT_NO_CONCESION SET IDMODI = ?, FCMODI = ?, FCBAJA = ? WHERE CDMOTIVO = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, data.getIdModi());
            stmt.setTimestamp(2, new Timestamp(data.getFcModi().getTime()));
            stmt.setTimestamp(3, new Timestamp(data.getFcBaja().getTime()));
            stmt.setString(4, data.getCdMotivo());
            int update = stmt.executeUpdate();
            if (update == 1) {
                return Map.of("message", "success");
            } else {
                return Map.of("message", "failure" , "update", update);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return Map.of("message", "failure");
        } finally {
            con.close();
            System.out.println("Done");
        }
        
    }


    public Map<String, Object> update(GuayMotivosUpdate guayMotivos) {
        
        try {
            String sql = "UPDATE GUAY_MOT_NO_CONCESION SET DSMOTIVO = ?, DSABMOTIVO = ?, TPMOTIVO = ? WHERE CDMOTIVO = ?";
            int update = jdbcTemplate.update(sql, guayMotivos.getDsMotivo(), guayMotivos.getDsAbMotivo(), guayMotivos.getTpMotivo(), guayMotivos.getCdMotivo());
            if (update == 1) {
                return Map.of("message", "success");
            } else {
                return Map.of("message", "failure" , "update", update);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return Map.of("message", "failure");
        } finally {
            System.out.println("Done");
        }
      
    }


    public List<GuayMotivos> filter(Map<String, String> params) throws SQLException {

        try {
            String CDMOTIVO = params.get("CDMOTIVO");
            String DSMOTIVO = params.get("DSMOTIVO");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String sql;
            
            if (CDMOTIVO != null && !CDMOTIVO.isEmpty() && DSMOTIVO != null && !DSMOTIVO.isEmpty()) {
                sql = "SELECT * FROM GUAY_MOT_NO_CONCESION WHERE LOWER(CDMOTIVO) LIKE '%" + CDMOTIVO.toLowerCase() + "%' AND LOWER(DSMOTIVO) LIKE '%" + DSMOTIVO.toLowerCase() + "%' ORDER BY CDMOTIVO";
                
            } else if (CDMOTIVO != null && !CDMOTIVO.isEmpty()) {
                sql = "SELECT * FROM GUAY_MOT_NO_CONCESION WHERE LOWER(CDMOTIVO) LIKE '%" + CDMOTIVO.toLowerCase() + "%' ORDER BY CDMOTIVO";
            } else if (DSMOTIVO != null && !DSMOTIVO.isEmpty()) {
                sql ="SELECT * FROM GUAY_MOT_NO_CONCESION WHERE LOWER(DSMOTIVO) LIKE '%" + DSMOTIVO.toLowerCase() + "%' ORDER BY CDMOTIVO";
               
            } else {
                sql = "SELECT * FROM GUAY_MOT_NO_CONCESION ORDER BY CDMOTIVO";
            }
            
            
            return jdbcTemplate.query(sql, (rs, rowNum) -> {
                GuayMotivos guayMotivos = new GuayMotivos();
                guayMotivos.setCdMotivo(rs.getString("CDMOTIVO"));
                guayMotivos.setDsMotivo(rs.getString("DSMOTIVO"));
                guayMotivos.setDsAbMotivo(rs.getString("DSABMOTIVO"));
                guayMotivos.setTpMotivo(rs.getString("TPMOTIVO"));
                guayMotivos.setIdAlta(rs.getString("IDALTA"));
                guayMotivos.setFcAlta(rs.getDate("FCALTA"));
                guayMotivos.setIdModi(rs.getString("IDMODI"));
                guayMotivos.setFcModi(rs.getDate("FCMODI"));
                guayMotivos.setFcBaja(rs.getDate("FCBAJA"));
                guayMotivos.setClSubsanaciones(rs.getString("CL_SUBSANACIONES"));
                return guayMotivos;
            });

        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }


    public Map<String, Object> restore(GuayMotivosDate data) throws SQLException {
    try {
        String sql = "UPDATE GUAY_MOT_NO_CONCESION SET IDMODI = ?, FCMODI = ?, FCBAJA = ? WHERE CDMOTIVO = ?";
        int update = jdbcTemplate.update(sql, data.getIdModi(), data.getFcModi(), data.getFcBaja(), data.getCdMotivo());
        if (update == 1) {
            return Map.of("message", "success");
        } else {
            return Map.of("message", "failure" , "update", update);
        }
        } catch (Exception e) {
            e.printStackTrace();
            return Map.of("message", "failure");
        } finally {
            System.out.println("Done");
        }
    }

}