package proyecto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Actividad {
    private String nombreActividad;
    private Encargado encargadoActividad;
    private ListaEstudiantes estudiantes;
    
    /*-----------SOBRECARGA DE CONSTRUCTORES-----------*/
    public Actividad(String nombreActividad, Encargado encargadoActividad) {
        this.nombreActividad = nombreActividad;
        this.encargadoActividad = encargadoActividad;
        estudiantes = new ListaEstudiantes();
    }

    public Actividad() {
        estudiantes = new ListaEstudiantes();
    }
    
    /*-------------------------------------------------*/
    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public Encargado getEncargadoActividad() {
        return encargadoActividad;
    }

    public void setEncargadoActividad(Encargado encargadoActividad) {
        this.encargadoActividad = encargadoActividad;
    }
    
    public String mostrarDatosActividad(){
        return "Actividad: "+nombreActividad +"\n"+"Nombre encargado: "+encargadoActividad.getNombre()+"\n"+"----Estudiantes Participantes----\n"+estudiantes.mostrarEstudiantes()+"\n";
    }
    
    /*-----------Delegacion de responsabilidades-----------*/
    public boolean agregarEstudiante(Estudiante estudiante1){        
        return estudiantes.agregarEstudiante(estudiante1);
    }
    
    public boolean agregarEstudiante(ArrayList<Estudiante> Estudiantes) {
        return estudiantes.agregarEstudiante(Estudiantes);
    }
    
    public String mostrarEstudiantes(){
        return estudiantes.mostrarEstudiantes();
    }
    
    public int estudiantesParticipantesPorCarrera(String carrera){        
        return estudiantes.estudiantesParticipantesPorCarrera(carrera);
    }
    
    public boolean eliminarEstudiante(int rut,String dv){
        return estudiantes.eliminarEstudiante(rut, dv);
    }
    
    public boolean eliminarEstudiante(Estudiante estudiante1){
        return estudiantes.eliminarEstudiante(estudiante1);
    }
    
    public Estudiante buscarEstudiante(int rut, String dv) {
        return estudiantes.buscarEstudiante(rut, dv);
    }
    
    public Estudiante buscarEstudiante(Estudiante estudiante1){
       return estudiantes.buscarEstudiante(estudiante1);
    }
    
    public void MenuEstudiantes(){

        String[] opcionesMenu = {"Agregar un solo Estudiante la lista","Eliminar Estudiante por rut y digito verificador","Eliminar Estudiante","Buscar Estudiante","Buscar Estudiante por rut y digito verificador","Mostrar Estudiantes","Estudiantes participantes de cierta carrera","Salir"};    
        String respuesta, buffer, buffer2, buffer3, buffer4, buffer5;        
        byte control = 0;

        while(control == 0){

            respuesta = (String)JOptionPane.showInputDialog(null,"Seleccione su opcion","Opciones",JOptionPane.DEFAULT_OPTION,null,opcionesMenu,opcionesMenu[0]);

            switch(respuesta){

                case "Agregar un solo Estudiante la lista":
                    buffer = JOptionPane.showInputDialog("Ingrese el nombre del Estudiante");
                    buffer2 = JOptionPane.showInputDialog("Ingrese el rut del Estudiante(sin puntos ni digito verificador)");
                    buffer3 = JOptionPane.showInputDialog("Ingrese el digito verificador del rut del Estudiante");
                    buffer4 = JOptionPane.showInputDialog("Ingrese la edad del Estudiante");
                    buffer5 = JOptionPane.showInputDialog("Ingrese la carrera del Estudiante");
                    Estudiante estudiante1 = new Estudiante(buffer,Integer.parseInt(buffer2),buffer3,Integer.parseInt(buffer4),buffer5);
                    estudiantes.agregarEstudiante(estudiante1);
                    JOptionPane.showMessageDialog(null, "El Estudiante se ha agregado con exito");
                    break;


                case "Eliminar Estudiante por rut y digito verificador":
                    buffer = JOptionPane.showInputDialog("Ingrese el rut del Estudiante que desea Eliminar");
                    buffer2 = JOptionPane.showInputDialog("Ingrese el digito verificador del rut del Estudiante que desea Eliminar");

                    if(estudiantes.buscarEstudiante(Integer.parseInt(buffer), buffer2) == null) {
                        JOptionPane.showMessageDialog(null, "El Estudiante que desea eliminar no existe");
                    }
                    else {
                        estudiantes.eliminarEstudiante(Integer.parseInt(buffer), buffer2);
                    }
                    JOptionPane.showMessageDialog(null, "El Estudiante se ha eliminado con existo");
                    break;

                case "Eliminar Estudiante":
                    buffer = JOptionPane.showInputDialog("Ingrese el nombre del Estudiante");
                    buffer2 = JOptionPane.showInputDialog("Ingrese el rut del Estudiante(sin puntos ni digito verificador)");
                    buffer3 = JOptionPane.showInputDialog("Ingrese el digito verificador del rut del Estudiante");
                    buffer4 = JOptionPane.showInputDialog("Ingrese la edad del Estudiante");
                    buffer5 = JOptionPane.showInputDialog("Ingrese la carrera del Estudiante");
                    Estudiante estudiante2 = new Estudiante(buffer,Integer.parseInt(buffer2),buffer3,Integer.parseInt(buffer4),buffer5);

                    if(estudiantes.buscarEstudiante(estudiante2) == null){
                        JOptionPane.showMessageDialog(null, "El Estudiante que desea eliminar no existe");
                    }
                    else {
                        estudiantes.eliminarEstudiante(estudiante2);
                    }
                    JOptionPane.showMessageDialog(null, "El Estudiante se ha eliminado con existo");
                    break;

                case "Buscar Estudiante":
                    buffer = JOptionPane.showInputDialog("Ingrese el nombre del Estudiante");
                    buffer2 = JOptionPane.showInputDialog("Ingrese el rut del Estudiante(sin puntos ni digito verificador)");
                    buffer3 = JOptionPane.showInputDialog("Ingrese el digito verificador del rut del Estudiante");
                    buffer4 = JOptionPane.showInputDialog("Ingrese la edad del Estudiante");
                    buffer5 = JOptionPane.showInputDialog("Ingrese la carrera del Estudiante");
                    Estudiante estudiante3 = new Estudiante(buffer,Integer.parseInt(buffer2),buffer3,Integer.parseInt(buffer4),buffer5);

                    if(estudiantes.buscarEstudiante(estudiante3)== null){
                        JOptionPane.showMessageDialog(null, "El Estudiante que desea buscar no existe");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "La busqueda se ha completado de forma correcta");
                    }
                    break;

                case "Buscar Estudiante por rut y digito verficador":
                    buffer = JOptionPane.showInputDialog("Ingrese el rut del Estudiante(sin puntos ni digito verificador)");
                    buffer2 = JOptionPane.showInputDialog("Ingrese el digito verificador del rut del Estudiante");

                    if(estudiantes.buscarEstudiante(Integer.parseInt(buffer), buffer2) == null) {
                        JOptionPane.showMessageDialog(null, "El Estudiante que desea buscar no existe");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "La busqueda se ha completado de forma correcta");
                    }
                    break;

                case "Mostrar Estudiantes":
                    System.out.println(estudiantes.mostrarEstudiantes());
                    JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                    break;

                case "Estudiantes participantes de cierta carrera":
                    buffer = JOptionPane.showInputDialog("Ingrese la carrera que desea contabilizar en la lista");
                    estudiantes.estudiantesParticipantesPorCarrera(buffer);
                    JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                    break;

                case "Salir":
                    JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                    control = 1;                    
                    break;
            }
        }
    }
}
