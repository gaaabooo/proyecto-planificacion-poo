package proyecto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Actividad implements Disponibilidad {
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
    
    public void modificarDatosEstudiante(Estudiante estudiante1, String nombre, int rut, String dv, int edad, String carreraEstudiante) {
        estudiantes.modificarDatosEstudiante(estudiante1, nombre, rut, dv, edad, carreraEstudiante);
    }
    
    public void modificarDatosEstudiante(Estudiante estudiante1, String nombre) {
        estudiantes.modificarDatosEstudiante(estudiante1, nombre);
    }
    
    public void modificarDatosEstudiante(Estudiante estudiante1, int rut, String dv){
        estudiantes.modificarDatosEstudiante(estudiante1, rut, dv);
    }
    
    public void modificarDatosEstudiante(Estudiante estudiante1, String nombre, String carreraEstudiante){
        estudiantes.modificarDatosEstudiante(estudiante1, nombre, carreraEstudiante);
    }
    
    public void modificarDatosEstudiante(Estudiante estudiante1, int edad){
        estudiantes.modificarDatosEstudiante(estudiante1, edad);
    }

    public int contabilizarEstudiantesEdad(int edad){
        return estudiantes.contabilizarEstudiantesEdad(edad);
    }
    
    public int contabilizarEstudiantesRangoEtario(int edad1, int edad2){
        return estudiantes.contabilizarEstudiantesRangoEtario(edad1,edad2);
    }
    
    public int contarEstudiantes () {
        return estudiantes.contarEstudiantes();
    }
    public void MenuEstudiantes(){

        String[] opcionesMenu = {"Agregar un solo Estudiante la lista","Eliminar Estudiante por rut y digito verificador","Eliminar Estudiante","Buscar Estudiante","Buscar Estudiante por rut y digito verificador","Mostrar Estudiantes","Estudiantes participantes de cierta carrera","Modificar datos Estudiante(solo rut completo)","Modificar datos Estudiante (todos los datos)","Modificar datos Estudiante (solo edad)","Modificar datos Estudiante (solo nombre)","Modificar datos Estudiante (solo nombre y carrera)","Contabilizar Estudiantes de cierta edad","Contabilizar Estudiantes por rango etario","Salir"};    
        String respuesta, buffer, buffer2, buffer3, buffer4, buffer5;        
        byte control = 0;

        while(control == 0){

            respuesta = (String)JOptionPane.showInputDialog(null,"Seleccione su opcion","Opciones",JOptionPane.DEFAULT_OPTION,null,opcionesMenu,opcionesMenu[0]);

            switch(respuesta){

                case "Agregar un solo Estudiante la lista":
                    try {
                        buffer = JOptionPane.showInputDialog("Ingrese el nombre del Estudiante");
                        buffer2 = JOptionPane.showInputDialog("Ingrese el rut del Estudiante(sin puntos ni digito verificador)");
                        buffer3 = JOptionPane.showInputDialog("Ingrese el digito verificador del rut del Estudiante");
                        buffer4 = JOptionPane.showInputDialog("Ingrese la edad del Estudiante");
                        buffer5 = JOptionPane.showInputDialog("Ingrese la carrera del Estudiante");
                        Estudiante estudiante1 = new Estudiante(buffer,Integer.parseInt(buffer2),buffer3,Integer.parseInt(buffer4),buffer5);
                        if(estudiante1 == null) throw new AddDatosException();
                        estudiantes.agregarEstudiante(estudiante1);                        
                    } catch(AddDatosException e) {
                        e.mostrarMensajeError();
                    }
                    
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
                    JOptionPane.showMessageDialog(null, "Lista de Estudiantes de la Actividad" + "\n"+ estudiantes.mostrarEstudiantes());
                    break;

                case "Estudiantes participantes de cierta carrera":
                    buffer = JOptionPane.showInputDialog("Ingrese la carrera que desea contabilizar en la lista");
                    estudiantes.estudiantesParticipantesPorCarrera(buffer);
                    JOptionPane.showMessageDialog(null, "Operaci??n realizada correctamente");
                    break;
                    
                case "Modificar datos Estudiante(solo rut completo)":
                    try {
                        buffer = JOptionPane.showInputDialog("Ingrese el rut del Estudiante(sin puntos ni digito verificador)");
                        buffer2 = JOptionPane.showInputDialog("Ingrese el digito verificador del rut del Estudiante");                   
                        estudiantes.buscarEstudiante(Integer.parseInt(buffer), buffer2);
                        if(estudiantes.buscarEstudiante(Integer.parseInt(buffer), buffer2) == null) {
                            JOptionPane.showMessageDialog(null, "El Estudiante que desea buscar no existe");
                            break;
                        }
                        else {
                            buffer = JOptionPane.showInputDialog("Ingrese el nuevo rut del Estudiante(sin puntos ni digito verificador)");
                            buffer2 = JOptionPane.showInputDialog("Ingrese el nuevo digito verificador del rut del Estudiante");
                            estudiantes.modificarDatosEstudiante(estudiantes.buscarEstudiante(Integer.parseInt(buffer), buffer2),buffer, buffer);
                            if(estudiantes == null) throw new ModificarDatosException();
                        }
                    }catch (ModificarDatosException e){
                        e.mostrarMensajeError();
                    }
                    
                    JOptionPane.showMessageDialog(null, "Operaci??n realizada correctamente");
                    break;
                    
                case "Modificar datos Estudiante (todos los datos)":
                    try{
                        buffer = JOptionPane.showInputDialog("Ingrese el rut del Estudiante(sin puntos ni digito verificador)");
                        buffer2 = JOptionPane.showInputDialog("Ingrese el digito verificador del rut del Estudiante");                              

                        if(estudiantes.buscarEstudiante(Integer.parseInt(buffer), buffer2) == null) {
                            JOptionPane.showMessageDialog(null, "El Estudiante que desea buscar no existe");
                            break;
                        }
                        else {
                            buffer = JOptionPane.showInputDialog("Ingrese el nuevo nombre del Estudiante");
                            buffer2 = JOptionPane.showInputDialog("Ingrese el nuevo rut del Estudiante(sin puntos ni digito verificador)");
                            buffer3 = JOptionPane.showInputDialog("Ingrese el nuevo digito verificador del rut del Estudiante");
                            buffer4 = JOptionPane.showInputDialog("Ingrese la nueva edad del Estudiante");
                            buffer5 = JOptionPane.showInputDialog("Ingrese la nueva carrera del Estudiante");
                            estudiantes.modificarDatosEstudiante(estudiantes.buscarEstudiante(Integer.parseInt(buffer2), buffer3),buffer,Integer.parseInt(buffer2),buffer3,Integer.parseInt(buffer4),buffer5);
                            if(estudiantes == null) throw new ModificarDatosException();
                        }
                    }catch (ModificarDatosException e){
                        e.mostrarMensajeError();
                    }
                    
                    JOptionPane.showMessageDialog(null, "Operaci??n realizada correctamente");
                    break;
                    
                case "Modificar datos Estudiante (solo edad)":  
                    try{
                        buffer = JOptionPane.showInputDialog("Ingrese el rut del Estudiante(sin puntos ni digito verificador)");
                        buffer2 = JOptionPane.showInputDialog("Ingrese el digito verificador del rut del Estudiante");                               

                        if(estudiantes.buscarEstudiante(Integer.parseInt(buffer), buffer2) == null) {
                            JOptionPane.showMessageDialog(null, "El Estudiante que desea buscar no existe");
                            break;
                        }
                        else {
                            buffer3 = JOptionPane.showInputDialog("Ingrese la nueva edad del Estudiante");
                            estudiantes.modificarDatosEstudiante(estudiantes.buscarEstudiante(Integer.parseInt(buffer), buffer2),Integer.parseInt(buffer3));
                            if(estudiantes == null) throw new ModificarDatosException();
                        }
                    }catch(ModificarDatosException e){
                        e.mostrarMensajeError();
                    }                    
                    
                    JOptionPane.showMessageDialog(null, "Operaci??n realizada correctamente");
                    break;
                    
                case "Modificar datos Estudiante (solo nombre)":
                    try{
                        buffer = JOptionPane.showInputDialog("Ingrese el rut del Estudiante(sin puntos ni digito verificador)");
                        buffer2 = JOptionPane.showInputDialog("Ingrese el digito verificador del rut del Estudiante");                               

                        if(estudiantes.buscarEstudiante(Integer.parseInt(buffer), buffer2) == null) {
                            JOptionPane.showMessageDialog(null, "El Estudiante que desea buscar no existe");
                            break;
                        }
                        else {
                            buffer3 = JOptionPane.showInputDialog("Ingrese el nuevo nombre del Estudiante");
                            estudiantes.modificarDatosEstudiante(estudiantes.buscarEstudiante(Integer.parseInt(buffer), buffer2),buffer3);
                            if(estudiantes == null) throw new ModificarDatosException();
                        }
                    }catch(ModificarDatosException e){
                        e.mostrarMensajeError();
                    }
                    
                    JOptionPane.showMessageDialog(null, "Operaci??n realizada correctamente");
                    break;
                    
                case "Modificar datos Estudiante (solo nombre y carrera)":
                    try{
                        buffer = JOptionPane.showInputDialog("Ingrese el rut del Estudiante(sin puntos ni digito verificador)");
                        buffer2 = JOptionPane.showInputDialog("Ingrese el digito verificador del rut del Estudiante");                               

                        if(estudiantes.buscarEstudiante(Integer.parseInt(buffer), buffer2) == null) {
                            JOptionPane.showMessageDialog(null, "El Estudiante que desea buscar no existe");
                            break;
                        }
                        else {
                            buffer3 = JOptionPane.showInputDialog("Ingrese el nuevo nombre del Estudiante");
                            buffer4 = JOptionPane.showInputDialog("Ingrese la nueva carrera del Estudiante");
                            estudiantes.modificarDatosEstudiante(estudiantes.buscarEstudiante(Integer.parseInt(buffer), buffer2),buffer3,buffer4);
                            if(estudiantes == null) throw new ModificarDatosException();
                        }
                    }catch(ModificarDatosException e){
                        e.mostrarMensajeError();
                    }
                    JOptionPane.showMessageDialog(null, "Operaci??n realizada correctamente");
                    break;

                case "Contabilizar Estudiantes de cierta edad":
                    buffer = JOptionPane.showInputDialog("Ingrese la edad de los estudiantes que desea contabilizar");
                    estudiantes.contabilizarEstudiantesEdad(Integer.parseInt(buffer));                   
                    JOptionPane.showMessageDialog(null,"Hay "+ estudiantes.contabilizarEstudiantesEdad(Integer.parseInt(buffer))+ " estudiantes de "+ buffer +" a??os");
                    break;

                case "Contabilizar Estudiantes por rango etario":
                    buffer = JOptionPane.showInputDialog("Ingrese el intervalo inferior del rango de edades de los estudiantes que desea contabilizar");
                    buffer2 =  JOptionPane.showInputDialog("Ingrese el intervalo superior del rango de edades de los estudiantes que desea contabilizar");
                    estudiantes.contabilizarEstudiantesRangoEtario(Integer.parseInt(buffer),Integer.parseInt(buffer2));
                    JOptionPane.showMessageDialog(null, "Hay "+ estudiantes.contabilizarEstudiantesRangoEtario(Integer.parseInt(buffer),Integer.parseInt(buffer2))+ " estudiantes entre "+ buffer + " y " + buffer2 +" a??os");
                    break;
                    
                case "Salir":
                    JOptionPane.showMessageDialog(null, "Operaci??n realizada correctamente");
                    control = 1;                    
                    break;
            }
        }
    }
    
    @Override
    public boolean hayCupos() {
        return this.estudiantes.contarEstudiantes()<= Disponibilidad.maxParticipantes;
    }

    @Override
    public boolean listaLlena() {
        return this.estudiantes.contarEstudiantes() == Disponibilidad.maxParticipantes;
    }

    @Override
    public boolean estadoActividad(ListaEstudiantes estudiantes) {
        return !(this.estudiantes.contarEstudiantes() < Disponibilidad.minimoParticipantes);
    }
}
