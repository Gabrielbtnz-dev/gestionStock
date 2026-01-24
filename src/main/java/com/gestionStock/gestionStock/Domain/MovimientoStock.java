package com.gestionStock.gestionStock.Domain;

import java.math.BigDecimal;

public class MovimientoStock {
    private Long id;
    private Long id_producto;
    private BigDecimal cantidad;
    private String tipo;


    public MovimientoStock(){
    }

    public MovimientoStock(Long id_producto, BigDecimal cantidad, String tipo){
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
