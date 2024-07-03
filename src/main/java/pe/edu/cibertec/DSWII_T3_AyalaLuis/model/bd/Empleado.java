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
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idempleado;
    String nombre;
    String apellido;
    Date fechacontrat;

    @ManyToOne
    @JoinColumn(name = "iddomicilio")
    private Domicilio domicilio;
}
