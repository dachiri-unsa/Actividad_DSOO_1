import java.util.Scanner;

public class Chofer {
    private String nombre,licencia;
    private int edad, experiencia;

    public Chofer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar la placa del vehiculo: ");
        nombre = sc.nextLine();
        System.out.println("Ingresa la capacidad del vehiculo: ");
        edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresar el tipo de combustible del vehiculo: ");
        licencia = sc.nextLine();
        System.out.println("Ingresa el consumo de combustible por kilometro del vehiculo: ");
        experiencia = sc.nextInt();
        sc.nextLine();
    }

    public void setNombre (String nom) {
        nombre=nom;
    }
    public String getNombre() {
        return nombre;
    }
    public void setLicencia(String lic) {
        licencia=lic;
    }
    public String getLicencia() {
        return licencia;
    }
    public void setEdad(int ed) {
        edad=ed;
    }
    public int getEdad() {
        return edad;
    }
    public void setExperiencia(int exp) {
        experiencia=exp;
    }
    public int getExperiencia() {
        return experiencia;
    }
}