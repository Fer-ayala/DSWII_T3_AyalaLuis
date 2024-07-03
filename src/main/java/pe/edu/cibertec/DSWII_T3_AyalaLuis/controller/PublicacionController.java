package pe.edu.cibertec.DSWII_T3_AyalaLuis.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.DSWII_T3_AyalaLuis.model.dto.DtoEntity;
import pe.edu.cibertec.DSWII_T3_AyalaLuis.model.dto.PublicacionDto;
import pe.edu.cibertec.DSWII_T3_AyalaLuis.service.IPublicacionService;
import pe.edu.cibertec.DSWII_T3_AyalaLuis.service.PublicacionService;
import pe.edu.cibertec.DSWII_T3_AyalaLuis.util.DtoUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@PreAuthorize("hasRole('COORDINADOR')")
@AllArgsConstructor
@RestController
@RequestMapping("api/v1/pubs-dto")
public class PublicacionController {

    private IPublicacionService iPublicacionService;

    @GetMapping("")
    public ResponseEntity<List<DtoEntity>> listarPublicacionesDto(){
        List<DtoEntity> publicacionDtoList = new ArrayList<>();
        publicacionDtoList = iPublicacionService.obtenerPublicaciones()
                .stream()
                .map(x -> new DtoUtil().convertirADto(x, new PublicacionDto()))
                .collect(Collectors.toList());
        if(publicacionDtoList.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(publicacionDtoList, HttpStatus.OK);
    }

}
