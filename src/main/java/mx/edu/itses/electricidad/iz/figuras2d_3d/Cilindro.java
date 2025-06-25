package mx.edu.itses.electricidad.iz.figuras2d_3d;


public class Cilindro {
    
    private double radio;
    private double altura;
    public Cilindro(double radio, double altura){
        this.radio=radio;
        this.altura=altura;
    }
    public double CalcularArea(){
        return 2*Math.PI*radio*(radio+altura);
        }
     public double calcularVolumen(){
            return Math.PI*radio*radio*altura;
     }
}
