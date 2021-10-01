package proyecto;

public class Proyecto {

    public static void main(String[] args) {
                
        /*Ejemplo Datos Encargados*/
        Encargado encargado1 = new Encargado("Luis Andaur",14327205,"4",42);
        Encargado encargado2 = new Encargado("Pedro Engel",5717591,"5",70);
        Encargado encargado3 = new Encargado("Edo Caroe",12696711,"K",46);
        
        /*Ejemplo Datos Coleccion Encargados*/
        ColeccionEncargados ListaEncargados1 = new ColeccionEncargados();
        ListaEncargados1.agregarEncargado(encargado1);
        ListaEncargados1.agregarEncargado(encargado2);
        ListaEncargados1.agregarEncargado(encargado3);
        
        /*Ejemplo Datos Estudiantes*/
        Estudiante estudiante1 = new Estudiante("Cristiano Ronaldo",20360953,"1",20,"Ing. de Ejecucion en Informatica");
        Estudiante estudiante2 = new Estudiante("Ivan Zamorano",20010604,"k",22,"Ing Civil Informatica");
        Estudiante estudiante3 = new Estudiante("Mbappe",20320114,"1",20,"Ing. Civil Industrial");

        /*Ejemplos Actividades*/
        Actividad actividad1 = new Actividad("Trekking",encargado1);
        Actividad actividad2 = new Actividad("Yoga",encargado2);
        Actividad actividad3 = new Actividad("Stand Up Comedy",encargado3);
        
        /*Ejemplo Datos Lista Estudiantes*/
        actividad1.agregarEstudiante(estudiante1);
        actividad1.agregarEstudiante(estudiante2);
        actividad1.agregarEstudiante(estudiante3);
        actividad2.agregarEstudiante(estudiante1);
        actividad2.agregarEstudiante(estudiante2);
        actividad2.agregarEstudiante(estudiante3);
        actividad3.agregarEstudiante(estudiante1);
        actividad3.agregarEstudiante(estudiante2);
        actividad3.agregarEstudiante(estudiante3);
        
        /*Ejemplos DeptoExt*/
        DeptoExt departamentoExt = new DeptoExt("Claudio Cubillos");
        
        /*Agregando Actividades y Encargados*/
        departamentoExt.agregarActividad(actividad1);
        departamentoExt.agregarActividad(actividad2);
        departamentoExt.agregarActividad(actividad3);
        departamentoExt.agregarEncargado(encargado1);
        departamentoExt.agregarEncargado(encargado2);
        departamentoExt.agregarEncargado(encargado3);
        
        /*Ejemplo Universidad*/
        Universidad universidad1 = new Universidad("Pontificia Universidad Catolica de Valparaiso", "Claudio Elórtegui Raffo",departamentoExt);
 
        universidad1.Menu();
    }
}
