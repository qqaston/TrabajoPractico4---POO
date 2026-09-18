import java.util.ArrayList;

/**
 * Clase ejecutable para probar las funcionalidades de la clase Banco
 * 
 * @author GAUNA GASTON LEONEL - BARRIOS MARCOS
 * @version 16/9/26
 */
public class AplicacionBanco {

    public static void main(String[] args) {
        
        // se instancia la Localidad requerida para el Banco
        Localidad locCorrientes = new Localidad("Corrientes", "Corrientes");
        
        // se instancia 3 empleados con los datos de cuil, apellido, nombre, sueldoBasico, anioIngreso
        Empleado emp1 = new Empleado(27267504235L, "Perez", "Lorena", 121200.0, 2020);
        Empleado emp2 = new Empleado(20159462638L, "Dominguez", "Pedro", 265000.4, 2018);
        Empleado emp3 = new Empleado(23456789123L, "Gomez", "Martin", 150000.0, 2021);
        
        
        //se crea un banco con unico empleado y listamos
        Banco bancoRio = new Banco("RIO", locCorrientes, 3, emp1);
        
        System.out.println("--- ESTADO INICIAL: Banco creado con 1 empleado ---");
        bancoRio.mostrar();
        
        //se agregan mas empleados al banco y listamos
        System.out.println("\n>> Contratando nuevos empleados (Dominguez y Gomez)...");
        bancoRio.agregarEmpleado(emp2);
        bancoRio.agregarEmpleado(emp3);
        
        System.out.println("\n--- ESTADO LUEGO DE CONTRATACIONES ---");
        bancoRio.mostrar();
        
        //se quita un empleado 
        System.out.println("\n>> Despidiendo al empleado Gomez...");
        bancoRio.quitarEmpleado(emp3);
        
        //volvemos a listar
        System.out.println("\n--- ESTADO FINAL: Nómina a liquidar ---");
        bancoRio.mostrar();
    }
}