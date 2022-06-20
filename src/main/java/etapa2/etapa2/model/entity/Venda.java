package etapa2.etapa2.model.entity;
import etapa2.etapa2.model.entity.Cliente;
import etapa2.etapa2.model.entity.Funcionario;
import etapa2.etapa2.model.entity.Produto;
import org.springframework.util.unit.DataSize;

import java.util.Set;

public class Venda {
    private int qtd;
    private float preco_total;
    private DataSize date;
    private Produto produto;
    private Cliente cliente;
    private Funcionario funcionario;
    private int id_venda;
    private Set<Cliente> compras;
    private Set<Funcionario> vendas;
}