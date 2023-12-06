package br.edu.unisep.felipe.preco_trechos_service.service;

import br.edu.unisep.felipe.preco_trechos_service.model.PrecoTrecho;
import br.edu.unisep.felipe.preco_trechos_service.repository.PrecoTrechoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrecoTrechoService {

    private final PrecoTrechoRepository precoTrechoRepository;

    @Autowired
    public PrecoTrechoService(PrecoTrechoRepository precoTrechoRepository) {
        this.precoTrechoRepository = precoTrechoRepository;
    }

    public List<PrecoTrecho> listarPrecosTrechos() {
        return precoTrechoRepository.findAll();
    }

    public Optional<PrecoTrecho> consultarPrecoTrecho(Long id) {
        return precoTrechoRepository.findById(id);
    }


    public PrecoTrecho criarPrecoTrecho(PrecoTrecho precoTrecho) {
        return new PrecoTrecho();
    }
}


