public abstract class Empleado {
    private String nombre;
    private double ingresosDiario;
    private int diasLaborado;


public Empleado(String nombre, double  ingresosDiario, int diasLaborado){
    this.nombre = nombre;
    setIngresosDiario( ingresosDiario);
    setDiasLaborado(diasLaborado);
}




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public double getIngresosDiario() {
        return  ingresosDiario;
    }

    public void setIngresosDiario(double  ingresosDiario) {
       if( ingresosDiario >= 0){
           this. ingresosDiario =  ingresosDiario;
       }
    }



    public int getDiasLaborado() {
        return diasLaborado;
    }

    public void setDiasLaborado(int diasLaborado) {
        if(diasLaborado >= 0){
            this.diasLaborado = diasLaborado;
        }
    }

public abstract double calcularSalario();
public abstract void mostrarDetalles();



}



//Clase hija Gerente
class Gerente extends Empleado{

    public Gerente(String nombre, double  ingresosDiario, int diasLaborados){
        super(nombre,  ingresosDiario, diasLaborados);
    }

    @Override
    public double calcularSalario() {
        return getIngresosDiario()*getDiasLaborado();
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Gerente: "+getNombre()+" " +
                            ", Ingresos diarios: "+getIngresosDiario()+" " +
                            ", dias Laborado: "+getDiasLaborado()+" " +
                            ", SalarioTotal: "+calcularSalario());
    }
}



//Clase hija vendedor
class vendedor extends Empleado{


    public vendedor(String nombre, double  ingresosDiario, int diasLaborados){
        super(nombre,  ingresosDiario, diasLaborados);
    }



    @Override
    public double calcularSalario() {
        return getIngresosDiario()*getDiasLaborado();
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Vendedor: "+getNombre()+" " +
                ", Ingresos diarios: "+getIngresosDiario()+" " +
                ", dias Laborado: "+getDiasLaborado()+" " +
                ", SalarioTotal: "+calcularSalario());
    }


}






