
package com.forms.to.angular.oracle_form.guay_apl.contollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.forms.to.angular.oracle_form.guay_apl.entities.GuayUsuTPayuda;
import com.forms.to.angular.oracle_form.guay_apl.service.GuayAPLService;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.Map;



@RestController
@CrossOrigin(origins = {"https://oracleconversion.mo.vc", "http://localhost:4200" })
@RequestMapping("/api/guayapl")
public class GuayAPLController {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private GuayAPLService service;
  

    public GuayAPLController(GuayAPLService service) {
            this.service = service;
    }

    @GetMapping("/getayuda")
    public List<Map<String, Object>> getAyudaDetails() {
        return service.getAyudaDetails();
    }

    @GetMapping("/illamar")
    public List<GuayUsuTPayuda> LlamarAplication(@RequestParam String codUsuario, @RequestParam String cdayuda) {
        return service.LlamarAplication(codUsuario, cdayuda);
    }


}
