import java.util.*;
public class Ejercicio {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean bucle = true;
        ArrayList<Vehiculo> lista_vehiculo = new ArrayList<Vehiculo>();
        ArrayList<Chofer> lista_chofer = new ArrayList<Chofer>();
        System.out.println("Bienvenido a el Sistema de vehiculos de transporte");
        while (bucle){
            System.out.println("Seleccione una opcion:\n1) Añadir vehiculo\n2) Añadir chofer\n3) Escoger viaje\n0) Cerrar");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    lista_vehiculo.add(new Vehiculo());
                    System.out.println("Añadiendo vehiculo...");
                    break;
                case 2:
                    lista_chofer.add(new Chofer());
                    System.out.println("Añadiendo chofer...");
                    break;
                case 3:
                    System.out.println("Calculando viaje...");
                    break;
                case 0:
                    System.out.println("Cerrando Sistema");
                    bucle = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        sc.close();
    }
}
