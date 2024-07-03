package pe.edu.cibertec.DSWII_T3_AyalaLuis.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Service
public class FileService implements IFileService {

    private final Path pathFolder = Paths.get("Images");

    @Override
    public void guardarArchivo(MultipartFile archivo) throws Exception {
        String originalFilename = archivo.getOriginalFilename();
        if (originalFilename == null || !originalFilename.endsWith(".png")) {
            throw new IllegalArgumentException("Solo se permiten archivos con extensión .png");
        }
        Files.copy(archivo.getInputStream(),
                this.pathFolder.resolve(archivo.getOriginalFilename()));
    }

    @Override
    public void guardarArchivos(List<MultipartFile> archivosList) throws Exception {
        for(MultipartFile archivo : archivosList){
            this.guardarArchivo(archivo);
        }
    }
}
