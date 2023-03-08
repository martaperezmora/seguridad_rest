package com.mpm.seguridad;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mpm.seguridad.models.Permiso;
import com.mpm.seguridad.models.Usuario;
import com.mpm.seguridad.repository.PermisoRepository;
import com.mpm.seguridad.repository.UsuarioRepository;

@SpringBootTest
class SeguridadApplicationTests {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Autowired
	PermisoRepository permisoRepository;

	@Test
	void crearUsuarios() {

		Permiso alumno = new Permiso();
		alumno.setDescripcion("ALUMNO");

		Permiso asig = new Permiso();
		asig.setDescripcion("ASIGNATURA");

		Usuario u1 = new Usuario();
		u1.setNombre("usuario1");


	}

}
