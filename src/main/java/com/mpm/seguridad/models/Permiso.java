package com.mpm.seguridad.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
public class Permiso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToMany(mappedBy = "permisos")
    private List<Usuario> usuarios;

    @Transient
    private boolean hasPermiso;

    public Permiso(String descripcion, List<Usuario> usuarios, boolean hasPermiso) {
        this.descripcion = descripcion;
        this.usuarios = usuarios;
        this.hasPermiso = hasPermiso;
    }

    public Permiso(long codigo, String descripcion, List<Usuario> usuarios, boolean hasPermiso) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.usuarios = usuarios;
        this.hasPermiso = hasPermiso;
    }

    public Permiso(long codigo) {
        this.codigo = codigo;
    }

    public Permiso() {
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public boolean isHasPermiso() {
        return hasPermiso;
    }

    public void setHasPermiso(boolean hasPermiso) {
        this.hasPermiso = hasPermiso;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (codigo ^ (codigo >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Permiso other = (Permiso) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
