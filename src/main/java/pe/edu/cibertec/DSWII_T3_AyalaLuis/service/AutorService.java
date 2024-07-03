package pe.edu.cibertec.DSWII_T3_AyalaLuis.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_T3_AyalaLuis.model.bd.Autor;
import pe.edu.cibertec.DSWII_T3_AyalaLuis.repository.AutorRepository;

import java.util.Optional;

@AllArgsConstructor
@Service
public class AutorService implements IAutorService {

    AutorRepository autorRepository;

    @Override
    public Optional<Autor> obtenerAutorXId(int id) {
        return autorRepository.findById(id);
    }
}
