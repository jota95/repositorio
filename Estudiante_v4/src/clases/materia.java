package clases;

public class materia {

    private String nombre;
    private String codigo;
    private double nota1;
    private double nota2;
    private double nota3;
    private double notafinal;

    public String getNombre() {
        return nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double getNotafinal() {
        return notafinal;
    }

    public String getCodigo() {
        return codigo;
    }
    
    
   public materia(String cod,String nom) {
        codigo = cod;
        nombre = nom;
    }
    
   public materia(String cod, double n1, double n2, double n3) {
        codigo = cod;       
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;        
    }

    public materia(String cod,String nom, double n1, double n2, double n3) {
        codigo = cod;
        nombre = nom;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
        System.out.println("nombre: " + nom + "\n nota 1: " + nota1 + "\n nota 2: " + nota2 + "\n nota 3: " + nota3);
    }

    public void notafinal() {
        notafinal = ((nota1 * 0.3) + (nota2 * 0.3) + (nota3 * 0.4));
        System.out.println("\n nota final= " + notafinal);
    }
    
    
    public String toString() {
        return nombre;
    }

}
