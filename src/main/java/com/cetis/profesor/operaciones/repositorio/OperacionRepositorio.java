package com.cetis.profesor.operaciones.repositorio;

import com.cetis.profesor.operaciones.modelo.Operacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperacionRepositorio extends JpaRepository<Operacion, Long> {
    Operacion findByCorreo(String correo);
}
