package etapa2.etapa2.model.entity;

import javax.persistence.*;
import java.util.Set;

// @Entity
// @DiscriminatorValue(value = "Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int id_pessoa;

    public int getIdCliente(){
        return id;
    }

    public int setIdPessoal(int id){
        return this.id_pessoa = id;
    }
    // @OneToOne
    // private Cliente venda;

}
