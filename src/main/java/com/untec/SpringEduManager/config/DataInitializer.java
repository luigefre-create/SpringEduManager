package com.untec.SpringEduManager.config;

import com.untec.SpringEduManager.model.Curso;
import com.untec.SpringEduManager.model.Estudiante;
import com.untec.SpringEduManager.repository.CursoRepository;
import com.untec.SpringEduManager.repository.EstudianteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(EstudianteRepository estRepo, CursoRepository cursoRepo) {
        return args -> {
            if (estRepo.count() == 0) {
                estRepo.save(new Estudiante("Edgar Pérez", "edgar@gmail.com"));
                estRepo.save(new Estudiante("Ana Morales", "ana.morales@gmail.com"));
            }
            if (cursoRepo.count() == 0) {
                cursoRepo.save(new Curso("Desarrollo Web Java", "Spring Boot, JPA y Thymeleaf"));
                cursoRepo.save(new Curso("Bases de Datos", "Modelado SQL y H2 en memoria"));
            }
        };
    }
}