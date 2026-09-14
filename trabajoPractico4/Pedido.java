import java.util.Calendar;
import java.util.ArrayList;
/**
 * Write a description of class Pedido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        this.setProducto(p_producto);
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
    
    private void setProducto(Producto p_productos){
        this.productos.add(p_productos);
    }
    
    public Producto getProducto(){
        return this.productos.getLast();
        
    }
    
    private void setProductos(ArrayList<Producto> p_productos){
        if(this.productos != null){
            this.productos.addAll(p_productos);
        }
    }
    
    public ArrayList<Producto> getProductos(){
        return this.productos;
    }
    
    
}