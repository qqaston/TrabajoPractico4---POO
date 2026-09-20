import java.util.HashMap;
/**
 * Esta clase hace la abstraccion de un comercio, con funciones para administracion de empleados
 *
 * @author GAUNA GASTON LEONEL - BARRIOS MARCOS
 * @version 19/9/26
 */
public class Comercio {
    //atributos
    private String nombre;
    private HashMap<Long, Empleado> empleados;

    /**
     * Metodo constructor con solo nombre
     * @param p_nombre 
     */
    public Comercio(String p_nombre) {
        this.setNombre(p_nombre);
        this.setEmpleados(new HashMap<Long, Empleado>());
    }

    /**
     * Metodo constructor con nombre y empleados
     * @param p_nombre
     * @param p_empleados
     */
    public Comercio(String p_nombre, HashMap<Long, Empleado> p_empleados) {
        this.setNombre(p_nombre);
        this.setEmpleados(p_empleados);
    }

    //accessors 
    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public HashMap<Long, Empleado> getEmpleados() {
        return this.empleados;
    }

    private void setEmpleados(HashMap<Long, Empleado> p_empleados) {
        this.empleados = p_empleados;
    }
    
    //--------
    
    /**
     * Metodo para dar de alta a un empleado y agregarlo
     * @param p_empleado
     */
    public void altaEmpleado(Empleado p_empleado) {
        this.getEmpleados().put(p_empleado.getCuil(),p_empleado);
    }

    /**
     * Metodo para dar de baja un empleado con el cuil y retorna el objeto eliminado
     * @param p_cuil
     * @return un objeto de clase Empleado
     */
    public Empleado bajaEmpleado(long p_cuil) {
        return this.getEmpleados().remove(p_cuil);
    }

    /**
     * @return un int con la cantidad de empleados del comercio
     */
    public int cantidadDeEmpleados() {
        return this.getEmpleados().size();
    }

    /**
     * Metodo para confirmar si un empleado esta de alta mediante el cuil
     * @param p_cuil 
     * @return boolean 
     */
    public boolean esEmpleado(long p_cuil) {
        return this.getEmpleados().containsKey(p_cuil);
    }

    /**
     * Metodo para buscar un empleado mediante el cuil
     * @param p_cuil
     * @return un objeto de tipo Empleado
     */
    public Empleado buscarEmpleado(long p_cuil) {
        return this.getEmpleados().get(p_cuil);
    }

    /**
     * Este metodo imprime el sueldo neto del empleado mediante el cuil 
     * @param p_cuil
     */
    public void sueldoNeto(long p_cuil) {
        if(this.getEmpleados().containsKey(p_cuil)){
            System.out.print(this.getEmpleados().get(p_cuil).sueldoNeto());
        }
    }

    /**
     * Este metodo se utiliza para imprimir la nomina por pantalla con los detalles de los empleados 
     */
    public void nomina() {
        System.out.println("**** Nomina de empleados de " + this.getNombre() + " ****");
        for(Empleado empleadoAux : this.getEmpleados().values()){
            System.out.print(empleadoAux.getCuil() + "  " + empleadoAux.apeYNom() + "---------- $");
            this.sueldoNeto(empleadoAux.getCuil());
            System.out.println(); //salto de linea
        }
    }
}