package proyecto;

public interface Disponibilidad {

    final static int minimoParticipantes = 5;
    final static int maxParticipantes = 30;

    public boolean hayCupos();
    public boolean listaLlena();
    public boolean estadoActividad(ListaEstudiantes estudiantes);
}