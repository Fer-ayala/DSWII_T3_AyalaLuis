package pe.edu.cibertec.DSWII_T3_AyalaLuis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_T3_AyalaLuis.model.bd.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor,Integer> {
}
