package proyecto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DeptoExt {
    
    private String nombreJefeDepartamento;
    private ListaActividades actividades;
    private ColeccionEncargados encargados;
    
    /*-----------SOBRECARGA DE CONSTRUCTORES-----------*/
    public DeptoExt() {
        actividades = new ListaActividades();
        encargados = new ColeccionEncargados();
    }
    
    public DeptoExt(String nombreJefeDepartamento) {
        this.nombreJefeDepartamento = nombreJefeDepartamento;
        actividades = new ListaActividades();
        encargados = new ColeccionEncargados();
    }
    /*-------------------------------------------------*/
    public String getNombreJefeDepartamento() {
        return nombreJefeDepartamento;
    }

    public void setNombreJefeDepartamento(String nombreJefeDepartamento) {
        this.nombreJefeDepartamento = nombreJefeDepartamento;
    }
    
    /*-----------Delegacion de responsabilidades(Actividades)-----------*/
    public boolean agregarActividad(Actividad actividad1) {
        return actividades.agregarActividad(actividad1);
    }
    
    public boolean agregarActividad(ArrayList<Actividad> Actividades) {
        return actividades.agregarActividad(Actividades);
    }
    
    public String mostrarActividad(){
        return actividades.mostrarActividad();
    }
    
    public void eliminarActividad(String nombreActividad){
         actividades.eliminarActividad(nombreActividad);
    }
    
    public void eliminarActividad(Encargado encargado){
        actividades.eliminarActividad(encargado);
    }
    
    public int estudiantesParticipantesCarreraTotal(String carrera){
        return actividades.estudiantesParticipantesCarreraTotal(carrera);
    }
    
    /*-----------Delegacion de responsabilidades(Encargados)-----------*/
    public void agregarEncargado(Encargado encargado1) {
        encargados.agregarEncargado(encargado1);
    }
    
    public void agregarEncargado(ArrayList<Encargado> ListaEncargado){
        encargados.agregarEncargado(ListaEncargado);
    }
    
    public void eliminarEncargado(int rut, String dv){
        encargados.eliminarEncargado(rut, dv);
    }
    
    public void eliminarEncargado(String rut){
        encargados.eliminarEncargado(rut);
    }
    
    public Encargado buscarEncargado(String rut){
        return encargados.buscarEncargado(rut);
    }
    
    public Actividad buscarActividad(String nombreActividad){
        return actividades.buscarActividad(nombreActividad);
    }
    
    public Actividad buscarActividad(Encargado encargado1){
        return actividades.buscarActividad(encargado1);
    }
    
    public String mostrarListadoActividades(){
        return actividades.mostrarListadoActividades();
    }
    public String mostrarEncargados(){ 
        return encargados.mostrarEncargados();
    }
    
    public Estudiante busquedaIntensivaEstudiante(Estudiante estudiante1){
        return actividades.busquedaIntensivaEstudiante(estudiante1);
    }
    
    public Estudiante busquedaIntensivaEstudiante(int rut, String dv) {
        return actividades.busquedaIntensivaEstudiante(rut, dv);
    }
    
    public void modificarDatosEncargado(Encargado encargado1, String nombre, int rut, String dv, int edad){
        encargados.modificarDatosEncargado(encargado1, nombre, rut, dv, edad);
    }
    
    public void modificarDatosEncargado(Encargado encargado1, String nombre){
        encargados.modificarDatosEncargado(encargado1, nombre);
    }
    
    public void modificarDatosEncargado(Encargado encargado1, int rut, String dv){
         encargados.modificarDatosEncargado(encargado1, rut, dv);
    }
    
    public void modificarDatosEstudiante(Encargado encargado1, int edad){
        encargados.modificarDatosEstudiante(encargado1, edad);
    }
     
    public void MenuEncargado(){
        
        String[] opcionesMenu = {"Agregar Encargado","Mostrar Encargados","Eliminar Encargado por rut completo","Buscar Encargado","Eliminar Encargado por rut y digito verificador(por separado)","Modificar datos Encargado(todos los datos)","Modificar datos Encargado(solo rut completo)","Modificar datos Encargado(solo edad)","Modificar datos Encargado(solo nombre)","Salir"};    
        String respuesta, buffer, buffer2, buffer3, buffer4, buffer5;        
        byte control = 0;
        
        while(control == 0){
            
            respuesta = (String)JOptionPane.showInputDialog(null,"Seleccione su opcion","Opciones",JOptionPane.DEFAULT_OPTION,null,opcionesMenu,opcionesMenu[0]);
        
            switch(respuesta){
                
                case "Agregar Encargado":
                    buffer = JOptionPane.showInputDialog("Ingrese el nombre del Encargado");
                    buffer2 = JOptionPane.showInputDialog("Ingrese el rut del Encargado(sin puntos ni digito verificador)");
                    buffer3 = JOptionPane.showInputDialog("Ingrese el digito verificador del rut del Encargado");
                    buffer4 = JOptionPane.showInputDialog("Ingrese la edad del Encargado");
                    Encargado encargado1 = new Encargado(buffer,Integer.parseInt(buffer2),buffer3,Integer.parseInt(buffer4));
                    encargados.agregarEncargado(encargado1);
                    JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                    break;
                    
                case "Mostrar Encargados":
                    System.out.println(encargados.mostrarEncargados());
                    JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                    break;
                    
                case "Eliminar Encargado por rut completo":
                    buffer = JOptionPane.showInputDialog("Ingrese el rut del Encargado(sin puntos y con guion");                    
                    encargados.eliminarEncargado(buffer);
                    JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                    break;
                    
                case "Buscar Encargado":                    
                    buffer = JOptionPane.showInputDialog("Ingrese el rut del Encargado(sin puntos y con guion");
                    
                    if(encargados.buscarEncargado(buffer)== null) {
                        JOptionPane.showMessageDialog(null, "El encargado no existe");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "El encargado si exite");
                    }
                    JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                    break;
                    
                case "Eliminar Encargado por rut y digito verificador(por separado)" :
                    buffer = JOptionPane.showInputDialog("Ingrese el rut del Encargado(sin puntos ni digito verificador)");
                    buffer2 = JOptionPane.showInputDialog("Ingrese el digito verificador del Encargado");
                    encargados.eliminarEncargado(Integer.parseInt(buffer), buffer2);
                    JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                    break;
                    
                case "Modificar datos Encargado(todos los datos)":
                    buffer = JOptionPane.showInputDialog("Ingrese el rut del Encargado");
                    if(encargados.buscarEncargado(buffer) == null){
                        JOptionPane.showMessageDialog(null, "El Encargado que desea modificar no existe");
                        break;  
                    }
                    else {
                        buffer2 = JOptionPane.showInputDialog("Ingrese el nuevo nombre del Encargado");
                        buffer3 = JOptionPane.showInputDialog("Ingrese el nuevo rut del Encargado(sin puntos ni digito verificador)");
                        buffer4 = JOptionPane.showInputDialog("Ingrese el nuevp digito verificador del rut del Encargado");
                        buffer5 = JOptionPane.showInputDialog("Ingrese la nueva edad del Encargado");
                        encargados.modificarDatosEncargado(encargados.buscarEncargado(buffer), buffer2, Integer.parseInt(buffer3), buffer4, Integer.parseInt(buffer5));
                    }
                    JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                    break;
                    
                case "Modificar datos Encargado(solo rut completo)":
                    buffer = JOptionPane.showInputDialog("Ingrese el rut del Encargado");
                    if(encargados.buscarEncargado(buffer) == null){
                        JOptionPane.showMessageDialog(null, "El Encargado que desea modificar no existe");
                        break;  
                    }
                    else {
                        buffer2 = JOptionPane.showInputDialog("Ingrese el digito verificador del Encargado");
                        encargados.modificarDatosEncargado(encargados.buscarEncargado(buffer),Integer.parseInt(buffer), buffer2);
                    }
                    JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                    break;
                    
                case "Modificar datos Encargado(solo nombre)":
                    buffer = JOptionPane.showInputDialog("Ingrese el rut del Encargado");
                    if(encargados.buscarEncargado(buffer) == null){
                        JOptionPane.showMessageDialog(null, "El Encargado que desea modificar no existe");
                        break;  
                    }
                    else {
                        buffer2 = JOptionPane.showInputDialog("Ingrese el nuevo nombre del Encargado");
                        encargados.modificarDatosEncargado(encargados.buscarEncargado(buffer),buffer2);
                    }
                    JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                    break;
                    
                case "Modificar datos Encargado(solo edad)":
                    buffer = JOptionPane.showInputDialog("Ingrese el rut del Encargado");
                    if(encargados.buscarEncargado(buffer) == null){
                        JOptionPane.showMessageDialog(null, "El Encargado que desea modificar no existe");
                        break;  
                    }
                    else {
                        buffer2 = JOptionPane.showInputDialog("Ingrese la nueva edad del Encargado");
                        encargados.modificarDatosEstudiante(encargados.buscarEncargado(buffer), Integer.parseInt(buffer2)) ;
                    }
                    JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                    break;
                    
                case "Salir":
                    control = 1;
                    break;     
            }
        }
    }
    
    public void MenuActividades(){
        
        String[] opcionesMenu = {"Agregar Actividad","Eliminar Actividad por nombre","Eliminar Actividad por Encargado","Eliminar Actividad","Mostrar Listado de Actividades y sus datos","Buscar Actividad por nombre","Buscar Actividad","Buscar Actividad por Encargado","Mostrar Listado de Actividades","Menu Estudiantes(Para una sola Actividad)","Total de Estudiantes participantes de cierta carrera","Busqueda Intensiva de Estudiante","Busqueda Intensiva de Estudiante por rut completo","Salir"};    
        String respuesta, buffer, buffer2, buffer3, buffer4, buffer5;        
        byte control = 0;
        
        while(control == 0){
            
            respuesta = (String)JOptionPane.showInputDialog(null,"Seleccione su opcion","Opciones",JOptionPane.DEFAULT_OPTION,null,opcionesMenu,opcionesMenu[0]);
            
            switch(respuesta){
                
                case "Agregar Actividad":
                    buffer = JOptionPane.showInputDialog("Ingrese el nombre de la Actividad");
                    buffer2 = JOptionPane.showInputDialog("Ingrese el rut del Encargado(sin puntos, con guion y digito verificador)");
                    Actividad actividad1 = new Actividad();
                    actividad1.setNombreActividad(buffer);
                    
                    if(encargados.buscarEncargado(buffer2) == null){
                        JOptionPane.showMessageDialog(null, "El encargado no existe");
                    }
                    else {
                        actividad1.setEncargadoActividad(buscarEncargado(buffer2));
                    }
                    actividades.agregarActividad(actividad1);
                    JOptionPane.showMessageDialog(null, "La actividad se ha agregado a la lista de forma correcta");
                    break;
                    
                case "Eliminar Actividad por nombre":
                    
                    buffer = JOptionPane.showInputDialog("Ingrese el nombre de la Actividad que desea eliminar");
                    if(actividades.buscarActividad(buffer)== null) {
                        JOptionPane.showMessageDialog(null, "La Actividad que desea eliminar no existe");
                    }
                    else{
                        actividades.eliminarActividad(buffer);
                    }
                    JOptionPane.showMessageDialog(null, "La actividad se ha eliminado de forma correcta");
                    break;
                    
                case "Eliminar Actividad por Encargado":
                    
                    buffer = JOptionPane.showInputDialog("Ingrese el nombre del Encargado");
                    buffer2 = JOptionPane.showInputDialog("Ingrese el rut del Encargado(sin puntos ni digito verificador)");
                    buffer3 = JOptionPane.showInputDialog("Ingrese el digito verificador del rut del Encargado");
                    buffer4 = JOptionPane.showInputDialog("Ingrese la edad del Encargado");
                    Encargado encargado1 = new Encargado(buffer,Integer.parseInt(buffer2),buffer3,Integer.parseInt(buffer4));
                    
                    if(actividades.buscarActividad(encargado1) == null) {
                        JOptionPane.showMessageDialog(null, "La Actividad que desea eliminar no existe");
                    }
                    else{
                        actividades.eliminarActividad(encargado1);
                    }
                    JOptionPane.showMessageDialog(null, "La actividad se ha eliminado de forma correcta");
                    break;
                    
                case "Eliminar Actividad":   
                    
                    buffer = JOptionPane.showInputDialog("Ingrese el nombre de la Actividad");
                    buffer2 = JOptionPane.showInputDialog("Ingrese el rut del Encargado(sin puntos, con guion y digito verificador)");
                    Actividad actividad2 = new Actividad();
              
                    if(buscarEncargado(buffer2) == null){
                        JOptionPane.showMessageDialog(null, "La Actividad que desea eliminar no existe");
                    }
                    else {
                        actividad2.setEncargadoActividad(buscarEncargado(buffer2));
                    }
                    actividades.eliminarActividad(actividad2);
                    JOptionPane.showMessageDialog(null, "La actividad se ha eliminado de forma correcta");
                    break;
                    
                case "Buscar Actividad por nombre":
                    buffer = JOptionPane.showInputDialog("Ingrese el nombre de la Actividad");
                    
                    if(actividades.buscarActividad(buffer)== null){
                         JOptionPane.showMessageDialog(null, "La Actividad que desea buscar no existe");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "La Actividad si se encuentra dentro de la lista");
                    }
                    JOptionPane.showMessageDialog(null, "La busqueda se ha completado de forma correcta");
                    break;
                    
                case "Buscar Actividad":
                    buffer = JOptionPane.showInputDialog("Ingrese el nombre de la Actividad");
                    buffer2 = JOptionPane.showInputDialog("Ingrese el rut del Encargado(sin puntos, con guion y digito verificador)");
                    Actividad actividad3 = new Actividad();
                    actividad3.setNombreActividad(buffer);
                    
                    if(encargados.buscarEncargado(buffer2) == null){
                        JOptionPane.showMessageDialog(null, "El encargado no existe");
                    }
                    else {
                        actividad3.setEncargadoActividad(buscarEncargado(buffer2));
                    }
                    JOptionPane.showMessageDialog(null, "La busqueda se ha completado de forma correcta");
                    break;
                    
                case "Buscar Actividad por Encargado":
                    buffer = JOptionPane.showInputDialog("Ingrese el nombre del Encargado");
                    buffer2 = JOptionPane.showInputDialog("Ingrese el rut del Encargado(sin puntos ni digito verificador)");
                    buffer3 = JOptionPane.showInputDialog("Ingrese el digito verificador del rut del Encargado");
                    buffer4 = JOptionPane.showInputDialog("Ingrese la edad del Encargado");
                    Encargado encargado2 = new Encargado(buffer,Integer.parseInt(buffer2),buffer3,Integer.parseInt(buffer4));
                    
                    if(actividades.buscarActividad(encargado2) == null){
                        JOptionPane.showMessageDialog(null, "La Actividad que desea buscar no existe");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "La Actividad si se encuentra dentro de la lista");
                    }
                    JOptionPane.showMessageDialog(null, "La busqueda se ha completado de forma correcta");
                    break;
                    
                case "Mostrar Listado de Actividades y sus datos":
                    System.out.println(actividades.mostrarActividad());
                    JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                    break;
                    
                case "Mostrar Listado de Actividades":
                    System.out.println(actividades.mostrarListadoActividades());
                    JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                    break;
                    
                case "Total de Estudiantes participantes de cierta carrera":
                    buffer = JOptionPane.showInputDialog("Ingrese el nombre de la Carrera que desea contabilizar");
                    actividades.estudiantesParticipantesCarreraTotal(buffer);
                    JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                    break;
                    
                case "Busqueda Intensiva de Estudiante por rut completo":
                    buffer = JOptionPane.showInputDialog("Ingrese el rut del Estudiante(sin puntos)") ;
                    buffer2 = JOptionPane.showInputDialog("Ingrese el digito verificador del rut del estudiante") ;
                    
                    if(actividades.busquedaIntensivaEstudiante(Integer.parseInt(buffer), buffer2) == null){
                        JOptionPane.showMessageDialog(null, "El estudiante que desea buscar no existe");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "El estudiante que se buscar se ha encontrado de forma exitosa");
                    }
                    JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                    break;
                    
                case "Busqueda Intensiva de Estudiante":
                    buffer = JOptionPane.showInputDialog("Ingrese el nombre del Estudiante");
                    buffer2 = JOptionPane.showInputDialog("Ingrese el rut del Estudiante (sin puntos ni digito verificador)");
                    buffer3 = JOptionPane.showInputDialog("Ingrese el digito verificador del rut del Estudiante");
                    buffer4 = JOptionPane.showInputDialog("Ingrese la edad del Encargado");
                    buffer5 = JOptionPane.showInputDialog("Ingrese la carrera del Estudiante");
                    Estudiante estudiante1 = new Estudiante(buffer,Integer.parseInt(buffer2),buffer3,Integer.parseInt(buffer4),buffer5);
                    
                    if(actividades.busquedaIntensivaEstudiante(estudiante1) == null) {
                        JOptionPane.showMessageDialog(null, "El estudiante que desea buscar no existe");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "El estudiante que se buscar se ha encontrado de forma exitosa");
                    }
                    JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                    break;
                    
                case "Menu Estudiantes(Para una sola Actividad)":
                    buffer = JOptionPane.showInputDialog("Ingrese el nombre de la Actividad");
                    
                    if(actividades.buscarActividad(buffer)== null){
                        JOptionPane.showMessageDialog(null, "La Actividad no existe");
                    }
                    else{
                        actividades.buscarActividad(buffer).MenuEstudiantes();
                    }      
                    break;
                    
                case "Salir":
                    control = 1;
                    break;     
            }
        }
    }
}
