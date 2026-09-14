import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;
/**
 * Clase que reperesenta una lista de pedidos
 * 
 * @author GAUNA GASTON LEONEL - BARRIOS MARCOS
 * @version 14/9/26
 */


public class Pedido
{
    private Calendar fecha;
    private Cliente cliente;
    private ArrayList<Producto> productos;
    
    /**
     * @param p_fecha
     * @param p_cliente 
     * @param p_productos parametro de tipo ArrayList
     */
    
    public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList<Producto> p_productos){
        this.productos = new ArrayList<Producto>();
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(p_productos);
    }
    
    /**
     * @param p_fecha
     * @param p_cliente 
     * @param p_producto parametro de tipo Clase Producto
     */
    public Pedido(Calendar p_fecha, Cliente p_cliente, Producto p_producto){
        this.productos = new ArrayList<Producto>();
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.agregarProducto(p_producto);
    }
    
    //accessors
    
    private void setFecha(Calendar p_fecha){
        this.fecha = p_fecha;
    }
    
    public Calendar getFecha(){
        return this.fecha;
    }
    
    private void setCliente(Cliente p_cliente){
        this.cliente = p_cliente;
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
    
    private void setProductos(ArrayList<Producto> p_productos){
        if(this.productos != null){
            this.productos.addAll(p_productos);
        }
    }
    
    public ArrayList<Producto> getProductos(){
        return this.productos;
    }
    
    /**
     * Total al Contado será el resultado de calcular la suma del
     * precio de contado de cada elemento de la lista.
     * 
     * @return total variable temporal de tipo double 
     */
    public double totalAlContado(){
        double totalContado = 0;
        for (int i = 0; i < this.getProductos().size(); i++){
            totalContado = totalContado + this.getProductos().get(i).precioContado();
        }
        
        return totalContado;
    }
    
    /**
     * El total Financiado por su parte surge de la suma del precio de lista de cada
     * elemento de la colección de productos solicitados.
     * 
     * @param totalFinanciado de tipo double 
     */
    public double totalFinanciado(){
        double totalFinanciado = 0;
        for (int i = 0; i < this.getProductos().size(); i++){
            totalFinanciado = totalFinanciado + this.getProductos().get(i).precioLista();
        }
        
        return totalFinanciado;
    }
    
    public boolean agregarProducto(Producto p_producto){
        return this.getProductos().add(p_producto);
    }
    
    public boolean quitarProducto(Producto p_producto){
        return this.getProductos().remove(p_producto);
        
    }
    
    public void mostrarPedido(){
        System.out.println("****** Detalle del pedido ******Fecha: " + this.getFecha().getInstance(fecha));
        System.out.println("Producto   Precio Lista   Precio Contado");
        System.out.println("-----------------------------------------");
        for(int i = 0; i < this.getProductos().size(); i++){
            System.out.println(this.getProductos().get(i).getDesc() + this.getProductos().get(i).precioLista() + this.getProductos().get(i).precioContado());
        }
        System.out.println("-----------------------------------------");
        System.out.println("*** Total ---" + this.totalFinanciado() + "   " + this.totalAlContado() + "\n\n");
        
    }
}