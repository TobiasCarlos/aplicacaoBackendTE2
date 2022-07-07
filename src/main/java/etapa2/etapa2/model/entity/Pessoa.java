package etapa2.etapa2.model.entity;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "class")

@Entity


public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String endereco;
    private String email;
    private long telefone;

    public String getNome(){
        return nome;
    }

    public String setNome(String nome){
        return this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public String setEndereco(String endereco){
        return this.endereco = endereco;
    }

    public String getEmail(){
        return email;
    }

    public String setEmail(String email){
        return this.email = email;
    }

    public long getTelefone(){
        return telefone;
    }

    public long setTelefone(long telefone){
        return this.telefone = telefone;
    }




    // @OneToOne
    // private Funcionario funcionario;
    // @OneToOne
    // private Cliente cliente;
    // @OneToOne
    // private Usuario usuario;
}
