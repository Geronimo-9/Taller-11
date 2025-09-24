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


        //Ejercicio 3, Probando más acerca de la clase abstracta.

        /*Acá se intentó instanciar un objeto a traves de la clase abstracta, pero el compilador no lo permite
        Esto se debe a que la clase abstracta es una base principal para diseñar las clases derivadas referentes.
        */


        // Empleado e1 = new Empleado("Guillen", 300000, 30);


        square.detalles(); //nuevo metodo implementado en la clase figura.


    }
}