package proyecto;

import javax.swing.JOptionPane;

public class Encargado extends Persona {
    
    private String correoElectronico;
    
    /*-----------SOBRECARGA DE CONSTRUCTORES-----------*/
    public Encargado() {
        
    }

    public Encargado(String nombre, int rut, String dv, int edad, String correoElectronico) {
        super(nombre,rut,dv,edad);
        this.correoElectronico = correoElectronico;

    }
    /*-------------------------------------------------*/
    public String getNombre() {
    
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Encargado\n" + "Nombre: " + nombre + "\n" + "Rut: " + rut + "-" + dv + "\n" + "Edad:" + edad + "\n" +"Correo Electronico:" + correoElectronico;
    }

    @Override
    public void verDatos() {
        JOptionPane.showInputDialog(null,"Encargado" + "\n" +"Nombre: " + nombre + "\n" + "Rut: " + rut + "-" + dv + "\n" + "Edad:" + edad + "\n" +"Correo Electronico:" + correoElectronico,JOptionPane.INFORMATION_MESSAGE);
    }
    
}
