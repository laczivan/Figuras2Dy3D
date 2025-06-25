package mx.edu.itses.electricidad.iz.figuras2d_3d;

public class Cuadrado {
    private double lado;
  
    public Cuadrado(double lado){
        this.lado=lado;
    }
    public double calcularArea(){
        return lado*lado;
    }
    public double calcularPerimetro(){
        return lado+lado+lado+lado;
    }
}
