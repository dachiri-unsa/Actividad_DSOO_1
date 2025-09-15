import java.util.*;
public class Vehiculo{
    private String placa;
    private int capacidad;
    private String combustible ;
    private int consumoCombustible;

    //contructor por defecto
    public Vehiculo(Scanner sc) {
        System.out.println("Ingresar la placa del vehiculo: ");
        placa = sc.nextLine();
        System.out.println("Ingresa la capacidad del vehiculo: ");
        capacidad = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresar el tipo de combustible del vehiculo: ");
        combustible = sc.nextLine();
        System.out.println("Ingresa el consumo de combustible por kilometro del vehiculo: ");
        consumoCombustible = sc.nextInt();
        sc.nextLine();
    }
    public double calcularConsumo(double distanciaKm) {
        return distanciaKm * consumoCombustible;
    }
    public void setPlaca (String placa) {
        this.placa=placa;
    }
    public String getPlaca () {
        return placa;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad=capacidad;
    }
    public int getCapacidad() {
        return  capacidad;
    }
    public void setCombustible(String combustible){
        this.combustible =combustible;
    }
    public String getCombustible () {
        return combustible;
    }
    public void setconsumoCombustible (int consumoCombustible) {
        this.consumoCombustible=consumoCombustible;
    }
    public int getconsumoCombustible () {
        return consumoCombustible;
    }
}
