public class Vehiculo{
    private String placa;
    private int capacidad;
    private String combustible ;
    private int consubmoCombustible;

    //contructor por defencto
    public Vehiculo() {
        this.placa="none";
        this.capacidad=0;
        this.combustible="none";
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
        this.consubmoCombustible=consumoCombustible;
    }
    public int getconsumoCombustible () {
        return consubmoCombustible;
    }
}
