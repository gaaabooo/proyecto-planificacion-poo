package proyecto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListaActividades {
    
    private ArrayList<Actividad> arregloActividades;

    public ListaActividades() {
        arregloActividades = new ArrayList<>();
    }
    
    /*-----------SOBRECARGA DE METODOS(agregarActividad)-----------*/
    public boolean agregarActividad(Actividad actividad1) {
        for(int i = 0 ; i < arregloActividades.size() ; i++) {
            /*Aqui se verifica si el objeto tipo Actividad ingresado por parametro se encuentra dentro de la lista*/
            if(arregloActividades.get(i).equals(actividad1)){
                return false;
            }
        }
        arregloActividades.add(actividad1);
        return true;
    }
    
    public boolean agregarActividad(ArrayList<Actividad> Actividades) {
        /*Aqui se recorre el largo del arreglo tipo actividad que es ingresado por parametros*/
        for(int i = 0; i < Actividades.size(); i++){
            this.agregarActividad(Actividades.get(i));
        }
        return true;
    }
    
    public String mostrarActividad(){
        int i;
        String texto = "";
        for(i = 0; i < arregloActividades.size(); i++){
            texto += (arregloActividades.get(i).mostrarDatosActividad()+"\n");
        }
        return texto;
    }
    
    /*-----------SOBRECARGA DE METODOS (eliminarActividad)-----------*/
    public void eliminarActividad(String nombreActividad){
        for(int i = 0; i < arregloActividades.size(); i++){
            if(arregloActividades.get(i).getNombreActividad().equalsIgnoreCase(nombreActividad)){
                arregloActividades.remove(i);
            }
        }
    }
    
    public void eliminarActividad(Actividad actividad1){
        for(int i = 0; i < arregloActividades.size(); i++){
            if(arregloActividades.get(i).equals(actividad1)){
                arregloActividades.remove(i);
            }
        }
    }
    
    public void eliminarActividad(Encargado encargado){
        for(int i = 0; i < arregloActividades.size(); i++){
            if(arregloActividades.get(i).getEncargadoActividad().equals(encargado)){
                arregloActividades.remove(i);
            }
        }
    }
    /*
    @autor Gabriel Muñoz
    Esta funcion realiza un recorrido por todas las listas de actividades contabilizando por cada una de ellas los estudiantes
    participantes de una carrera en particular y los suma sacando el total de estudiantes participantes de todas las actividades
    de una carrera en particular (manejar una app que pueda admin y manejar act donde estas mantienen un encargado)
    */
    public int estudiantesParticipantesCarreraTotal(String carrera){
        int totalEstudiantes = 0;
        for(int i = 0; i < arregloActividades.size(); i++){
            totalEstudiantes += arregloActividades.get(i).estudiantesParticipantesPorCarrera(carrera);
        }
        return totalEstudiantes;
    }
    
    /*-----------SOBRECARGA DE METODOS(buscarActividad)-----------*/
    public Actividad buscarActividad(String nombreActividad){
        for (Actividad actividad : arregloActividades) {
            if(actividad.getNombreActividad().equalsIgnoreCase(nombreActividad)){
                return actividad;
            }
        }
        return null;
    }
    
    public Actividad buscarActividad(Actividad actividad1){
        for (Actividad actividad : arregloActividades) {
            if(actividad.equals(actividad1)){
                return actividad;
            }
        }
        return null;
    }
    
    public Actividad buscarActividad(Encargado encargado1){
        for (Actividad actividad : arregloActividades) {
            if(actividad.getEncargadoActividad().equals(encargado1)){
                return actividad;
            }
        }
        return null;
    }
    
    public String mostrarListadoActividades(){
        String texto = "";
        for(int i = 0; i < arregloActividades.size(); i++){
            texto += arregloActividades.get(i).getNombreActividad()+"\n";
        }
        return texto;
    }
    
    /**-----------SOBRECARGA DE METODOS(buscarIntensivaEstudiante)-----------*/
    public Estudiante busquedaIntensivaEstudiante(Estudiante estudiante1) {
        for (Actividad actividad : arregloActividades) {
            if(actividad.buscarEstudiante(estudiante1).equals(estudiante1)){
                return estudiante1;
            }
        }
        return null;
    }
    
    public Estudiante busquedaIntensivaEstudiante(int rut, String dv){
        for (Actividad actividad : arregloActividades) {
            if(actividad.buscarEstudiante(rut, dv) != null)
                return actividad.buscarEstudiante(rut, dv);
        }
        return null;
    }

    /*-----------METODOS DE SELECCION DE OBJETOS POR CRITERIO -----------*/
    public int contabilizarEstudiantesEdadTotal(int edad) {
        int totalEstudiantesEdad = 0;
        for(int i = 0; i < arregloActividades.size(); i++){
            totalEstudiantesEdad += arregloActividades.get(i).contabilizarEstudiantesEdad(edad);
        }
        return totalEstudiantesEdad;
    }

    public int contabilizarEstudiantesRangoEtarioTotal(int edad1, int edad2) {
        int totalRangoEdad = 0;
        for(int i = 0; i < arregloActividades.size(); i++){
            totalRangoEdad += arregloActividades.get(i).contabilizarEstudiantesRangoEtario(edad1,edad2);
        }
        return totalRangoEdad;
    }
}
