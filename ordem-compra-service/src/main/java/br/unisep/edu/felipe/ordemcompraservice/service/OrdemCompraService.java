package br.unisep.edu.felipe.ordemcompraservice.service;

import br.unisep.edu.felipe.ordemcompraservice.model.OrdemCompra;
import br.unisep.edu.felipe.ordemcompraservice.repository.OrdemCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdemCompraService {

    private final OrdemCompraRepository ordemCompraRepository;

    @Autowired
    public OrdemCompraService(OrdemCompraRepository ordemCompraRepository) {
        this.ordemCompraRepository = ordemCompraRepository;
    }

    public List<OrdemCompra> listarOrdensCompra() {
        return ordemCompraRepository.findAll();
    }



}
