import java.util.*;
public class Vehiculo{
    private String placa;
    private int capacidad;
    private String combustible ;
    private int consumoCombustible;

    //contructor por defecto
    public Vehiculo() {
        Scanner sc = new Scanner(System.in);
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
    public void setplaca (String placa) {
        this.placa=placa;
    }
    public String getplaca () {
        return placa;
    }
    public void setcapacidad(int capacidad) {
        this.capacidad=capacidad;
    }
    public int getcapacidad() {
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
