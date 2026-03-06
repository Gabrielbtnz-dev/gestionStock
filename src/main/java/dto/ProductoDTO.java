package dto;

import com.gestionStock.gestionStock.Domain.TipoIVA;
import jakarta.persistence.*;

import java.math.BigDecimal;

public class ProductoDTO {

    private String nombre;
    private BigDecimal precio;
    private Integer id_empresa;
    @Enumerated(EnumType.STRING)
    private TipoIVA iva;
    private Boolean status;
    private Boolean controlaStock;

    public ProductoDTO(){

    };

    public ProductoDTO (String nombre,BigDecimal precio, Integer id_empresa, TipoIVA iva,boolean status,boolean controlaStock){
        this.nombre = nombre;
        this.precio = precio;
        this.id_empresa = id_empresa;
        this.iva = iva;
        this.status = status;
        this.controlaStock = controlaStock;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getControlaStock() {
        return controlaStock;
    }

    public void setControlaStock(Boolean controlaStock) {
        this.controlaStock = controlaStock;
    }
}
