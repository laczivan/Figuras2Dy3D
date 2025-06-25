
package mx.edu.itses.electricidad.iz.figuras2d_3d;


public class Cubo {
    
    private double arista;
    
    public Cubo(double arista){
        this.arista=arista;
        
    }
    public double calcularArea(){
        return 6*Math.pow(arista, 2);
    }
    public double calcularVolumen(){
        return Math.pow(arista, 3);
    }
}
