import java.util.ArrayList;

/**
 * Clase ejecutable para probar las funcionalidades de la clase Banco.
 * Simula la creación de la entidad, la contratación y despido de empleados,
 * y la emisión de la nómina de sueldos a pagar.
 */
public class AplicacionBanco {

    public static void main(String[] args) {
        
        // 1. Instanciamos la Localidad requerida para el Banco
        Localidad locCorrientes = new Localidad("Corrientes", "Corrientes");
        
        // 2. Instanciamos los empleados (asumiendo el constructor de TP3: cuil, apellido, nombre, sueldoBasico, anioIngreso)
        Empleado emp1 = new Empleado(27267504235L, "Perez", "Lorena", 121200.0, 2020);
        Empleado emp2 = new Empleado(20159462638L, "Dominguez", "Pedro", 265000.4, 2018);
        Empleado emp3 = new Empleado(23456789123L, "Gomez", "Martin", 150000.0, 2021);
        
        // 3. Creamos el Banco cumpliendo la restricción de tener al menos 1 empleado (1..*)
        // Utilizamos el constructor que recibe un único empleado inicial
        Banco bancoRio = new Banco("RIO", locCorrientes, 3, emp1);
        
        System.out.println("--- ESTADO INICIAL: Banco creado con 1 empleado ---");
        bancoRio.mostrar();
        
        // 4. El banco contrata nuevos empleados (Agregamos a la colección)
        System.out.println("\n>> Contratando nuevos empleados (Dominguez y Gomez)...");
        bancoRio.agregarEmpleado(emp2);
        bancoRio.agregarEmpleado(emp3);
        
        System.out.println("\n--- ESTADO LUEGO DE CONTRATACIONES ---");
        bancoRio.mostrar(); // Debería listar a Perez, Dominguez y Gomez con sus totales
        
        // 5. El banco despide a un empleado (Quitamos de la colección)
        System.out.println("\n>> Despidiendo al empleado Gomez...");
        bancoRio.quitarEmpleado(emp3);
        
        // 6. Volvemos a listar para verificar el estado final exigido en el TP
        System.out.println("\n--- ESTADO FINAL: Nómina a liquidar ---");
        bancoRio.mostrar();
    }
}