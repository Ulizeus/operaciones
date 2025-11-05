package com.cetis.profesor.operaciones.servicio;

import com.cetis.profesor.operaciones.modelo.Operacion;
import com.cetis.profesor.operaciones.repositorio.OperacionRepositorio;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class OperacionServicio {

    private final OperacionRepositorio operacionRepositorio;

    // Inyección de dependencias vía constructor
    public OperacionServicio(OperacionRepositorio operacionRepositorio) {
        this.operacionRepositorio = operacionRepositorio;
    }

    // Obtener todos los operaciones
    public List<Operacion> obtenerTodos() {
        return operacionRepositorio.findAll();
    }

    // Guardar operacion
    public Operacion guardar(Operacion operacion) {
        return operacionRepositorio.save(operacion);
    }
}
