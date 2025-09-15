public class Chofer {
    private String nombre,licencia;
    private int edad, Experiencia;
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
        Experiencia=exp;
    }
    public int getExperiencia() {
        return Experiencia;
    }
}