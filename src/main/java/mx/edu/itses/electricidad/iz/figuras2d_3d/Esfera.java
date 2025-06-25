package mx.edu.itses.electricidad.iz.figuras2d_3d;


public class Esfera {
    private double radio;
    
    public Esfera(double radio){
        this.radio=radio;
    }
    public double calcularArea(){
        return 4*Math.PI*Math.pow(radio, 2);
    }
    public double calcularVolumen(){
       return (4/3)*Math.PI*Math.pow(radio, 3);
    }
}
