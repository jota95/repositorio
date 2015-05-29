

package clases;

public class estudiante {
    
    private String nombre;
    private String telefono;
    private String codigo;



    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCodigo() {
        return codigo;
    }


    
    
    
    public estudiante (String codigoNuevo,String nombreNuevo,String telefonoNuevo){
        nombre=nombreNuevo;
        codigo=codigoNuevo;
        telefono= telefonoNuevo;
 
        
        System.out.println("nombre: "+nombre+"\ncodigo: "+codigo+"\ntelefono: "+telefono);
    }
    
   
}

