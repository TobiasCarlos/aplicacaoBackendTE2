package etapa2.etapa2.model.entity;

import etapa2.etapa2.model.entity.Pessoa;

import javax.persistence.*;
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String login;
    private String senha;
    @OneToOne
    private Pessoa pessoa;
}
