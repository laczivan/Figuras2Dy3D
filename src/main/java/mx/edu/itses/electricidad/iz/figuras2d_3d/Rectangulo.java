package mx.edu.itses.electricidad.iz.figuras2d_3d;


public class Rectangulo {
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura){
        this.altura = altura;
        this.base=base;
        
    }
    public double calcularArea(){
        return base*altura;
    }
    public double calcularPerimetro(){
        return base+altura+base+altura;
    }
}
