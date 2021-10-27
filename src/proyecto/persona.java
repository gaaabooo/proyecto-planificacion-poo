package proyecto;

public abstract class persona {

    protected String nombre;
    protected int rut;
    protected String dv;
    protected int edad;

    public persona {

    }

    public persona(String nombre, int rut, String dv, int edad) {
        this.nombre = nombre;
        this.rut = rut;
        this.dv = dv;
        this.edad = edad;
    }

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

    public abstract void verDatos();

}