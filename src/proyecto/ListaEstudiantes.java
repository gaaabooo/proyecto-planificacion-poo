package proyecto;

import java.util.ArrayList;

public class ListaEstudiantes {

    private ArrayList<Estudiante> ArregloEstudiantes;

    public ListaEstudiantes() {
        ArregloEstudiantes = new ArrayList<>();
    }

    /*-----------SOBRECARGA DE METODOS(agregarEstudiante)-----------*/
    public boolean agregarEstudiante(Estudiante estudiante1) {
        for (int i = 0; i < ArregloEstudiantes.size(); i++) {
            /*Aqui se verifica si el objeto tipo estudiante ingresado por parametro se encuentra dentro de la lista*/
            if (ArregloEstudiantes.get(i).equals(estudiante1)) {
                return false;
            }
        }
        ArregloEstudiantes.add(estudiante1);
        return true;
    }

    public boolean agregarEstudiante(ArrayList<Estudiante> Estudiantes) {
        /*Aqui se recorre el largo del arreglo tipo estudiante que es ingresado por parametros*/
        for (int i = 0; i < Estudiantes.size(); i++) {
            this.agregarEstudiante(Estudiantes.get(i));
        }
        return true;
    }

    public String mostrarEstudiantes() {
        int i;
        String texto = "";
        for (i = 0; i < ArregloEstudiantes.size(); i++) {
            texto += (ArregloEstudiantes.get(i).mostrarDatosEstudiante() + "\n");
        }
        return texto;
    }

    /*-----------SOBRECARGA DE METODOS(eliminarEstudiante)-----------*/
    public boolean eliminarEstudiante(Estudiante estudiante1){
        for (int i = 0; i < ArregloEstudiantes.size(); i++) {
            if(ArregloEstudiantes.get(i).equals(estudiante1)){
                ArregloEstudiantes.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarEstudiante(int rut, String dv) {
        for (int i = 0; i < ArregloEstudiantes.size(); i++) {
            if ((ArregloEstudiantes.get(i).getRut() == rut) && (ArregloEstudiantes.get(i).getDv().equalsIgnoreCase(dv))) {
                ArregloEstudiantes.remove(i);
                return true;
            }
        }
        return false;
    }

    /*
    @autor Gabriel Muñoz
    Esta funcion permite contabilizar a los Estudiantes de un carrera en particular dentro de una solo objeto
    Actividad
    @return retorna el total de estudiantes de una carrera de una lista de actividades
     */
    public int estudiantesParticipantesPorCarrera(String carrera) {
        int cont = 0;
        for (Estudiante estudiante : ArregloEstudiantes) {
            if (estudiante.getCarreraEstudiante().equalsIgnoreCase(carrera)) {
                cont++;
            }
        }
        return cont;
    }

    /*-----------SOBRECARGA DE METODOS(buscarEstudiante)-----------*/
    public Estudiante buscarEstudiante(int rut, String dv) {
        for (Estudiante estudiante : ArregloEstudiantes) {
            if ((estudiante.getRut() == rut) && (estudiante.getDv().equalsIgnoreCase(dv))) {
                return estudiante;
            }
        }
        return null;
    }

    public Estudiante buscarEstudiante(Estudiante estudiante1) {
        for (Estudiante estudiante : ArregloEstudiantes) {
            if (estudiante.equals(estudiante1)) {
                return estudiante;
            }
        }
        return null;
    }
}
