package etapa2.etapa2.exception.commercial;

public class FlorNotFoundException extends RuntimeException {
    public FlorNotFoundException(Long id) {
        super("Flor #" + id + "não encontrado");
    }
}