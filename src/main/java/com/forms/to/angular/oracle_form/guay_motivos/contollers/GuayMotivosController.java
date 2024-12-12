
package com.forms.to.angular.oracle_form.guay_motivos.contollers;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;

import org.springframework.core.io.Resource;
import org.springframework.data.jpa.domain.JpaSort.Path;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import com.forms.to.angular.oracle_form.guay_motivos.entities.GuayMotivos;
import com.forms.to.angular.oracle_form.guay_motivos.entities.GuayMotivosDate;
import com.forms.to.angular.oracle_form.guay_motivos.entities.GuayMotivosUpdate;
import com.forms.to.angular.oracle_form.guay_motivos.service.GuayMotivosService;
import com.forms.to.angular.oracle_form.guay_motivos.service.GuayMotivospdfService;
import com.forms.to.angular.oracle_form.guay_motivos.util.MotivosPdfGeneration;

import jakarta.servlet.http.HttpServletResponse;

import org.springframework.core.io.ResourceLoader;

import org.springframework.util.StreamUtils;

@RestController
@CrossOrigin(origins = {"https://oracleconversion.mo.vc", "http://localhost:4200" })
@RequestMapping("/api/guaymotivos")
public class GuayMotivosController {
    private static final String PDF_PATH = "guaymotivos/";  // Path relative to resources folder

    @Autowired
    private MotivosPdfGeneration motivosPdfGeneration;
    private ResourceLoader resourceLoader;

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private GuayMotivosService service;
    private GuayMotivospdfService pdfservice;

    public GuayMotivosController(GuayMotivosService service) {
            this.service = service;
    }



    @GetMapping("/lov")
    public List<GuayMotivos> findLOV() throws SQLException {
        return service.findLOV();
    }

    @GetMapping("/list")
    public List<GuayMotivos> findList() throws SQLException {
        return service.findAllList();
    }

    @GetMapping("/imprimir")
    public Map<String, String> motivosPdfFile(HttpServletResponse response) throws IOException, SQLException {
        Map<String, String> responses = new HashMap<>();

        List<GuayMotivos> motivos= service.findPDFList();
        try{
            if (motivos != null) {  
                return motivosPdfGeneration.generate(motivos);
            }else {
                responses.put("pdf_link", null);
                responses.put("pdf_name", null);
                return responses; 
            }
        }catch (Exception e) {
            
            responses.put("pdf_link", null);
            responses.put("pdf_name", null);
            return responses; 
        }
   
    }

    @GetMapping("/list/{id}")
    public GuayMotivos find(@PathVariable String id) throws SQLException {
        return service.findById(id);
    }
 
    @PostMapping("/create")
    public Object create(@RequestBody GuayMotivos guayMotivos) {
        return service.create(guayMotivos);
    }

    @GetMapping("/alreadyexist/{id}")
    public Object alreadyexist(@PathVariable String id) throws SQLException {
        return service.alreadyexist(id);
    }

    @GetMapping("/delete/{id}")
    public Object delete(@PathVariable String id) throws SQLException {
        return service.delete(id);
    }

    @PostMapping("/updatedate")
    public Object updateDate(@RequestBody GuayMotivosDate data) throws SQLException {
        return service.updateDate(data);
    }

    @PostMapping("/restore")
    public Object restore(@RequestBody GuayMotivosDate data) throws SQLException {
        return service.restore(data);
    }
    @PostMapping("/update")
    public Object update(@RequestBody GuayMotivosUpdate guayMotivos) throws SQLException {
        return service.update(guayMotivos);
    }

    @GetMapping("/filter")
    public List<GuayMotivos> filter(@RequestParam Map<String, String> params) throws SQLException {
        return service.filter(params);
    }


    @GetMapping("/pdfview")
    public ResponseEntity<byte[]> viewPdf(@RequestParam String filename) {
        try {
            System.err.println("pdfview: ");
            // Load the PDF file from resources/guaymotivos
            ClassPathResource pdfFile = new ClassPathResource("guaymotivos/" + filename);
            
            if (!pdfFile.exists()) {
                return ResponseEntity.notFound().build();
            }

            // Read the PDF file into a byte array
            InputStream inputStream = pdfFile.getInputStream();
            byte[] pdfBytes = StreamUtils.copyToByteArray(inputStream);

            // Set up headers
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_PDF);
            headers.setContentDisposition(ContentDisposition.builder("inline").filename(filename).build());


            return ResponseEntity.ok()
                .headers(headers)
                .body(pdfBytes);

        } catch (IOException e) {
            return ResponseEntity.internalServerError().build();
        }
    }

}
