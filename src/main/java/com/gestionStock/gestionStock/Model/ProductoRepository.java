package com.gestionStock.gestionStock.Model;

import com.gestionStock.gestionStock.Domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
