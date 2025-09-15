public class Vehiculo{
    private String placa;
    private int capacidad;

    //contructor por defencto
    public Vehiculo() {
        this.placa="none";
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
    
}
