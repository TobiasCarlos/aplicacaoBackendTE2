package etapa2.etapa2.model.entity;

import etapa2.etapa2.model.entity.Pessoa;
import etapa2.etapa2.model.entity.Venda;

import java.util.Set;

public class Cliente extends Pessoa {
    private int id_cliente;
    private Set<Venda> compra;
}
