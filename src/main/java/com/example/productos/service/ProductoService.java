package com.example.productos.service;

import com.example.productos.model.Producto;
import com.example.productos.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductoService
{

    @Autowired
    private IProductoRepository productoRepo;

    @Override
    public Producto getProductoById(Long id) {
        return productoRepo.findById(id).orElse(null);
    }

    @Override
    public List<Producto> getProductos() {
        return productoRepo.findAll();
    }

    @Override
    public void saveProducto(Producto producto) {
        productoRepo.save(producto);
    }

    @Override
    public void deleteProducto(Long id) {
        productoRepo.deleteById(id);
    }

    @Override
    public void editProducto(Long id, Producto producto) {
        Producto productoExistente = productoRepo.findById(id).orElse(null);
        if (productoExistente != null) {
            productoExistente.setNombre(producto.getNombre());
            productoExistente.setDescripcion(producto.getDescripcion());
            productoExistente.setPrecio(producto.getPrecio());
            productoExistente.setCantidad(producto.getCantidad());
            this.saveProducto(productoExistente);
        }
    }

    @Override
    public List<Producto> getProductoByNombre(String nombre)
    {
        return productoRepo.findByNombre(nombre);
    }

    @Override
    public List<Producto> getProductosByPrecioMayor() {
        return productoRepo.findByOrderByPrecioDesc();
    }

    @Override
    public List<Producto> getProductosByPrecioMenor() {
        return productoRepo.findByOrderByPrecioAsc();
    }


}
