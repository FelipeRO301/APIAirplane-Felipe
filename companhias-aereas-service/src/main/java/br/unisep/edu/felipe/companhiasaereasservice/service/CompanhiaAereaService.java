package br.unisep.edu.felipe.companhiasaereasservice.service;

import br.unisep.edu.felipe.companhiasaereasservice.model.CompanhiaAerea;
import br.unisep.edu.felipe.companhiasaereasservice.repository.CompanhiaAereaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanhiaAereaService {

    private final CompanhiaAereaRepository companhiaAereaRepository;

    @Autowired
    public CompanhiaAereaService(CompanhiaAereaRepository companhiaAereaRepository) {
        this.companhiaAereaRepository = companhiaAereaRepository;
    }

    public List<CompanhiaAerea> listarCompanhiasAereas() {
        return companhiaAereaRepository.findAll();
    }

    public CompanhiaAerea consultarCompanhiaAerea(Long id) {
        Optional<CompanhiaAerea> companhiaAereaOptional = companhiaAereaRepository.findById(id);
        return companhiaAereaOptional.orElse(null);
    }


}