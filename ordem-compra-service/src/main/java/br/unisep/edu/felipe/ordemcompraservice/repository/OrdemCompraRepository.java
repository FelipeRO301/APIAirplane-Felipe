package br.unisep.edu.felipe.ordemcompraservice.repository;

import br.unisep.edu.felipe.ordemcompraservice.model.OrdemCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdemCompraRepository extends JpaRepository<OrdemCompra, Long> {


    List<OrdemCompra> findByCliente(String cliente);


    @Query("SELECT o FROM OrdemCompra o WHERE o.destino = :destino")
    List<OrdemCompra> findByDestino(String destino);
}