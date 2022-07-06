package etapa2.etapa2.model.service.commercial;

import etapa2.etapa2.exception.commercial.FlorNotFoundException;
import etapa2.etapa2.model.entity.comercial.Planta;
import etapa2.etapa2.model.repositories.FloriculturaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public class FlorService {
    private FloriculturaRepository FloriculturaRepository;

    public FlorService(FloriculturaRepository FloriculturaRepository) {
        this.FloriculturaRepository = FloriculturaRepository;
    }

    public ResponseEntity<Planta> findById(int id) {
        Optional<Planta> Flor = FloriculturaRepository.findById(id);
        if (!Flor.isPresent()) {
            throw new FlorNotFoundException("Flor não encontrada");
        }
        return new ResponseEntity<>(Flor.get(), HttpStatus.OK);
    }

    public List<Planta> findAll() {
        return FloriculturaRepository.findAll();
    }

    public Planta save(Planta Flor) {
        return FloriculturaRepository.save(Flor);
    }

    public void delete(int id) {
        FloriculturaRepository.deleteById(id);
    }

}
