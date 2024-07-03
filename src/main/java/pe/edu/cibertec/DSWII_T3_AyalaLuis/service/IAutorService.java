package pe.edu.cibertec.DSWII_T3_AyalaLuis.service;

import pe.edu.cibertec.DSWII_T3_AyalaLuis.model.bd.Autor;

import java.util.Optional;

interface IAutorService {
    Optional<Autor> obtenerAutorXId(int id);
}
