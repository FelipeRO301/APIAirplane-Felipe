package br.edu.unisep.felipe.preco_trechos_service.controller;

import br.edu.unisep.felipe.preco_trechos_service.model.PrecoTrecho;
import br.edu.unisep.felipe.preco_trechos_service.service.PrecoTrechoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/preco-trechos")
public class PrecoTrechoController {

    private final PrecoTrechoService precoTrechoService;

    @Autowired
    public PrecoTrechoController(PrecoTrechoService precoTrechoService) {
        this.precoTrechoService = precoTrechoService;
    }

    @GetMapping
    public List<PrecoTrecho> listarPrecosTrechos() {
        return precoTrechoService.listarPrecosTrechos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PrecoTrecho> consultarPrecoTrecho(@PathVariable Long id) {
        Optional<PrecoTrecho> precoTrechoOptional = precoTrechoService.consultarPrecoTrecho(id);
        return precoTrechoOptional
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }



    @PostMapping
    public ResponseEntity<PrecoTrecho> criarPrecoTrecho(@RequestBody PrecoTrecho precoTrecho) {
        PrecoTrecho novoPrecoTrecho = precoTrechoService.criarPrecoTrecho(precoTrecho);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoPrecoTrecho);
    }


}