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

        // se instancian 3 empleados con los datos de cuil, apellido, nombre, sueldoBasico, anioIngreso
        Empleado emp1 = new Empleado(27267504235L, "Perez", "Lorena", 121200.0, 2020);
        Empleado emp2 = new Empleado(20159462638L, "Dominguez", "Pedro", 265000.4, 2018);
        Empleado emp3 = new Empleado(23456789123L, "Gomez", "Martin", 150000.0, 2021);

        // se crea un banco con unico empleado y listamos
        Banco bancoRio = new Banco("RIO", locCorrientes, 3, emp1);

        System.out.println("--- ESTADO INICIAL: Banco creado con 1 empleado ---");
        bancoRio.mostrar();

        // se agregan mas empleados al banco y listamos
        System.out.println("\n>> Contratando nuevos empleados (Dominguez y Gomez)...");
        bancoRio.agregarEmpleado(emp2);
        bancoRio.agregarEmpleado(emp3);

        System.out.println("\n--- ESTADO LUEGO DE CONTRATACIONES ---");
        bancoRio.mostrar();

        // se quita un empleado 
        System.out.println("\n>> Despidiendo al empleado Gomez...");
        bancoRio.quitarEmpleado(emp3);

        // volvemos a listar
        System.out.println("\n--- ESTADO FINAL: Nómina a liquidar ---");
        bancoRio.mostrar();

        
        // -------------------------------------------------------------------------
        // PRUEBAS DE LA CLASE CUENTABANCARIA Y METODOS DEL PUNTO 4
        System.out.println("\n\n--- INICIANDO PRUEBAS DE CUENTAS BANCARIAS ---");

        // 1. Instanciamos a los titulares (ajusta los parametros del constructor Persona si es necesario)
        Persona titular1 = new Persona(20111222, "Gomez", "Marisa Esther", 1975);
        Persona titular2 = new Persona(20333444, "Villalba", "Martín", 1980);
        Persona titular3 = new Persona(20555666, "Zalazar", "Ernesto", 1968);

        // 2. Instanciamos las Cuentas Bancarias
        // Cuentas con saldo cero para probar listarCuentasConSaldoCero()
        CuentaBancaria cuenta1 = new CuentaBancaria(14526387, titular1, 0.0); 
        CuentaBancaria cuenta3 = new CuentaBancaria(23145698, titular2, 0.0);

        // Cuentas con saldo positivo para probar cuentasSaldoActivo()
        // Se le asigna una segunda cuenta a titular1 para probar que el HashSet no la duplique
        CuentaBancaria cuenta2 = new CuentaBancaria(99999999, titular1, 15000.0); 
        CuentaBancaria cuenta4 = new CuentaBancaria(11112222, titular3, 55000.50);

        // 3. Agregamos las cuentas a la coleccion del Banco
        System.out.println(">> Registrando nuevas cuentas bancarias en el sistema...");
        bancoRio.agregarCuentaBancaria(cuenta1);
        bancoRio.agregarCuentaBancaria(cuenta2);
        bancoRio.agregarCuentaBancaria(cuenta3);
        bancoRio.agregarCuentaBancaria(cuenta4);

        // 4. Emitimos el resumen general
        System.out.println("\n>> Generando Resumen de Cuentas...");
        bancoRio.mostrarResumen();
    }
}