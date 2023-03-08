package com.mpm.seguridad.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpm.seguridad.models.Permiso;
import com.mpm.seguridad.repository.PermisoRepository;

@Service
public class PermisoService {

    @Autowired
    private PermisoRepository permisoRepository;

    public Permiso createPermiso(Permiso permiso) {
        return permisoRepository.save(permiso);
    }

    public Permiso updatePermiso(Permiso permiso) {
        return permisoRepository.save(permiso);
    }

    public void deletePermiso(Long permisoId) {
        permisoRepository.deleteById(permisoId);
    }

    public Permiso getPermiso(Long permisoId) {
        return permisoRepository.findById(permisoId).orElse(null);
    }

    public List<Permiso> getAllPermisos() {
        return permisoRepository.findAll();
    }
}
