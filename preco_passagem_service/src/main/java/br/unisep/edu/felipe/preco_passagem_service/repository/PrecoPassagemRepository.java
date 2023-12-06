package br.unisep.edu.felipe.preco_passagem_service.repository;

import br.unisep.edu.felipe.preco_passagem_service.model.PrecoPassagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrecoPassagemRepository extends JpaRepository<PrecoPassagem, Long> {


    List<PrecoPassagem> findByDestino(String destino);


    @Query("SELECT p FROM PrecoPassagem p WHERE p.origem = :origem")
    List<PrecoPassagem> findByOrigem(String origem);
}