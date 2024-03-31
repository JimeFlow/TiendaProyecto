package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "contactenos")
public class Contactenos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contactenos")
    private Long idContactenos;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    @OneToMany
    @JoinColumn(name = "id_contactenos", updatable = false)
    List<Producto> productos;

    public Contactenos() {
    }

    public Contactenos(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

}
