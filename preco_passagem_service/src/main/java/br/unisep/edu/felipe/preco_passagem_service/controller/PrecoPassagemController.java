package br.unisep.edu.felipe.preco_passagem_service.controller;

import br.unisep.edu.felipe.preco_passagem_service.model.PrecoPassagem;
import br.unisep.edu.felipe.preco_passagem_service.service.PrecoPassagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/precos-passagens")
public class PrecoPassagemController {

    private final PrecoPassagemService precoPassagemService;

    @Autowired
    public PrecoPassagemController(PrecoPassagemService precoPassagemService) {
        this.precoPassagemService = precoPassagemService;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<PrecoPassagem>> listarPrecosPassagens() {
        List<PrecoPassagem> precosPassagens = precoPassagemService.listarPrecosPassagens();
        return ResponseEntity.ok(precosPassagens);
    }

    @GetMapping("/consultar/{id}")
    public ResponseEntity<PrecoPassagem> consultarPrecoPassagem(@PathVariable Long id) {
        PrecoPassagem precoPassagem = precoPassagemService.consultarPrecoPassagem(id);
        if (precoPassagem != null) {
            return ResponseEntity.ok(precoPassagem);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}