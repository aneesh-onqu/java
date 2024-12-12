package com.forms.to.angular.oracle_form.guay_motivos.util;


import java.io.IOException;
import com.forms.to.angular.oracle_form.guay_motivos.entities.GuayMotivos;
import com.lowagie.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.xhtmlrenderer.pdf.ITextRenderer;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Component
public class MotivosPdfGeneration {
    @Autowired
    private TemplateEngine templateEngine;

    public Map<String, String> generate(List<GuayMotivos> guayMotivosList) throws IOException, DocumentException {
        Map<String, String> response = new HashMap<>();
        try{
            LocalDate currentDate = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yy");
            String formattedDate = currentDate.format(formatter);


            Context context = new Context();
            context.setVariable("guayMotivosList", guayMotivosList);
            context.setVariable("formattedDate", formattedDate);
            String processedHtml = templateEngine.process("guay-motivos-template", context);

            String pdfName = "Guay_Motivos_" + System.currentTimeMillis() + ".pdf";
            String pdfDirectory = "src/main/resources/guaymotivos/";
            String pdfFilePath = pdfDirectory + pdfName;

            ITextRenderer renderer = new ITextRenderer();
            renderer.setDocumentFromString(processedHtml);
            renderer.layout();

            try (FileOutputStream fos = new FileOutputStream(pdfFilePath)) {
                renderer.createPDF(fos);
            }
            Thread.sleep(3000); // 2000 milliseconds = 2 seconds

            String pdfLink = "https://oracleconversionapi.mo.vc/api/guaymotivos/pdfview?filename=" + pdfName;
 
            response.put("pdf_link", pdfLink);
            response.put("pdf_name", pdfName);

            return response;
        } catch (Exception e) {
            
            System.err.println("Unexpected error: " + e.getMessage());
            e.printStackTrace();
            response.put("pdf_link", null);
            response.put("pdf_name", null);
            return response; 
        }
    }
}
