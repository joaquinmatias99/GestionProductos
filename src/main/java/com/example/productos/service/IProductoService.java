package com.example.productos.service;

import com.example.productos.model.Producto;

import java.util.List;

public interface IProductoService
{
    public Producto getProductoById(Long id);

    public List<Producto> getProductos();

    public void saveProducto(Producto producto);

    public void deleteProducto(Long id);

    public void editProducto(Long id, Producto producto);

    public List<Producto> getProductoByNombre(String nombre);

    public List<Producto> getProductosByPrecioMayor();

    public List<Producto> getProductosByPrecioMenor();


}
