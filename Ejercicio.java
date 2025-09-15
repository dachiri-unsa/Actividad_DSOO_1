import java.util.*;
public class Ejercicio {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean bucle = true;
        System.out.println("Bienvenido a la Sistema de vehiculos de transporte");
        while (bucle){
            System.out.println("Seleccione una opcion:\n1) Añadir vehiculo\n2) Añadir chofer\n3) Escoger viaje\n0) Cerrar");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Añadiendo vehiculo...");
                    ArrayList <Vehiculo> Lista_Autos =new ArrayList<Vehiculo>();
                    
                    break;
                case 2:
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
