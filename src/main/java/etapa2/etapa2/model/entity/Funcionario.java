package etapa2.etapa2.model.entity;

import etapa2.etapa2.model.entity.Pessoa;
import etapa2.etapa2.model.entity.Venda;

import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
// @DiscriminatorValue(value = "Funcionario")

public class Funcionario extends Pessoa {
    private int id_cliente;
   // private Set<Venda> vendas;
}
