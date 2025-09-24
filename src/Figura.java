public abstract class Figura {
protected String nombre;


public Figura(String nombre){
    this.nombre = nombre;
}


public abstract void mostrarArea();
public abstract double calcularArea();

public void detalles(){
    System.out.println("Esta figura tiene x medidas");
}

}




// Clase hija circulo.

class circulo extends Figura{
    protected double radio;
    protected final double pi;
    protected double diametro;

    public circulo(String nombre, double radio){
        super(nombre);
        this.radio = radio;
        this.pi = 3.14;
        this.diametro = radio*2;

    }


    @Override
    public double calcularArea() {
        return pi*Math.pow(radio,2);
    }

    @Override
    public void mostrarArea() {
        System.out.println("El area del circulo es: "+calcularArea());
    }




    @Override
    public void detalles() {
        System.out.println("Est figura tiene un radio de "+radio+" metros, y su diametro es de"+diametro);

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


    @Override
    public void detalles() {
        System.out.println("Este rectangulo tiene un largo de "+largo+" y un ancho de "+ancho);
    }
}