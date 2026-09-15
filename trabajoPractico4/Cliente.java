
/**
 * Clase que representa a un cliente con sus datos importantes
 * 
 * @author GAUNA GASTON LEONEL - BARRIOS MARCOS
 * @version 14/9/26
 */
public class Cliente
{
    //atributos
    private int nroDNI;
    private String apellido;
    private String nombre;
    private double saldo;
    
    /**
     * Metodo constructor
     * 
     * @param p_dni
     * @param p_nombre
     * @param p_apellido
     * @param p_importe
     */
    public Cliente(int p_dni, String p_nombre, String p_apellido, double p_importe){
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setImporte(p_importe);
    }
    
    //accossers
    private void setDNI(int p_dni){
        this.nroDNI = p_dni;
    }
    
    public int getDNI(){
        return this.nroDNI;
    }
    
    public void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private String getNombre(){
        return this.nombre;
    }
    
    public void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    private String getApellido(){
        return this.apellido;    
    }
    
    public void setImporte(double p_importe){
        this.saldo = p_importe;
    }
    
    private double getImporte(){
        return this.saldo;
    }
    
    public double nuevoSaldo(double p_importe){
        saldo = p_importe;
        return this.saldo;
    }
    
    public double agregaSaldo(double p_importe){
        this.setImporte(this.getImporte() + p_importe);
        return this.saldo;
    }
    
    /**
     * @return un String del nombre y apellido concatenados
     */
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }
    
    /**
     * @return un String del apellido y nombre concatenados
     */
    public String apeYNom(){
        return this.getApellido() + " " + this.getNombre();
    }
    
    /**
     * Imprime por pantalla los datos del cliente
     */
    public void mostrar(){
        System.out.println(" - CLIENTE - ");
        System.out.println("Nombre y Apellido: " + this.apeYNom() + "(" + this.getDNI() + ")");
        System.out.println("Saldo: " + this.getImporte());
    }

}