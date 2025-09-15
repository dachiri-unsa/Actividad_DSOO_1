import java.util.*;
public class Ejercicio {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("Bienvenido a la Sistema de vehiculos de transporte: ");
        while (true){
            System.out.println("Seleccione una opcion:\n1) Añadir vehiculo\n2) Añadir chofer\n3) Escoger viaje");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Añadiendo vehiculo...");
                    break;
                case 2:
                    System.out.println("Añadiendo chofer...");
                    break;
                case 3:
                    System.out.println("Calculando viaje...");
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            break;
        }
        sc.close();
    }
}
