package etapa2.etapa2.model.entity;

import etapa2.etapa2.model.entity.Usuario;

import javax.persistence.*;

@Entity

public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nome;
    private String endereco;
    private String email;
    private long telefone;
    private String cpfj;
    @OneToOne
    private Usuario usuario;
}
