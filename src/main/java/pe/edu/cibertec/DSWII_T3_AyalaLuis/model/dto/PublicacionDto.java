package pe.edu.cibertec.DSWII_T3_AyalaLuis.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class PublicacionDto implements DtoEntity {
    String titulo;
    String resumen;
    Date fechpublicacion;
    String nomautor;
    String apeautor;
}
