import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;

/**
 * Para demostrar que la solución fue planteada de manera correcta, simular un pedido de productos para un determinado
 * cliente. Listar los totales, quitar un producto del pedido, volver a listar los totales y emitir el detalle del pedido.
 * 
 * @author GAUNA GASTON LEONEL  - BARRIOS MARCOS
 * @version 14/9/26
 */
public class TomaPedido {
    public static void main(String[] args){
        //se instancia el laboratorio y los productos
        Laboratorio lab1 = new Laboratorio("Colgate S.A", "Junin 5204", "54-11-4239-8447");
        
        Producto prod1 = new Producto(1982, "Perfumeria", "Jabon Deluxe", 5.25, lab1);
        Producto prod2 = new Producto(1342, "Perfumeria", "Shampoo Panttene", 10.50, lab1);
        Producto prod3 = new Producto(1112, "Farmacia", "Paracetamol", 20.00, lab1);
        
        //se instancia el cliente
        Cliente cliente1 = new Cliente(35827482, "Juan", "Perez", 10000);
        
        
        //crear pedido
        Pedido pedido1 = new Pedido(new GregorianCalendar(), cliente1, prod1);
        
        //se agregan productos al pedido
        pedido1.agregarProducto(prod2);
        pedido1.agregarProducto(prod2); // dos unidades del producto
        pedido1.agregarProducto(prod3);
        
        //mostrar pedido
        pedido1.mostrarPedido();
        
        //quitamos un producto del pedido
        System.out.println(">> Quitando un producto...\n");
        pedido1.quitarProducto(prod2);
        
        //volver a mostrar el pedido
        pedido1.mostrarPedido();
    }
}