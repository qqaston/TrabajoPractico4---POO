import java.util.ArrayList;
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
    ArrayList<Empleado> empleados;
    
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
            System.out.print(this.getEmpleados().get(i).getCuil() + "   " + this.getEmpleados().get(i).apeYNom());
            System.out.print("_____________________________________");
            System.out.print(this.getEmpleados().get(i).getSueldoBasico());
        }
    }
    
    /**
     * @param el total a pagar de la suma de todos sueldos de los empleados 
     */
    public double sueldosAPagar(){
        double total = 0;
        
        for(int i = 0; i < this.getEmpleados().size(); i++){
            total += this.getEmpleados().get(i).getSueldoBasico();
        }
        
        return total;
    }
    
    public void mostrar(){
        System.out.println("BANCO: " + this.getNombre() + "   " + this.getNroSucursal());
        System.out.println("Localidad: " + this.getLocalidad().getNombre() + "   " + this.getLocalidad().getProvincia());
        this.listarSueldos();
        System.out.println("Total a Pagar________________________________$" + this.sueldosAPagar());
    }
}