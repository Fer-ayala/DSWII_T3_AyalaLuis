package pe.edu.cibertec.DSWII_T3_AyalaLuis.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_T3_AyalaLuis.model.bd.Autor;
import pe.edu.cibertec.DSWII_T3_AyalaLuis.model.bd.Publicacion;
import pe.edu.cibertec.DSWII_T3_AyalaLuis.model.dto.PublicacionDto;
import pe.edu.cibertec.DSWII_T3_AyalaLuis.repository.PublicacionRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class PublicacionService implements IPublicacionService {

    private PublicacionRepository publicacionRepository;

    @Override
    public List<Publicacion> obtenerPublicaciones() {
        return publicacionRepository.findAll();
    }

    @Override
    public Autor obtenerAutorxIdPublicacion(int id) {
        Optional<Publicacion> pub = publicacionRepository.findById(id);
        if(pub.isPresent()){
            return pub.get().getAutor();
        }
        return null;
    }

}
