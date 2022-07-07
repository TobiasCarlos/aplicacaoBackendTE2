package etapa2.etapa2.model.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity

public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int qtd;
    private float preco_total;
    private Date date;
    private int id_funcionario;
    private int id_cliente;
    private int id_produto;
    // @OneToMany
    // private Produto produto;
    // @ManyToOne
    // private Cliente cliente;
    // @ManyToMany
    // private Funcionario funcionario;
    private int id_venda;
    // @OneToMany(mappedBy="Pessoa")
    // private Set<etapa2.etapa2.model.entity.Cliente> compras;
    // @OneToMany(mappedBy="Funcionario")
    // private Set<etapa2.etapa2.model.entity.Funcionario> vendas;
}