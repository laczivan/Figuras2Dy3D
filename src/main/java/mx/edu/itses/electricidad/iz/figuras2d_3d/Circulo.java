
package mx.edu.itses.electricidad.iz.figuras2d_3d;


public class Circulo {
private double radio;
    public Circulo(double radio){
        this.radio=radio;
    }
    public double calcularArea(){
        return Math.PI*Math.pow(radio,2);   
    }
    public calcularPerimetro(){
        return 2*Math.PI*radio;
    
        }
}
