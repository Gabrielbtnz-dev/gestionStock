package com.gestionStock.gestionStock.Service;

import com.gestionStock.gestionStock.Domain.Producto;
import com.gestionStock.gestionStock.Model.ProductoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    private final ProductoRepository productoReposi;

    public ProductoService(ProductoRepository productoReposi) {
        this.productoReposi = productoReposi;
    }

    public List<Producto> getProductos(){
        return productoReposi.findAll();
    }

    public Producto postProducto(Producto producto){
        productoReposi.save(producto);
        return producto;
    }

    public ResponseEntity<String> putProducto(Long id, Producto producto){
        return productoReposi.findById(id)
                .map(productoExistente ->{
                        if (producto.getNombre() != null){
                            productoExistente.setNombre(producto.getNombre());
                        }
                        if (producto.getPrecio() != null){
                            productoExistente.setPrecio(producto.getPrecio());
                        }
                        if (producto.getControlaStock() != null){
                            productoExistente.setControlaStock(producto.getControlaStock());
                        }
                        productoReposi.save(productoExistente);
                    return ResponseEntity.ok("Producto editado con exito");
                })
                 .orElse(ResponseEntity.badRequest().body("Algo salio mal"));
    }

}
