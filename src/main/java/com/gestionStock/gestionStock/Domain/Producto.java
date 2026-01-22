package com.gestionStock.gestionStock.Domain;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private BigDecimal precio;
    private Integer id_empresa;
    @Enumerated(EnumType.STRING)
    private TipoIVA iva;
    private Boolean status;
    private Boolean controlaStock;

    public Producto(){

    }

    public Producto(String nombre, BigDecimal precio, Integer id_empresa, TipoIVA iva, Boolean controlaStock, Boolean status){
        this.nombre = nombre;
        this.precio = precio;
        this.id_empresa = id_empresa;
        this.iva = iva;
        this.controlaStock = controlaStock;
        this.status = status;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Integer getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(Integer id_empresa) {
        this.id_empresa = id_empresa;
    }

    public TipoIVA getIva() {
        return iva;
    }

    public void setIva(TipoIVA iva) {
        this.iva = iva;
    }

    public Boolean getControlaStock() {
        return controlaStock;
    }

    public void setControlaStock(Boolean controlaStock) {
        this.controlaStock = controlaStock;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
