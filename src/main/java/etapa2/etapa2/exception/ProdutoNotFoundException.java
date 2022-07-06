package etapa2.etapa2.exception;

public class ProdutoNotFoundException {
    public ProdutoNotFoundException(Long id) {
        super("Flor #" + id + "não encontrado");
    }
}
