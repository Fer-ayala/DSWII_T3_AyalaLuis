package pe.edu.cibertec.DSWII_T3_AyalaLuis.model.bd;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "domicilio")
public class Domicilio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer iddomicilio;
    String desdomicilio;
    Integer nrodomicilio;
    String refdomicilio;

    @OneToMany(mappedBy = "domicilio")
    private List<Empleado> empleados;
}
