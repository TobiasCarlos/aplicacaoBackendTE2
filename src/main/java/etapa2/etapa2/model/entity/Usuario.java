package etapa2.etapa2.model.entity;

import etapa2.etapa2.model.entity.Pessoa;

import javax.persistence.*;
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String login;
    private String senha;
    private int id_pessoa;
    // @OneToOne
    // private Pessoa pessoa;
}
