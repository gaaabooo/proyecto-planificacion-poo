package proyecto;

public class Estudiante {
    
    private String nombre;
    private int rut;
    private String dv;
    private int edad;
    private String carreraEstudiante;
    
    /*-----------SOBRECARGA DE CONSTRUCTORES-----------*/
    public Estudiante() {
        
    }
    
    public Estudiante(String nombre, int rut, String dv, int edad, String carreraEstudiante) {
        this.nombre = nombre;
        this.rut = rut;
        this.dv = dv;
        this.edad = edad;
        this.carreraEstudiante = carreraEstudiante;
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

    public String getCarreraEstudiante() {
        return carreraEstudiante;
    }

    public void setCarreraEstudiante(String carreraEstudiante) {
        this.carreraEstudiante = carreraEstudiante;
    }
    
    public String mostrarDatosEstudiante(){
        return "Estudiante: "+nombre+"\n"+"Rut: "+rut+"-"+dv+"\n"+"Carrera del Estudiante: "+carreraEstudiante;
    }
}
