public abstract class Figura {
protected String nombre;


public Figura(String nombre){
    this.nombre = nombre;
}


public abstract void mostrarArea();
public abstract double calcularArea();


}

class circulo extends Figura{
    protected double radio;
    protected final double pi;


    public circulo(String nombre, double radio){
        super(nombre);
        this.radio = radio;
        this.pi = 3.14;

    }


    @Override
    public double calcularArea() {
        return pi*Math.pow(radio,2);
    }

    @Override
    public void mostrarArea() {
        System.out.println("El area del circulo es: "+calcularArea());
    }
}


//Clase hija, rectangulo.

class rectangulo extends Figura{
    protected double largo;
    protected double ancho;

    public rectangulo(String nombre, double largo, double ancho){
        super(nombre);
        this.ancho = ancho;
        this.largo = largo;
    }

    @Override
    public double calcularArea() {
        return largo*ancho;
    }

    @Override
    public void mostrarArea() {
        System.out.println("El area del Rectangulo es: "+calcularArea());
    }
}