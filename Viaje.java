import java.util.*;
public class Viaje {
    private int duración,costo;
    private Vehiculo vehiculo_usado;
    private Chofer chofer_usado;
    public Viaje (ArrayList<Vehiculo> vehiculos_disponibles, ArrayList<Chofer> choferes_disponibles){
        int chofer_num, vehiculo_num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de chofer que quiere usar: ");
        chofer_num = sc.nextInt();
        System.out.println("Ingrese el numero de vehiculo que quiere usar: ");
        vehiculo_num = sc.nextInt();
        chofer_usado = choferes_disponibles.get(chofer_num-1);
        vehiculo_usado = vehiculos_disponibles.get(vehiculo_num-1);

    }
    
    private double distanciaKm;
    private double velocidadPromedio; // km/h
    private double precioCombustible; // por litro
    private Vehiculo vehiculo;
    private Chofer chofer;

    public Viaje(double distanciaKm, double velocidadPromedio, double precioCombustible,
                 Vehiculo vehiculo, Chofer chofer) {
        this.distanciaKm = distanciaKm;
        this.velocidadPromedio = velocidadPromedio;
        this.precioCombustible = precioCombustible;
        this.vehiculo = vehiculo;
        this.chofer = chofer;
    }

    // Calcular duración (horas = distancia / velocidad)
    public double calcularDuracion() {
        return distanciaKm / velocidadPromedio;
    }

    // Calcular costo de combustible
    public double calcularCosto() {
        double litrosNecesarios = vehiculo.calcularConsumo(distanciaKm);
        return litrosNecesarios * precioCombustible;
    }

    // Mostrar resumen del viaje
    public void mostrarResumen() {
        System.out.println("=== Resumen del Viaje ===");
        System.out.println("Chofer: " + chofer.getNombre());
        System.out.println("Vehículo: " + vehiculo.getPlaca());
        System.out.println("Distancia: " + distanciaKm + " km");
        System.out.println("Duración aproximada: " + calcularDuracion() + " horas");
        System.out.println("Costo estimado: S/. " + calcularCosto());
    }

    public void setDuracion(int dur) {
        duración=dur;
    }
    public int getDuracion() {
        return duración;
    }
    public void setCosto(int cost) {
        costo=cost;
    }
    public int getCosto() {
        return costo;
    }
}
