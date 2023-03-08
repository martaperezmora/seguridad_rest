package com.mpm.seguridad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpm.seguridad.models.Permiso;

@Repository
public interface PermisoRepository extends JpaRepository<Permiso, Long> {
}
