package proyecto;

public interface Disponibilidad {

    int minimoParticipantes = 5;

    public int hayCupos();
    public boolean listaLlena();
    public boolean estadoActividad(ListaEstudiantes estudiantes);
}