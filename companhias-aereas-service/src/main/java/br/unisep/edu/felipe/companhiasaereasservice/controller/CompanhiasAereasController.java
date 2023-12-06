package br.unisep.edu.felipe.companhiasaereasservice.controller;


import br.unisep.edu.felipe.companhiasaereasservice.model.CompanhiaAerea;
import br.unisep.edu.felipe.companhiasaereasservice.service.CompanhiaAereaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/companhias-aereas")
public class CompanhiasAereasController {

    private final CompanhiaAereaService companhiaAereaService;

    @Autowired
    public CompanhiasAereasController(CompanhiaAereaService companhiaAereaService) {
        this.companhiaAereaService = companhiaAereaService;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<CompanhiaAerea>> listarCompanhiasAereas() {
        List<CompanhiaAerea> companhiasAereas = companhiaAereaService.listarCompanhiasAereas();
        return ResponseEntity.ok(companhiasAereas);
    }

    @GetMapping("/consultar/{id}")
    public ResponseEntity<CompanhiaAerea> consultarCompanhiaAerea(@PathVariable Long id) {
        CompanhiaAerea companhiaAerea = companhiaAereaService.consultarCompanhiaAerea(id);
        if (companhiaAerea != null) {
            return ResponseEntity.ok(companhiaAerea);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}






