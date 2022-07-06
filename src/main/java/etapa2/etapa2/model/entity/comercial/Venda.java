package etapa2.etapa2.model.entity.comercial;

import etapa2.etapa2.model.entity.comercial.Produto;
import etapa2.etapa2.model.entity.pessoal.Cliente;
import etapa2.etapa2.model.entity.pessoal.Funcionario;

import org.springframework.util.unit.DataSize;

import java.util.Set;

import javax.persistence.*;

@Entity

public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int qtd;
    private float preco_total;
    private DataSize date;
    private Produto produto;
    private Cliente cliente;
    private Funcionario funcionario;
    private int id_venda;
    private Set<Cliente> compras;
    @OneToMany(mappedBy = "Venda")
    private Set<Funcionario> vendas;
}