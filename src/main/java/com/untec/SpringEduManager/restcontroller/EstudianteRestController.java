package com.untec.SpringEduManager.restcontroller;

import com.untec.SpringEduManager.model.Estudiante;
import com.untec.SpringEduManager.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteRestController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    public List<Estudiante> listar() {
        return estudianteService.obtenerTodos();
    }

    @PostMapping
    public Estudiante crear(@RequestBody Estudiante estudiante) {
        return estudianteService.guardar(estudiante);
    }
}