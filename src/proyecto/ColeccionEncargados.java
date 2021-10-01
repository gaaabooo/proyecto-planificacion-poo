package proyecto;

import java.util.ArrayList;
import java.util.HashMap;

public class ColeccionEncargados {
    
    private HashMap<String,Encargado> MapaEncargados;
    
    public ColeccionEncargados() {
        MapaEncargados = new HashMap<>();
    }
    
    /*-----------SOBRECARGA DE METODOS(agregarEncargado)-----------*/
    public void agregarEncargado(Encargado encargado1) {
        MapaEncargados.put(""+encargado1.getRut()+"-"+encargado1.getDv(), encargado1);
    }
    
    public void agregarEncargado(ArrayList<Encargado> encargados){
        for (Encargado encargado : encargados) {
            MapaEncargados.put(""+encargado.getRut()+"-"+encargado.getDv(), encargado);
        }
    }
    /*---------------------------------------------------------------*/
    /*-----------SOBRECARGA DE METODOS(eliminarEncargado)-----------*/
    public void eliminarEncargado(int rut, String dv){
        MapaEncargados.remove(""+rut+"-"+dv);
    }
    
    public void eliminarEncargado(String rut){
        MapaEncargados.remove(rut);
    }
    /*---------------------------------------------------------------*/
    
    public Encargado buscarEncargado(String rut){
        return MapaEncargados.get(rut);
    }
    
    public String mostrarEncargados(){
        String texto = "";
        for (Encargado encargado1: MapaEncargados.values()) {
            texto += encargado1.toString()+"\n";
        }
        return texto;
    }
    
    /*-----------SOBRECARGA DE METODOS(modificarDatosEncargado)-----------*/
    
    /*Si se quiere modificar todos los datos*/
    public void modificarDatosEncargado(Encargado encargado1, String nombre, int rut, String dv, int edad){
        encargado1.setNombre(nombre);
        encargado1.setRut(rut);
        encargado1.setDv(dv);
        encargado1.setEdad(edad);
    }
    
    /*Si solo se quiere modificar el nombre*/
    public void modificarDatosEncargado(Encargado encargado1, String nombre){
        encargado1.setNombre(nombre);
    }
    
    /*Si se quiere modificar el rut completo*/
    public void modificarDatosEncargado(Encargado encargado1, int rut, String dv){
        encargado1.setRut(rut);
        encargado1.setDv(dv);
    }
    
    /*Si solo se quiere modificar la edad*/
    public void modificarDatosEstudiante(Encargado encargado1, int edad){
        encargado1.setEdad(edad);
    }
}
