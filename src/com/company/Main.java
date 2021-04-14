package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Prenda prenda1 = new Prenda(100, tipoPrenda.saco, estadoPrenda.nueva);
        Prenda prenda2 = new Prenda(200, tipoPrenda.pantalon, estadoPrenda.promocion);
        Prenda prenda3 = new Prenda(300, tipoPrenda.camisa, estadoPrenda.liquidacion);

        System.out.println(prenda1.getTipo());
        System.out.println(prenda1.precio());

        Item itemA = new Item(prenda1, 2);
        Item itemB = new Item(prenda2, 3);
        Item itemC = new Item(prenda3, 4);

        Venta nuevaVenta = new Venta(medioDePago.tarjeta, 1);
        nuevaVenta.agregarItem(itemA);
        nuevaVenta.agregarItem(itemB);
        nuevaVenta.agregarItem(itemC);

        System.out.println(nuevaVenta.valorTotal());


    }
}
