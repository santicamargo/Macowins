package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Venta {

    private ArrayList<Item> items = new ArrayList<Item>();
    private medioDePago mdp;
    private int cuotas;
    private Date fechaVenta = new Date();

    public Venta(medioDePago mdp, int cuotas) {
        this.mdp = mdp;
        this.cuotas = cuotas;
    }

    public double valorTotal(){
        int cantItems = items.size();
        int precioTotal = 0;

        for(int i = 0; i < cantItems; i++){
            precioTotal += items.get(i).prenda.precio() * items.get(i).getCantidad();
        }

        switch (mdp){
            case efectivo:
                return precioTotal;

            case tarjeta:
                return precioTotal*1.01 + cuotas*5;
            default:
                return -1;
        }
    }

    public void agregarItem(Item i){
        items.add(i);
    }
}
