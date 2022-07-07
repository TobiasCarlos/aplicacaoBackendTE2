package etapa2.etapa2.model.entity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import etapa2.etapa2.model.entity.Usuario;

public interface ClienteRepositories extends JpaRepository<Usuario, Long> {
    
}
