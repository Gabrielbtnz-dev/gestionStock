package com.gestionStock.gestionStock.Controller;

import com.gestionStock.gestionStock.Model.ProductoRepository;

public class ProductoRestController {

    private final ProductoRepository productoRepo;

    public ProductoRestController(ProductoRepository productoRepo) {
        this.productoRepo = productoRepo;
    }


}
