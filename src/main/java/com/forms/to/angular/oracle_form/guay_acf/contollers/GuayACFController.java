
package com.forms.to.angular.oracle_form.guay_acf.contollers;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.JsonNode;
import com.forms.to.angular.oracle_form.guay_acf.entities.GuayAyuda;
import com.forms.to.angular.oracle_form.guay_acf.entities.GuayTurnos;
import com.forms.to.angular.oracle_form.guay_acf.entities.GuayCurso;
import com.forms.to.angular.oracle_form.guay_acf.entities.GuayFaseTurno;
import com.forms.to.angular.oracle_form.guay_acf.entities.GuayFases;
import com.forms.to.angular.oracle_form.guay_acf.service.GuayACFService;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.Map;


@RestController
@CrossOrigin(origins = {"https://oracleconversion.mo.vc", "http://localhost:4200" })
@RequestMapping("/api/guayacf")
public class GuayACFController {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private GuayACFService service;
    

    public GuayACFController(GuayACFService service) {
            this.service = service;
    }

    @GetMapping("/ayudalov")
    public List<GuayAyuda> findAyudaLOV() throws SQLException {
        return service.findAyudaLOV();
    }

    @GetMapping("/turnolov/{id}")
    public List<GuayTurnos> findTurnoLOV(@PathVariable String id) throws SQLException {
        System.out.println("turnolov");
        return service.findTurnoLOV(id);
    }

    @GetMapping("/cursolov/{id}")
    public List<GuayCurso> findCursoLOV(@PathVariable String id) throws SQLException {
        return service.findCursoLOV(id);
    }

    @GetMapping("/checkAyuda/{id}")
    public Object checkAyuda(@PathVariable String id) throws SQLException {  
        return service.checkAyuda(id);
    }

    @GetMapping("/Acf_filterList/{cdayuda}/{cdcursos}/{cdtureno}")
    public List<GuayFaseTurno>Acf_filterList(@PathVariable String cdayuda, @PathVariable String cdcursos, @PathVariable String cdtureno) throws SQLException {
        return service.Acf_filterList(cdayuda, cdcursos, cdtureno);
    }

    @GetMapping("/faselist")
    public List<GuayFases> findfaseList() throws SQLException {
        return service.findfaseList();
    }

    @GetMapping("/Ejecutando")
    public Map<String, Object> Hay_Resolucion_Ejecutando() throws SQLException {
        return service.Hay_Resolucion_Ejecutando();
    }
    
    @PostMapping("/insertupdate")
    public Map<String, Object> CreateAndUpdate(@RequestBody JsonNode requestBody) throws SQLException {
        String faseCombo = requestBody.get("faseCombo").asText();
        String estadoCombo = requestBody.get("estadoCombo").asText();
        String comboFase = requestBody.get("comboFase").asText();
        String comboEstado = requestBody.get("comboEstado").asText();
        String cdayuda = requestBody.get("cdayuda").asText();
        int cdcurso = requestBody.get("cdcurso").asInt();
        String cdturno = requestBody.get("cdturno").asText();         
        return service.createAndUpdate(faseCombo, estadoCombo, comboFase, comboEstado, cdayuda, cdcurso, cdturno);
    }


    @GetMapping("/resolucion")
    public List<Object> PROC_OBTENER_RESOLUCION(@RequestParam Map<String, String> params) throws SQLException {
        return service.PROC_OBTENER_RESOLUCION(params);
    }
}
