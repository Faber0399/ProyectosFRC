package frc.gm;

public class Orden {
    private int idOrden;
    private Computadora[] computadoras;
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private final static int maxComputadoras = 5;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        computadoras = new Computadora[maxComputadoras];

    }

    public void agregarComputadora(Computadora computadora) {
        if (this.contadorComputadoras < Orden.maxComputadoras) {
            computadoras[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Se ha sobrepasado el limite de computadoras que se pueden agregar a una orden...");
        }
    }

    public void mostrarOrden() {
        System.out.println("La orden que actualmente se esta procesando es la número : "+this.idOrden);
        System.out.println("Los productos de la orden son los siguientes: ");
        for (int i =0; i<this.contadorComputadoras;i++){
            System.out.println(this.computadoras[i]);
        }
    }

}
