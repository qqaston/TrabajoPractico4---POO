
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    //atributos
    private int nroDNI;
    private String apellido;
    private String nombre;
    private double saldo;
    
    //metodo constructor
    public Cliente(int p_dni, String p_nombre, String p_apellido, double p_importe){
        setDNI(p_dni);
        setNombre(p_nombre);
        setApellido(p_apellido);
        setImporte(p_importe);
    }
    
    //accossers
    private void setDNI(int p_dni){
        nroDNI = p_dni;
    }
    
    public int getDNI(){
        return nroDNI;
    }
    
    public void setNombre(String p_nombre){
        nombre = p_nombre;
    }
    
    private String getNombre(){
        return nombre;
    }
    
    public void setApellido(String p_apellido){
        apellido = p_apellido;
    }
    
    private String getApellido(){
        return apellido;    
    }
    
    public void setImporte(double p_importe){
        saldo = p_importe;
    }
    
    private double getImporte(){
        return saldo;
    }
    
    public double nuevoSaldo(double p_importe){
        saldo = p_importe;
        return saldo;
    }
    
    public double agregaSaldo(double p_importe){
        setImporte(getImporte() + p_importe);
        return saldo;
    }
    
    public String nomYApe(){
        return nombre + " " + apellido;
    }
    
    public String apeYNom(){
        return apellido + " " + nombre;
    }
    
    public void mostrar(){
        System.out.println(" - CLIENTE - ");
        System.out.println("Nombre y Apellido: " + apeYNom() + "(" + getDNI() + ")");
        System.out.println("Saldo: " + getImporte());
    }

}