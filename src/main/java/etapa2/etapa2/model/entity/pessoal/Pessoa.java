package etapa2.etapa2.model.entity.pessoal;

import javax.persistence.*;

import etapa2.etapa2.model.entity.comercial.Usuario;

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
