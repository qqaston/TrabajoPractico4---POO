
import java.util.HashMap;
/**
 * Write a description of class Curso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Curso
{
    private String nombre;
    private HashMap alumnos;
    
    /**
     * metodo construcor
     */
    public Curso(String p_nombre){
        this.alumnos = new HashMap();//inicializa hashmap
        this.setNombre(p_nombre);
    }
    
    /**
     * metodo constructor
     */
    public Curso(String p_nombre, HashMap p_alumnos){
        this.alumnos = new HashMap();//inicializa hashmap
        this.setNombre(p_nombre);
        this.setAlumnos(p_alumnos);
    }
    
    //accessors
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    private void setAlumnos(HashMap p_alumnos){
        this.alumnos = p_alumnos;
    }
    
    public HashMap getAlumnos(){
        return this.alumnos; 
    }
    
    //metodos
    public void inscribirAlumno(Alumno p_alumno){
        this.getAlumnos().put(p_alumno.getLu(),p_alumno);
    }
    
    public Alumno quitarAlumno(int p_lu){
        return (Alumno)this.getAlumnos().remove(p_lu);
    }
    
    /**
     * @return un int con la cantidad de alumnos en el hashmap
     */
    public int cantidadDeAlumnos(){
        return this.getAlumnos().size();
    }
    

}