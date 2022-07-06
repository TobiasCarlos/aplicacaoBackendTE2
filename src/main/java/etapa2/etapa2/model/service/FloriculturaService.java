package etapa2.etapa2.model.service;

import etapa2.etapa2.exception.ProdutoNotFoundException;
import etapa2.etapa2.model.entity.Floricultura;
import etapa2.etapa2.model.repositories.FloriculturaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

public class FloriculturaService {
    FloriculturaRepository florRepository;

    public FloriculturaService(FloriculturaRepository florRepository) {
        this.florRepository = florRepository;
    }

    public Floricultura findById(int id) {
        Optional<Floricultura> flor = florRepository.findById(id);
        if (!flor.isPresent()) {
            throw new ProdutoNotFoundException("Floricultura não encontrada");
        }
        return flor.get();
    }
}
