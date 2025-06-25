package mx.edu.itses.electricidad.iz.figuras2d_3d;


public class Pentagono {
private double apotema;
private double lado;

public Pentagono(double apotema, double lado){
    this.apotema=apotema;
    this.lado=lado;
}
public double calcularArea(){
    return (5*lado*apotema)/2;
}
public double calcularPerimetro(){
    return 5*lado;
}
}
