package frc.gm.ventas;

import frc.gm.*;

public class VentasPC {
    public static void main(String[] args) {
        Monitor monitor1=new Monitor("Pintaluz", 15);
        Teclado teclado1=new Teclado("teclado", "Electronic");
        Raton raton1=new Raton("mouse","Electronic");
        Computadora computadora1= new Computadora("ASUS",monitor1,teclado1,raton1);
        Orden cliente1= new Orden();
        cliente1.agregarComputadora(computadora1);;
        cliente1.mostrarOrden();
        Orden cliente2= new Orden();
        cliente2.agregarComputadora(computadora1);
        cliente2.mostrarOrden();


    }
}
