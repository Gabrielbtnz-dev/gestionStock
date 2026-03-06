package com.gestionStock.gestionStock.Service;

import com.gestionStock.gestionStock.Domain.Producto;
import com.gestionStock.gestionStock.Model.ProductoRepository;
import dto.ProductoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository productoReposi;

    public ProductoService(ProductoRepository productoReposi) {
        this.productoReposi = productoReposi;
    }

    public List<Producto> getProductos(){
        return productoReposi.findAll()
                .stream().filter(Producto::getStatus)
                .toList();
    }

    public ResponseEntity<String> postProducto(ProductoDTO pDTO){
        if (pDTO.getNombre() == null  || pDTO.getNombre().isBlank() ){
          return  ResponseEntity.badRequest().body("El nombre es obligatorio");
        }
        if (pDTO.getControlaStock() == null){
            return ResponseEntity.badRequest().body("El controla stock si/no es obligatorio");
        }
        if (pDTO.getIva() == null){
            return ResponseEntity.badRequest().body("El iva de cada producto es obligatorio");
        }
        Producto producto = new Producto();
        producto.setNombre(pDTO.getNombre());
        producto.setPrecio(pDTO.getPrecio());
        producto.setIva(pDTO.getIva());
        producto.setControlaStock(pDTO.getControlaStock());
        productoReposi.save(producto);
        return ResponseEntity.ok("Cliente agregado con exito");
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
