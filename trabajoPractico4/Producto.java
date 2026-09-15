
/**
 * Clase Producto que representa la abstraccion de un producto de una drogueria.
 * 
 * @author Gaston Leonel Gauna - BARRIOS MARCOS
 * @version 24/8/26
 */
public class Producto
{
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio lab;    

    /**
     * Constructor for objects of class Producto
     * @param p_codigo
     * @param p_rubro
     * @param p_desc
     * @param p_costo
     * @param p_porcPtoRepo
     * @param p_existMinima
     * @param p_lab
     * 
     */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, double p_porcPtoRepo,int p_existMinima, Laboratorio p_lab)
    {
        // initialise instance variables
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDesc(p_desc);
        this.setCosto(p_costo);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setLaboratorio(p_lab);
        
        
        //inicializa stock en 0
        this.setStock(0);
    }
    
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDesc(p_desc);
        this.setCosto(p_costo);
        this.setLaboratorio(p_lab);
        
        //inicializa stock en 0
        this.setStock(0);
    }

    //accossers
    private void setCodigo(int p_codigo){
        this.codigo = p_codigo;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    private void setRubro(String p_rubro){
        this.rubro = p_rubro;
    }
    
    public String getRubro(){
        return this.rubro;
    }
    
    private void setDesc(String p_desc){
        this.descripcion = p_desc;
    }
    
    public String getDesc(){
        return this.descripcion;
    }
    
    private void setCosto(double p_costo){
        this.costo = p_costo;
    }
    
    public double getCosto(){
        return this.costo;
    }
    
    private void setPorcPtoRepo(double p_porcPtoRepo){
        this.porcPtoRepo = p_porcPtoRepo;
    }
    
    public double getPorcPtoRepo(){
        return this.porcPtoRepo;
    }
    
    private void setExistMinima(int p_existMinima){
        this.existMinima = p_existMinima;
    }
    
    private void setLaboratorio(Laboratorio p_lab){
        this.lab = p_lab;
    }
    
    public Laboratorio getLaboratorio(){
        return this.lab;
    }
    
    private void setStock(int stock){
        this.stock = stock;
    }
    
    public int getStock(){
        return this.stock;
    }
    
    /**
     * Este metodo aplica la cantidad de stock del producto
     * @param p_cantidad
     */
    public void ajuste(int p_cantidad){
        this.setStock(this.getStock() + p_cantidad);    
    }
    
    /**
     * @return precio de costo mas un 12%
     */
    public double precioLista(){
        return this.getCosto() + (this.getCosto() * 0.12);
    }
    
    /**
     * @return el valor que representa el precio por pago al contado del producto, que se calcula restando un 5% al precio de lista
     */
    public double precioContado(){
    return this.precioLista() - (this.precioLista() * 0.05);
    }
    
    /**
     * @return el resultado de multiplicar el stock por el precio de costo, más una rentabilidad de 12%
     */
    public double stockValorizado(){
        double aux = this.getStock() * this.getCosto();
        return aux + (aux * 0.12);
    }

    /**
     * Por diversos factores (demanda estacional, demanda de mercado, etc.), es política de la empresa que el porcentaje de
     * punto de reposición y la existencia mínima de cada producto sea variable. Estos pueden ser modificados mediante los
     * métodos ajustarPtoRepo() y ajustarExistMin(), que permiten asignar un nuevo valor a dichos atributos.
     * 
     * @param porcPtoRepo
     */
    public void ajustarPtoRepo(double porcPtoRepo){
            this.setPorcPtoRepo(porcPtoRepo);
        }
        
    /**
     * @param existMin
     */
    public void ajustarExistMin(int existMin){
        this.setExistMinima(existMin);
    }
    
    public void mostrar(){
        System.out.println(this.getLaboratorio().mostrar());
        System.out.println("Rubro: " + this.getRubro());
        System.out.println("Descripcion: " + this.getDesc());
        System.out.println("Precio Costo: " + this.getCosto());
        System.out.println("Stock: " + this.getStock() + " - " + "Stock Valorizado: " + this.stockValorizado());
    }
    
    
    /**
     * @return una cadena de caracteres concatenando descripcion, percio de lista y precio contado
     */
    public String mostrarLinea(){
        return this.getDesc() + "   " + this.precioLista() + "  " + this.precioContado();
    }
}