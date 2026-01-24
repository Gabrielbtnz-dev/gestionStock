package com.gestionStock.gestionStock.Model;

import com.gestionStock.gestionStock.Domain.MovimientoStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientoStockRepository extends JpaRepository<MovimientoStock, Long> {

}
