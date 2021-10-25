package proyecto;

public class Estudiante extends persona {
    
    private String carreraEstudiante;
    
    /*-----------SOBRECARGA DE CONSTRUCTORES-----------*/
    public Estudiante() {
        
    }
    
    public Estudiante(String nombre, int rut, String dv, int edad, String carreraEstudiante) {
        super(nombre,rut,dv,edad);
        this.carreraEstudiante = carreraEstudiante;
    }
    /*-------------------------------------------------*/
    
    public String getCarreraEstudiante() {
        return carreraEstudiante;
    }

    public void setCarreraEstudiante(String carreraEstudiante) {
        this.carreraEstudiante = carreraEstudiante;
    }
    
    public String mostrarDatosEstudiante(){
        return "Estudiante: "+nombre+"\n"+"Rut: "+rut+"-"+dv+"\n"+"Carrera del Estudiante: "+carreraEstudiante;
    }

    @Override
    public String toString() {
        return "Encargado\n" + "Nombre: " + nombre + "\n" + "Rut: " + rut + "-" + dv + "\n" + "Edad:" + edad + "\n" + "Carrera del Estudiante: " + carreraEstudiante;
    }


    @Override
    public void participarActividad(){

    }
}
