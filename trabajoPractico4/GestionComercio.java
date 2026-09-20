/**
 * Clase ejecutable para probar las funcionalidades de la clase Comercio
 * 
 * @author GAUNA GASTON LEONEL - BARRIOS MARCOS
 * @version 19/9/26
 */
public class GestionComercio {
    public static void main(String[] args) {
        //instanciacion del comercio especificado en el formato de salida
        Comercio comercio = new Comercio("Avanti SRL");

        //instanciacion de los empleados utilizando los datos del ejemplo de nomina AFIP
        Empleado emp1 = new Empleado(30100623L, "Gonzalez", "Juan", 102750.00, 2020);
        Empleado emp2 = new Empleado(37045987L, "Martinez", "Mercedes", 100719.00, 2021);
        Empleado emp3 = new Empleado(32550096L, "Gomez", "Virginia", 150120.00, 2018);

        //damos de alta a los empleados
        comercio.altaEmpleado(emp1);
        comercio.altaEmpleado(emp2);
        comercio.altaEmpleado(emp3);

        //imprimimos la nomina 
        System.out.println("--- Emision de Nomina AFIP ---");
        comercio.nomina();

        //verificamos metodos de consulta
        System.out.println("\n---  Verificacion de metodos de consulta ---");
        
        System.out.println("Cantidad de empleados registrados: " + comercio.cantidadDeEmpleados() + "\n");
        
        
        long cuilPrueba = 37045987L; //cuil de prueba
        System.out.println(cuilPrueba + " pertenece a un empleado de la empresa?: " + comercio.esEmpleado(cuilPrueba));
        
        Empleado encontrado = comercio.buscarEmpleado(cuilPrueba);
        
        if (encontrado != null) {
            System.out.println("Empleado encontrado: " + encontrado.apeYNom()); 
        }

        System.out.println("\nVisualizando sueldo neto por pantalla:");
        comercio.sueldoNeto(cuilPrueba);

        //prueba de baja
        System.out.println("\n\n--- Prueba de baja de empleado ---");
        Empleado dadoDeBaja = comercio.bajaEmpleado(cuilPrueba);
        if (dadoDeBaja != null) {
            System.out.println("Se proceso la baja de: " + dadoDeBaja.apeYNom());
        }
        System.out.println("Cantidad de empleados tras la baja: " + comercio.cantidadDeEmpleados());
    }
}