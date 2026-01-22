package com.gestionStock.gestionStock.Domain;

public enum TipoIVA {
    IVA_10(10),
    IVA_5(5),
    IVA_0(0);

    private final int porcentaje;

    TipoIVA(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getPorcentaje(){
        return porcentaje;
    }
}
