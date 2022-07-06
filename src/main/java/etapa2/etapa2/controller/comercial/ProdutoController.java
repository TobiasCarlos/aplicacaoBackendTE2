package etapa2.etapa2.controller.comercial;

import etapa2.etapa2.model.entity.comercial.Produto;
// import etapa2.etapa2.model.service.commercial.PlanoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import etapa2.etapa2.exception.ProdutoNotFoundException;
import etapa2.etapa2.exception.commercial.FlorNotFoundException;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/planos")
public class ProdutoController {

    // private PlanoService planoService;

    // public PlanoController(PlanoService planoService) {
    // this.planoService = planoService;
    // }

    // implementacao de metodos para tratamento das requisicoes correspondentes
    // `as operacoes CRUD para Plano:

    // operacoes Read:

    // obtem uma lista dos planos cadastrados
    // @GetMapping
    // public List<Plano> list() {
    // // fazer uma consulta no BD
    // return planoService.list();
    // }

    // // obtem dados de um plano
    // @GetMapping("/{id}")
    // public ResponseEntity<Plano> show(@PathVariable Long id) {
    // try {
    // return new ResponseEntity<Plano>(planoService.getPlano(id),
    // HttpStatus.OK);
    // } catch (PlanoNotFoundException planoNotFoundException) {
    // return new ResponseEntity<Plano>(HttpStatus.NOT_FOUND);
    // }
    // }

    // // operacao Create
    // @PostMapping
    // public ResponseEntity<Plano> save(@Valid @RequestBody Plano plano) {
    // try {
    // return new ResponseEntity<Plano>(planoService.save(plano), HttpStatus.OK);
    // } catch (OperadoraNotFoundException operadoraNotFoundException) {
    // return new ResponseEntity<Plano>(HttpStatus.NOT_FOUND);
    // }
    // }

    // // operacao Update
    // @PutMapping("/{id}")
    // public ResponseEntity<Plano> update(@PathVariable Long id, @Valid
    // @RequestBody Plano plano) {
    // try {
    // return new ResponseEntity<Plano>(planoService.update(id, plano),
    // HttpStatus.OK);
    // } catch (PlanoNotFoundException planoNotFoundException) {
    // return new ResponseEntity<Plano>(HttpStatus.NOT_FOUND);
    // }
    // }

    // // operacao Delete
    // @DeleteMapping("/{id}")
    // public ResponseEntity<Plano> delete(@PathVariable Long id) {
    // try {
    // planoService.delete(id);
    // return new ResponseEntity<Plano>(HttpStatus.NO_CONTENT);
    // } catch (PlanoNotFoundException planoNotFoundException) {
    // return new ResponseEntity<Plano>(HttpStatus.NOT_FOUND);
    // }
    // }

    // // reajusta o valor por minuto de acordo com
    // // uma regra de negocio
    // @PutMapping("/reajusta/{id}")
    // public ResponseEntity<Plano> reajusta(@PathVariable Long id) {
    // try {
    // return new ResponseEntity<Plano>(planoService.reajusta(id),
    // HttpStatus.OK);
    // } catch (PlanoNotFoundException planoNotFoundException) {
    // System.out.println(planoNotFoundException.getMessage());
    // return new ResponseEntity<Plano>(HttpStatus.NOT_FOUND);
    // }
    // }
}
