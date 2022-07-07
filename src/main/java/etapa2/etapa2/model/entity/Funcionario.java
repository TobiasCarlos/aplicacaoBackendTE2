package etapa2.etapa2.model.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import javax.persistence.*;
import java.util.Set;

@Entity
// @DiscriminatorValue(value = "Funcionario");

public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int id_pessoa;

    public int getIdFuncionario(){
        return id;
    }

    public int setIdPessoal(int id){
        return this.id_pessoa = id;
    }

    // @OneToMany
    // private Venda vendas;
    // @OneToOne
    // private Pessoa pessoa;
    // @OneToMany(mappedBy="FUnc")
    // private Set<etapa2.etapa2.model.entity.Venda> vendas;
   // private Set<Venda> vendas;
}
