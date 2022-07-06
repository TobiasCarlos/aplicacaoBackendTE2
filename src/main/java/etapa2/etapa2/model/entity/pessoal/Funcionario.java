package etapa2.etapa2.model.entity.pessoal;

import etapa2.etapa2.model.entity.comercial.Venda;
import etapa2.etapa2.model.entity.pessoal.Pessoa;

import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
// @DiscriminatorValue(value = "Funcionario")

public class Funcionario extends Pessoa {
    private int id_cliente;
    // private Set<Venda> vendas;
}
