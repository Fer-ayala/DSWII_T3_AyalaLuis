package pe.edu.cibertec.DSWII_T3_AyalaLuis.model.bd;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "publicacion")
public class Publicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idpublicacion;
    String titulo;
    String resumen;
    Date fechpublicacion;

    @ManyToOne
    @JoinColumn(name = "idautor")
    private Autor autor;
}
