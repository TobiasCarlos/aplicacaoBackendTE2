package etapa2.etapa2.controllers;

import etapa2.etapa2.model.entity.Pessoa;
import etapa2.etapa2.model.entity.Venda;
import etapa2.etapa2.model.entity.repositories.PessoaRepositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")

public class CreateUsuarioController {
    @Autowired
    private PessoaRepositories pessoaRepositories;

    public void PessoaController(PessoaRepositories pessoaRepositories){
        this.pessoaRepositories = pessoaRepositories;
    }

    @GetMapping
    public List<Pessoa> list(){
        return pessoaRepositories.findAll();
    }

    @PostMapping
    public Pessoa save(@RequestBody Pessoa pessoa){
        return pessoaRepositories.save(pessoa);
    }

    @PutMapping("/{id}")
    public Pessoa update(@PathVariable Long id, @RequestBody Pessoa pessoa){
        Optional<Pessoa> opt = pessoaRepositories.findById(id);

        Pessoa pessoaUpp = opt.get();

        pessoaUpp.setNome(pessoa.getNome());

        return pessoaRepositories.save(pessoaUpp);
    }

    @DeleteMapping("/{id}")
    public Void delete(@PathVariable Long id){
        pessoaRepositories.deleteById(id);
        return null;
    }

}
