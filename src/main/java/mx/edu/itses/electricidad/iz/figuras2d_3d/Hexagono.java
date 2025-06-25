
package mx.edu.itses.electricidad.iz.figuras2d_3d;

public class Hexagono {
    private double lado;
    private double apotema;
    
    public Hexagono(double lado, double apotema){
        this.lado=lado;
        this.apotema=apotema;
    }
    public double calcularArea(){
        return (6*lado*apotema)/2;
    }
    public double calcularPerimetro(){
        return 6*lado;
    }  
}
