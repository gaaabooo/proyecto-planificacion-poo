package proyecto;

public class Encargado {
    
    private String nombre;
    private int rut;
    private String dv;
    private int edad;
    
    /*-----------SOBRECARGA DE CONSTRUCTORES-----------*/
    public Encargado() {
        
    }

    public Encargado(String nombre, int rut, String dv, int edad) {
        this.nombre = nombre;
        this.rut = rut;
        this.dv = dv;
        this.edad = edad;
    }
    /*-------------------------------------------------*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Encargado\n" + "Nombre: " + nombre + "\n" + "Rut: " + rut + "-" + dv + "\n" + "Edad:" + edad ;
    }
    
}
