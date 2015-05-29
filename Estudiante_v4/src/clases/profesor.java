

package clases;

public class profesor {
    
    String nombre;
    String cedula;
    String telefono;


    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

   

    public String getTelefono() {
        return telefono;
    }
    
        
    
    public profesor(String cedulaNuevo,String nombreNuevo, String telefonoNuevo){
        cedula= cedulaNuevo;
        nombre= nombreNuevo;
        telefono= telefonoNuevo;
        
    }
    
    public String toString() {
        return nombre;
    }
    
}


