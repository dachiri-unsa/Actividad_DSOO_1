import java.util.*;
public class Vehiculo{
    private String placa;
    private int capacidad;
    private String combustible ;
    private int consubmoCombustible;

    //contructor por defecto
    public Vehiculo() {
        this.placa="none";
        this.capacidad=0;
        this.combustible="none";
    }
    public void setDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar la placa: ");
        placa = sc.nextLine();
    }
    //contrutor con parametros
    /*
    public Vehiculo(String placa , String combustible, int capacidad,int consubmoCombustible){
        this.placa=placa;
        this.combustible = combustible;
        this.capacidad = capacidad;
        this.consubmoCombustible = consubmoCombustible;
    } */
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
        this.consubmoCombustible=consumoCombustible;
    }
    public int getconsumoCombustible () {
        return consubmoCombustible;
    }
}
