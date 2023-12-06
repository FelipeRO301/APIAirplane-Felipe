package br.edu.unisep.felipe.preco_trechos_service.repository;

import br.edu.unisep.felipe.preco_trechos_service.model.PrecoTrecho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrecoTrechoRepository extends JpaRepository<PrecoTrecho, Long> {


    List<PrecoTrecho> findByOrigemAndDestino(String origem, String destino);


    @Query("SELECT p FROM PrecoTrecho p WHERE p.valor < :limite")
    List<PrecoTrecho> findByValorMenorQue(Double limite);
}