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
