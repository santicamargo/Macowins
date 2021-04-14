package com.company;

public class Item {

    public Prenda prenda;
    private int cantidad;

    public Item(Prenda prenda, int cantidad) {
        this.prenda = prenda;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }
}
