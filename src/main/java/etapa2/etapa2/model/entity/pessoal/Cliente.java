package etapa2.etapa2.model.entity.pessoal;

import java.util.Set;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
// @DiscriminatorValue(value = "Cliente")
public class Cliente extends Pessoa {
    private int id_cliente;
    // private Set<Venda> compra;
}
