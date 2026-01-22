package com.gestionStock.gestionStock.Service;

import com.gestionStock.gestionStock.Domain.Producto;
import com.gestionStock.gestionStock.Model.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoService {

    private final ProductoRepository productoReposi;

    public ProductoService(ProductoRepository productoReposi) {
        this.productoReposi = productoReposi;
    }

    public List<Producto> getProductos(){
        return productoReposi.findAll();
    }
}
