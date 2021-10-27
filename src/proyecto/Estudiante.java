package proyecto;

import javax.swing.JOptionPane;

public class Estudiante extends Persona {
    
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

    @Override
    public String toString() {
        return "Estudiante: " + nombre + "\n" + "Rut: " + rut + "-" + dv + "\n" + "Edad:" + edad + "\n" + "Carrera del Estudiante: " + carreraEstudiante;
    }

    @Override
    public void verDatos(){
        JOptionPane.showInputDialog(null,"Estudiante" + "\n" +"Nombre: " + nombre + "\n" + "Rut: " + rut + "-" + dv + "\n" + "Edad: " + edad + "\n" +"Carrera del Estudiante: " + carreraEstudiante,JOptionPane.INFORMATION_MESSAGE);       
    }
}
