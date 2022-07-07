package etapa2.etapa2.model.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String tipo;
    private String nome;
    private String descricao;
    private float valor;
    private int id_planta;
    // @OneToOne
    // private etapa2.etapa2.model.entity.Planta planta;
    // @OneToMany(mappedBy="Vendas")
    // private Set<Produto> vendas;
}
