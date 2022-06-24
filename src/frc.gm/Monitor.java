package frc.gm;

public class Monitor {
    private int idMonitor;
    private String marca;
    private double tamano;
    private static int contadorMonitores;

    private Monitor(){
        this.idMonitor=++Monitor.contadorMonitores;
    }
    public Monitor(String marca, double tamano){
        this();
        this.marca=marca;
        this.tamano=tamano;
    }
    public int getIdMonitor() {
        return idMonitor;
    }
    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getTamano() {
        return tamano;
    }
    public void setTamano(double tamano) {
        this.tamano = tamano;
    }
    public int getContadorMonitores() {
        return contadorMonitores;
    }
    
    
    @Override
    public String toString() {
        return "Monitor [contadorMonitores=" + contadorMonitores + ", idMonitor=" + idMonitor + ", marca=" + marca
                + ", tamano=" + tamano + "]";
    }
    
}
