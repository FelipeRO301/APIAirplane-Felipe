package br.edu.unisep.felipe.clientes_service.repository;

import br.edu.unisep.felipe.clientes_service.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}