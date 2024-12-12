package com.forms.to.angular.oracle_form.guay_apl.service;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.forms.to.angular.oracle_form.guay_apl.entities.GuayUsuTPayuda;
import com.forms.to.angular.oracle_form.guay_apl.repositories.GuayUsuTPayudaRepository;




@Service
public class GuayAPLService {

    private final JdbcTemplate jdbcTemplate;
    private final GuayUsuTPayudaRepository guayUsuTPayudaRepository;

    @Autowired
    public GuayAPLService(JdbcTemplate jdbcTemplate ,GuayUsuTPayudaRepository guayUsuTPayudaRepository) {
        this.jdbcTemplate = jdbcTemplate;
        this.guayUsuTPayudaRepository=guayUsuTPayudaRepository;
    }

    
    public List<Map<String, Object>> getAyudaDetails() {
        String query = """
                SELECT ut.cod_usuario, t.cdayuda, t.dsayuda
                FROM guay_tpayuda t, guay_usu_tpayuda ut
                WHERE ut.cdayuda = t.cdayuda
                  AND ut.fcbaja IS NULL
                  AND t.fcbaja IS NULL
                """;
    
        // Execute the query and retrieve the result as a list of maps
        return jdbcTemplate.queryForList(query);
    }

    public List<GuayUsuTPayuda> LlamarAplication(String codUsuario, String cdayuda) {
        return guayUsuTPayudaRepository.findGrupoPerfilByCodUsuarioAndCdayuda(codUsuario, cdayuda);
    }
    
  

}