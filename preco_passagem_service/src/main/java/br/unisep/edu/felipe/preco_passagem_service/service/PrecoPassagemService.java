package br.unisep.edu.felipe.preco_passagem_service.service;

import br.unisep.edu.felipe.preco_passagem_service.model.PrecoPassagem;
import br.unisep.edu.felipe.preco_passagem_service.repository.PrecoPassagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrecoPassagemService {

    private final PrecoPassagemRepository precoPassagemRepository;

    @Autowired
    public PrecoPassagemService(PrecoPassagemRepository precoPassagemRepository) {
        this.precoPassagemRepository = precoPassagemRepository;
    }

    public List<PrecoPassagem> listarPrecosPassagens() {
        return precoPassagemRepository.findAll();
    }

    public PrecoPassagem consultarPrecoPassagem(Long id) {
        Optional<PrecoPassagem> precoPassagemOptional = precoPassagemRepository.findById(id);
        return precoPassagemOptional.orElse(null);
    }


}