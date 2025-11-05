package com.cetis.profesor.operaciones.controlador;

import com.cetis.profesor.operaciones.modelo.Operacion;
import com.cetis.profesor.operaciones.servicio.OperacionServicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OperacionControlador {

    private final OperacionServicio operacionServicio;

    public OperacionControlador(OperacionServicio operacionServicio) {
        this.operacionServicio = operacionServicio;
    }

    @GetMapping("/")
    public String index(Model model) {
        // Insertar operacion de prueba si la BD está vacía
        if (operacionServicio.obtenerTodos().isEmpty()) {
            operacionServicio.guardar(new Operacion("Emiliano", "emiliano.figueroa@mail.com"));
            operacionServicio.guardar(new Operacion("Ulises", "ulises.garcia@mail.com"));
        }
        model.addAttribute("currentLanguage", "es");
        model.addAttribute("operacions", operacionServicio.obtenerTodos());
        model.addAttribute("operacionNuevo", new Operacion()); // para el formulario
        return "index"; // templates/index.html
    }
    
    @GetMapping("/conthy")
    @ResponseBody
    public String index() {
        return "basico"; // templates/basico.html
    }
    
    @PostMapping("/sumar")
    @ResponseBody
    public String sumar(@RequestParam int num1,
                        @RequestParam int num2,
                        Model model) {
        int resultado = num1 - num2;
        model.addAttribute("resultado", resultado);
        return "basico";
    }
}
