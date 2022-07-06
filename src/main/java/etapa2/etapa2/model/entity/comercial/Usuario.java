package etapa2.etapa2.model.entity.comercial;

import javax.persistence.*;

import etapa2.etapa2.model.entity.pessoal.Pessoa;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String login;
    private String senha;
    @OneToOne
    private Pessoa pessoa;
}
