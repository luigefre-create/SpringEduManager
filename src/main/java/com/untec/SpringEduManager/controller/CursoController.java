package com.untec.SpringEduManager.controller;

import com.untec.SpringEduManager.model.Curso;
import com.untec.SpringEduManager.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public String listarCursos(Model model) {
        model.addAttribute("cursos", cursoService.obtenerTodos());
        model.addAttribute("nuevoCurso", new Curso());
        return "cursos";
    }

    @PostMapping
    public String guardarCurso(@ModelAttribute Curso curso) {
        cursoService.guardar(curso);
        return "redirect:/cursos";
    }
}