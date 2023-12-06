package br.unisep.edu.felipe.ordemcompraservice.controller;

import br.unisep.edu.felipe.ordemcompraservice.model.OrdemCompra;
import br.unisep.edu.felipe.ordemcompraservice.service.OrdemCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ordem-compra")
public class OrdemCompraController {

    private final OrdemCompraService ordemCompraService;

    @Autowired
    public OrdemCompraController(OrdemCompraService ordemCompraService) {
        this.ordemCompraService = ordemCompraService;
    }

    @PostMapping("/criar")
    public ResponseEntity<String> criarOrdemCompra(@RequestBody OrdemCompra ordemCompra) {

        return ResponseEntity.ok("Ordem de compra criada com sucesso");
    }

    @GetMapping("/listar")
    public ResponseEntity<List<OrdemCompra>> listarOrdensCompra() {

        List<OrdemCompra> ordensCompra = ordemCompraService.listarOrdensCompra();
        return ResponseEntity.ok(ordensCompra);
    }


}
