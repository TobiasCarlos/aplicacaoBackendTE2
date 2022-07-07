package etapa2.etapa2.model.entity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import etapa2.etapa2.model.entity.Pessoa;

public interface PessoaRepositories extends JpaRepository<Pessoa, Long> {

    // Pessoa update(Long id, Pessoa pessoa);
    
}
