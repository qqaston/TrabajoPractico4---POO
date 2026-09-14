/**
 * Clase Laboratorio aplica la abstraccion de un objeto Laboratorio.
 * 
 * @author GAUNA GASTON LEONEL - BARRIOS MARCOS
 * @version 24/8/26
 */
public class Laboratorio
{
    //atributos
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;
    
    /**
     * Metodo constructor de Laboratorio
     * 
     * @param p_nombre
     * @param p_domicilio
     * @param p_telefono
     * @param p_compraMinima
     * @param p_diaEntrega
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMinima, int p_diaEntrega){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(p_compraMinima);
        this.setDiaEntrega(p_diaEntrega);
    }
    
    /**
     * @param p_nombre
     * @param p_domicilio
     * @param p_telefono
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
    }
    
    
    /**
     * Accessors
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    
    public String getDomicilio(){
        return this.domicilio;
    }
    
    private void setTelefono(String p_telefono){
        this.telefono = p_telefono;
    }
    
    public String getTelefono(){
        return this.telefono;
    }
    
    private void setCompraMinima(int p_compraMinima){
        this.compraMinima = p_compraMinima;
    }
    
    public int getCompraMinima(){
        return this.compraMinima;
    }
    
    private void setDiaEntrega(int p_diaEntrega){
        this.diaEntrega = p_diaEntrega;
    }
    
    public int getDiaEntrega(){
        return this.diaEntrega;
    }
    
    /**
     * Este metodo modifica la compra minima
     * 
     * @param p_compraMinima
     */
    public void nuevaCompraMinima(int p_compraMinima){
        this.compraMinima = p_compraMinima;
    }
    
    /**
     * Este metodo modifica el dia de entrega
     * 
     * @param p_diaEntrega 
     */
    public void nuevoDiaEntrega(int p_diaEntrega){
        this.setDiaEntrega(p_diaEntrega);
    }
    
    /**
     * @return un String concatenada, del Nombre + Domicilio + Telefono
     */
    public String mostrar(){
        String textoMostrar = "Laboratorio: " + getNombre() + "\n" +
                        "Domicilio: " + getDomicilio() + " - Telefono: " + getTelefono();
        return textoMostrar;
    }
    
}