package proyecto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Universidad {
    
    private String nombreUniversidad;
    private String nombreRector;
    private DeptoExt departamentoExt;

    /*-----------SOBRECARGA DE CONSTRUCTORES-----------*/
    public Universidad() {
        
    }

    public Universidad(String nombreUniversidad, String nombreRector, DeptoExt departamentoExt) {
        this.nombreUniversidad = nombreUniversidad;
        this.nombreRector = nombreRector;
        this.departamentoExt = departamentoExt;
    }
    /*-------------------------------------------------*/
    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }

    public String getNombreRector() {
        return nombreRector;
    }

    public void setNombreRector(String nombreRector) {
        this.nombreRector = nombreRector;
    }

    public DeptoExt getDepartamentoExt() {
        return departamentoExt;
    }

    public void setDepartamentoExt(DeptoExt departamentoExt) {
        this.departamentoExt = departamentoExt;
    }
    /*-----------Delegacion de responsabilidades(DeptoExt)-----------*/
    public void MenuEncargado(){
        departamentoExt.MenuEncargado();
    }
    
    public void MenuActividades(){
        departamentoExt.MenuActividades();
    }
     
    /*Menu principal desplegable*/
    public void Menu(){    
        
        String[] opcionesMenu = {"Menu Encargado","Menu Actividades","Crear Reporte","Salir"};    
        String respuesta;        
        byte control = 0;
        
        while(control == 0){
            
            respuesta = (String)JOptionPane.showInputDialog(null,"Seleccione su opcion","Opciones",JOptionPane.DEFAULT_OPTION,null,opcionesMenu,opcionesMenu[0]);
        
            switch(respuesta){
                case "Menu Encargado":
                    departamentoExt.MenuEncargado();
                    break;
                case "Menu Actividades":
                    departamentoExt.MenuActividades();
                    break;
                case "Crear Reporte":
                    this.crearReporte();
                    JOptionPane.showMessageDialog(null, "El reporte se ha creado de forma correcta");
                    break;                    
                case "Salir":
                    control = 1;
                    break;     
            }
        }
    }
    
    public void crearReporte() {
        
        try {           
            
            File file = new File("Reporte.txt");
            
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(departamentoExt.mostrarActividad());
            bw.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
