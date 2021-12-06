package proyecto;

import javax.swing.JOptionPane;

public class AddDatosException extends Exception{

    public AddDatosException() {
    }

    public AddDatosException(String message) {
        super(message);
    }
    
    public void mostrarMensajeError() {
        JOptionPane.showMessageDialog(null, "Se ha generado un error de agregado " + this.getMessage());
    }
}
