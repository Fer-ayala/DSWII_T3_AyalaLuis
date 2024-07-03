package pe.edu.cibertec.DSWII_T3_AyalaLuis.service;

import pe.edu.cibertec.DSWII_T3_AyalaLuis.model.bd.Autor;
import pe.edu.cibertec.DSWII_T3_AyalaLuis.model.bd.Publicacion;
import pe.edu.cibertec.DSWII_T3_AyalaLuis.model.dto.PublicacionDto;

import java.util.List;

public interface IPublicacionService {
    List<Publicacion> obtenerPublicaciones();
    Autor obtenerAutorxIdPublicacion(int id);
}
