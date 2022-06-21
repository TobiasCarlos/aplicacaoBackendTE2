package etapa2.etapa2.model.entity;
import javax.persistence.*;
@Entity
public class Planta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Especie;
    private String Cor;
    private String Periodo_flora;
    private String Origem;
}
