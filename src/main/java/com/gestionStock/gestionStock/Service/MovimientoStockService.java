package com.gestionStock.gestionStock.Service;

import com.gestionStock.gestionStock.Model.MovimientoStockRepository;
import org.springframework.stereotype.Service;

@Service
public class MovimientoStockService {
    private final MovimientoStockRepository moviStockRepo;

    public MovimientoStockService(MovimientoStockRepository moviStockRepo) {
        this.moviStockRepo = moviStockRepo;
    }




}
