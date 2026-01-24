package com.gestionStock.gestionStock.Controller;

import com.gestionStock.gestionStock.Domain.Producto;
import com.gestionStock.gestionStock.Service.ProductoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoRestController {
    private final ProductoService productoservice;

    public ProductoRestController(ProductoService productoservice) {
        this.productoservice = productoservice;
    }

    @GetMapping
    public List<Producto> getProductos(){
        return productoservice.getProductos();
    }

    @PostMapping
    public ResponseEntity<String> postProducto(@RequestBody Producto producto){
            return productoservice.postProducto(producto);

    }

    @PutMapping("/{id}")
    public ResponseEntity<String> putProducto(@RequestBody Producto producto, @PathVariable Long id){
        return productoservice.putProducto(id,producto);
    }

}
