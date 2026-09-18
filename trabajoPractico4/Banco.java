import java.util.ArrayList;
import java.util.HashSet;
/**
 * Clase Banco representa un entidad bancaria 
 * 
 * @author GAUNA GASTON LEONEL - BARRIOS MARCOS 
 * @version 15/9/26
 */
public class Banco
{
    private String nombre;
    private Localidad localidad;
    private int nroSucursal;
    private ArrayList<Empleado> empleados;
    private ArrayList<CuentaBancaria> cuentasBancarias;
    
    /**
     * Metodo constructor con un empleado
     * 
     * @param p_nombre
     * @param p_localidad
     * @param p_nroSucursal
     * @param p_empleado
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado){
        this.empleados = new ArrayList<Empleado>();// se inicializa el array vacio
        
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.agregarEmpleado(p_empleado);
    }
    
    /**
     * Metodo constructor con varios empleados
     * 
     * @param p_nombre
     * @param p_localidad
     * @param p_nroSucursal
     * @param p_empleado
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleados){
        this.empleados = new ArrayList<Empleado>(); //se inicializa el array vacio 
        
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
    }
    
    /**
     * Metodo constructor con varios empleados y varias cuentas bancarias
     * 
     * @param p_nombre
     * @param p_localidad
     * @param p_nroSucursal
     * @param p_empleado
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleados,ArrayList<CuentaBancaria> p_cuentas){
        this.empleados = new ArrayList<Empleado>(); //se inicializa el array de empleados vacio 
        this.cuentasBancarias = new ArrayList<CuentaBancaria>(); // se iniciliza el array de cuentas vacio
        
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    private void setLocalidad(Localidad p_localidad){
        this.localidad = p_localidad;
    }
    
    public Localidad getLocalidad(){
        return this.localidad;
    }
    
    private void setNroSucursal(int p_nroSucursal){
        this.nroSucursal = p_nroSucursal;
    }
    
    public int getNroSucursal(){
        return this.nroSucursal;
    }
    
    private void setEmpleados(ArrayList<Empleado> p_empleados){
        if(this.empleados != null){
            this.empleados.addAll(p_empleados);
        }
    }
    
    public ArrayList<Empleado> getEmpleados(){
        return this.empleados;
    }
    
    private void setCuentas(ArrayList<CuentaBancaria> p_cuentas){
        this.cuentasBancarias.addAll(p_cuentas);
    }
    
    public ArrayList<CuentaBancaria> getCuentas(){
        return this.cuentasBancarias;
    }
    
    /**
     * @return un boleano y agrega un empleado a la lista
     */
    public boolean agregarEmpleado(Empleado p_empleado){
        return this.getEmpleados().add(p_empleado);
    }
    
    /**
     * @return un boleano y quita el empleado de la lista
     */
    public boolean quitarEmpleado(Empleado p_empleado){
        return this.getEmpleados().remove(p_empleado);
    }
    
    /**
     * Este metodo lista todos los empleados mostrarndo su CUIL y su sueldo
     */
    public void listarSueldos(){
        for(int i = 0;i < this.getEmpleados().size(); i++){
            Empleado empleadoAux = this.getEmpleados().get(i); //empleado auxiliar 
            System.out.print("\n" + empleadoAux.getCuil() + "   " + empleadoAux.apeYNom() + "__________" + empleadoAux.sueldoNeto() + "\n");
        }
    }
    
    /**
     * @return el total a pagar de la suma de todos sueldos de los empleados 
     */
    public double sueldosAPagar(){
        double total = 0;
        
        for(int i = 0; i < this.getEmpleados().size(); i++){
            total += this.getEmpleados().get(i).sueldoNeto();
        }
        
        return total;
    }
    
    /**
     * Metodo que imprime los detalles para el total a pagar del banco
     */
    public void mostrar(){
        System.out.println("BANCO: " + this.getNombre() + "   " + this.getNroSucursal());
        System.out.println("Localidad: " + this.getLocalidad().getNombre() + "   " + this.getLocalidad().getProvincia());
        this.listarSueldos();
        System.out.println("Total a Pagar__________$" + this.sueldosAPagar());
    }
    
    /**
     * @return un boleano y agrega una cuenta bancaria
     */
    public boolean agregarCuentaBancaria(CuentaBancaria p_cuenta){
        return this.getCuentas().add(p_cuenta);
    }
    
    /**
     * @return un boleano y quita una cuenta bancaria 
     */
    public boolean quitarCuentaBancaria(CuentaBancaria p_cuenta){
        return this.getCuentas().remove(p_cuenta);
    }
    /*
     * El banco cuenta un listado de todos los titulares de cuentas (tener presente que, si una persona tiene más de una cuenta,
     * solo debe aparecer una vez en el listado). También puede listar las cuentas cuyo saldo sea cero. Además, debe conocer
     * cuántas cuentas están activas (una cuenta activa es aquella cuyo saldo sea mayor a 0).
     */
    
    public void listarCuentasConSaldoCero(){
        System.out.println("Cuentas sin Saldo:");
        System.out.println("---CUENTA-------------APELLIDO Y NOMBRE------");
        for(CuentaBancaria cuentaAct : this.getCuentas()){
    
            if(cuentaAct.getSaldo() <= 0){
                System.out.println(cuentaAct.getNroCuenta() + "__________" + cuentaAct.getTitular().apeYNom());
            }
        }
        System.out.println("_____________________________________________");
        System.out.print("Listado de Clientes: ");
        for(CuentaBancaria cuentaAct: this.getCuentas()){
            if(cuentaAct.getSaldo() <= 0){
                System.out.print("; " + cuentaAct.getTitular().apeYNom());
            }
        }
        System.out.println("_____________________________________________");
    }
    
    /*
     * El banco cuenta un listado de todos los titulares de cuentas (tener presente que, si una persona tiene más de una cuenta,
     * solo debe aparecer una vez en el listado)
     */
    
    public HashSet<Persona> listaDeTitulares(){
        HashSet<Persona> titulares = new HashSet<Persona>();
        for(int i = 0; i < this.getCuentas().size(); i++){
            CuentaBancaria cuentaAux = this.getCuentas().get(i);
            if(){
                titulares.add(cuentaAux.getTitular());
            }
        }
        return titulares;
    }
    
    /**
     * @param retorna un int con la cantidad de cuentas activas (saldo mayor a 0)
     */
    private int cuentasSaldoActivo(){
        int contador = 0;
        
        for(CuentaBancaria cuentaAct: this.getCuentas()){
            if(cuentaAct.getSaldo() > 0){
                contador++;
            }
        }
        
        return contador;
    }
}