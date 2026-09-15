package com.untec.SpringEduManager.controller;

import com.untec.SpringEduManager.model.Estudiante;
import com.untec.SpringEduManager.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    public String listarEstudiantes(Model model) {
        model.addAttribute("estudiantes", estudianteService.obtenerTodos());
        model.addAttribute("nuevoEstudiante", new Estudiante());
        return "estudiantes";
    }

    @PostMapping
    public String guardarEstudiante(@ModelAttribute Estudiante estudiante) {
        estudianteService.guardar(estudiante);
        return "redirect:/estudiantes";
    }
}