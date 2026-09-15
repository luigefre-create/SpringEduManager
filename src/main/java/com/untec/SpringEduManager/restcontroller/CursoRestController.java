package com.untec.SpringEduManager.restcontroller;

import com.untec.SpringEduManager.model.Curso;
import com.untec.SpringEduManager.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoRestController {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<Curso> listar() {
        return cursoService.obtenerTodos();
    }

    @PostMapping
    public Curso crear(@RequestBody Curso curso) {
        return cursoService.guardar(curso);
    }
}