package br.unisep.edu.felipe.companhiasaereasservice.repository;



import br.unisep.edu.felipe.companhiasaereasservice.model.CompanhiaAerea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanhiaAereaRepository extends JpaRepository<CompanhiaAerea, Long> {


    List<CompanhiaAerea> findByNome(String nome);

    @Query("SELECT c FROM CompanhiaAerea c WHERE c.codigoIATA = :codigoIATA")
    CompanhiaAerea findByCodigoIATA(String codigoIATA);
}
