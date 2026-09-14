import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;
/**
 * Para demostrar que la solución fue planteada de manera correcta, simular un pedido de productos para un determinado
 * cliente. Listar los totales, quitar un producto del pedido, volver a listar los totales y emitir el detalle del pedido.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TomaPedido
{
    public static void main(String[] args){
        //se instancia un laboratorio para la clase producto 
        Laboratorio lab1 = new Laboratorio("Colgate S.A", "Junin 5204", "54-11-4239-8447");
        
        Producto prod1 = new Producto(1982, "Perfumeria", "Jabon Deluxe", 5.25, lab1);
        Producto prod2 = new Producto(1342, "Perfumeria", "Shampoo Panttene", 10.50, lab1);
        Producto prod3 = new Producto(1112, "Farmacia", "Paracetamol", 20.00, lab1);
        
        //se instancia el cliente para el pedido
        Cliente cliente1 = new Cliente(35827482,"Juan","Perez",10000);
        
        Pedido pedido1 = new Pedido(new GregorianCalendar(), cliente1, prod1);

        pedido1.mostrarPedido();
        
        ArrayList<Producto> productos = new ArrayList<Producto>();
        
        productos.add(prod2);
        productos.add(prod2);
        productos.add(prod3);
        
        pedido1.agregarProducto(prod2);
        
        pedido1.mostrarPedido();
    }
}