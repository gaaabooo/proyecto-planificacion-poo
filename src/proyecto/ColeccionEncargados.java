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
}
