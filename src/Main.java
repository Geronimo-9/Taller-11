public class Main {
    public static void main(String[] args) {


        //Ejercicio 1, Clase abstacta figura, Clases hijas Circulo y Rectangulo.

        circulo circle = new circulo("circulo", 22);
        circle.calcularArea();
        circle.mostrarArea();


        rectangulo square = new rectangulo("Rectangulo", 7, 2);
        square.calcularArea();
        square.mostrarArea();


// Ejercicio 2 Clase Empleado con clases hijas Gerente y vendedor.
        Gerente g1 = new Gerente("Pablo Escobar", 47450, 30);

        g1.calcularSalario();
        g1.mostrarDetalles();


        vendedor v1 = new vendedor("Camilo", 90000, 30);

        v1.calcularSalario();
        v1.mostrarDetalles();




       



    }