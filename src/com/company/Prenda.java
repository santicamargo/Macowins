package com.company;

public class Prenda {

    private int precio;
    private tipoPrenda tipo;
    private estadoPrenda estado;

    public Prenda(int precio, tipoPrenda tipo, estadoPrenda estado) {
        this.precio = precio;
        this.tipo = tipo;
        this.estado = estado;
    }

    public double precio() {
        switch (estado) {
            case nueva:
                return precio;

            case promocion:
                return precio - 25;

            case liquidacion:
                return precio * 0.5;

            default:
                return -1;
        }
    }

    public tipoPrenda getTipo() {
        return tipo;
    }
}
