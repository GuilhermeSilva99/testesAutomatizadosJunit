package com.ada.testesUnitariosJunit.repositorio;

import com.ada.testesUnitariosJunit.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
