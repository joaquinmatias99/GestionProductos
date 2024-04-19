package com.example.productos.repository;

import com.example.productos.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductoRepository extends JpaRepository <Producto,Long> {

    List<Producto> findByNombre(String nombre);
    List<Producto> findByOrderByPrecioAsc();
    List<Producto> findByOrderByPrecioDesc();
}
