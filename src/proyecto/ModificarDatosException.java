package proyecto;

import javax.swing.JOptionPane;

public class ModificarDatosException extends Exception {

    public ModificarDatosException() {
    }

    public ModificarDatosException(String message) {
        super(message);
    }
    
    public void mostrarMensajeError(){
        JOptionPane.showMessageDialog(null, "Se ha generado un error de listado de datos " + this.getMessage());
    }
}
