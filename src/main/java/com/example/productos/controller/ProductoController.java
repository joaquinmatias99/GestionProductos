package com.example.productos.controller;

import com.example.productos.model.Producto;
import com.example.productos.service.IProductoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private IProductoService productoService;

    @Operation(summary = "Trae todos los productos")
    @GetMapping
    public ResponseEntity<List<Producto>> getProductos() {
        List<Producto> productos = productoService.getProductos();
        return ResponseEntity.ok(productos);
    }
    @Operation(summary = "Trae un producto a partir de un id enviado")
    @GetMapping("/id/{id_producto}")
    public ResponseEntity<Producto> getProductoById(@PathVariable Long id_producto) {
        Producto producto = productoService.getProductoById(id_producto);
        if (producto != null) {
            return ResponseEntity.ok(producto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @Operation(summary = "Trae un producto a partir de un nombre enviado")
    @GetMapping("/nombre/{nombre_producto}")
        public List<Producto> getProductoByNombre(@PathVariable String nombre_producto)
        {
            List<Producto> productos = productoService.getProductoByNombre(nombre_producto);
          return productos;
        }
    @Operation(summary = "Trae los productos ordenados por precio de mayor a menor")
    @GetMapping("/precio/mayor")
    public ResponseEntity<List<Producto>> getProductosPrecioMayor() {
        List<Producto> productos = productoService.getProductosByPrecioMayor();
        return ResponseEntity.ok(productos);
    }
    @Operation(summary = "Trae los productos ordenados por precio de menor a mayor")
    @GetMapping("/precio/menor")
    public ResponseEntity<List<Producto>> getProductosPrecioMenor() {
        List<Producto> productos = productoService.getProductosByPrecioMenor();
        return ResponseEntity.ok(productos);
    }
    @Operation(summary = "Guarda los productos")
    @PostMapping
    public ResponseEntity<String> saveProducto(@RequestBody Producto producto) {
        productoService.saveProducto(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body("Producto guardado exitosamente");
    }
    @Operation(summary = "Elimina producto")
    @DeleteMapping("/{id_producto}")
    public ResponseEntity<String> deleteProducto(@PathVariable Long id_producto) {
        if (productoService.getProductoById(id_producto) != null) {
            productoService.deleteProducto(id_producto);
            return ResponseEntity.ok("Producto eliminado exitosamente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("El producto no existe, no se puede eliminar");
        }
    }
    @Operation(summary = "Edita los valores de un producto")
    @PutMapping("/{id_producto}")
    public ResponseEntity<String> editProducto(@PathVariable Long id_producto, @RequestBody Producto producto) {
        if (productoService.getProductoById(id_producto) != null) {
            productoService.editProducto(id_producto, producto);
            return ResponseEntity.ok("Producto editado exitosamente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("El producto no existe, no se puede editar");
        }
    }
}
