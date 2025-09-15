import java.util.*;
public class Viaje {

    private Vehiculo vehiculo_usado;
    private Chofer chofer_usado;
    private double distanciaKm;
    private double velocidadPromedio; // km/h
    private double precioCombustible; // por litro

    public Viaje (Scanner sc, ArrayList<Vehiculo> vehiculos_disponibles, ArrayList<Chofer> choferes_disponibles){
        int chofer_num, vehiculo_num;
        System.out.println("Ingrese el numero de chofer que quiere usar: ");
        chofer_num = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el numero de vehiculo que quiere usar: ");
        vehiculo_num = sc.nextInt();
        sc.nextLine();
        chofer_usado = choferes_disponibles.get(chofer_num-1);
        vehiculo_usado = vehiculos_disponibles.get(vehiculo_num-1);
        System.out.println("Ingrese el total de la distancia que desea viajar: ");
        distanciaKm = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingresar la velocidad promedio del viaje: ");
        velocidadPromedio = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingresar el presio del combustible "+vehiculo_usado.getCombustible()+" :");
        precioCombustible = sc.nextDouble();
        sc.nextLine();

    }

    // Calcular duración (horas = distancia / velocidad)
    public double calcularDuracion() {
        return distanciaKm / velocidadPromedio;
    }

    // Calcular costo de combustible
    public double calcularCosto() {
        double litrosNecesarios = vehiculo_usado.calcularConsumo(distanciaKm);
        return litrosNecesarios * precioCombustible;
    }

    // Mostrar resumen del viaje
    public void mostrarResumen() {
        System.out.println("=== Resumen del Viaje ===");
        System.out.println("Chofer: " + chofer_usado.getNombre());
        System.out.println("Vehículo: " + vehiculo_usado.getPlaca());
        System.out.println("Distancia: " + distanciaKm + " km");
        System.out.println("Duración aproximada: " + calcularDuracion() + " horas");
        System.out.println("Costo estimado: S/. " + calcularCosto());
    }

}
