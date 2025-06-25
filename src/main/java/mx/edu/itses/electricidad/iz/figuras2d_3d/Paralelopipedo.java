package mx.edu.itses.electricidad.iz.figuras2d_3d;

public class Paralelopipedo {
    
    private double largo;
    private double ancho;
    private double alto;
    
    public Paralelopipedo(double largo, double ancho, double alto){
        this.alto=alto;
        this.ancho=ancho;
        this.largo=largo;
    }
    public double calcularArea(){
        return 2*(largo*ancho+largo*alto+ancho*alto);
    }
    public double calcularVolumen(){
        return largo*ancho*alto;
    }
}
