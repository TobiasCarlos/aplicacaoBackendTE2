package etapa2.etapa2.model.entity;

import etapa2.etapa2.model.entity.Planta;

import javax.persistence.*;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String tipo;
    private String nome;
    private String descricao;
    private float valor;
    @ManyToOne
    private Planta planta;
}
