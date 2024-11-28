package com.dreamsquad.DreamSquadApi.controller;


import com.dreamsquad.DreamSquadApi.model.YmlCatalog;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.StringReader;
import java.util.Properties;

@RestController
public class SaleController {
    @PostMapping("/convert-xml-to-json")
    public ResponseEntity<?> convertXmlToJson(@RequestBody String xmlData) {
        try {
            // Парсим XML в Java-объект
            JAXBContext jaxbContext = JAXBContext.newInstance(YmlCatalog.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            StringReader reader = new StringReader  (xmlData);
            YmlCatalog catalog = (YmlCatalog) unmarshaller.unmarshal(reader);

            // Возвращаем объект в JSON формате
            return ResponseEntity.ok(catalog);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Ошибка: " + e.getMessage());
        }
    }


}
