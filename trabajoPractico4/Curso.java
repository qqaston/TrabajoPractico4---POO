
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
    
    /**
     * Metodo para buscar un alumno en el HashMap mediante la libreta universitaria
     * @param p_lu int con el numero de libreta universitaria
     * @return alumnoEncontrado un objeto de clase alumno 
     */
    public Alumno buscarAlumno(int p_lu){
        Alumno alumnoEncontrado = (Alumno) this.getAlumnos().get(p_lu);
        return alumnoEncontrado;
    }
    
    /**
     * Metodo para saber si esta inscripto un alumno mediante la libreta universitaria
     * @param p_lu int con el numero de libreta universitaria
     * @return un boolean que inidica si el alumno esta inscripto 
     */
    public boolean estaInscripto(int p_lu){
        return this.getAlumnos().containsKey(p_lu);
    }
    
    /**
     * Metodo para saber si esta inscripto un alumno mediante el ingreso de un alumno
     * @param p_alumno de clase Alumno
     * @return un boolean que inidica si el alumno esta inscripto 
     */
    public boolean estaInscripto(Alumno p_alumno){
        return this.getAlumnos().containsValue(p_alumno);
    }
    
    /*
     * ****-- Mostrar promedio del alumno 23564 --****
     * Promedio: 5.5
     */
    /**
     * Este metodo imprime por pantalla el promedio de un alumno 
     */
    public void imprimirPromedioDelAlumno(int p_lu){
        System.out.println("****-- Mostrar promedio del alumno" + this.buscarAlumno(p_lu).getLu() + "--****");
        System.out.println("Promedio: " + this.buscarAlumno(p_lu).promedio());
    }
    
    public void mostrarInscriptos(){
        System.out.println("****--Cantidad de Inscriptos: " + this.cantidadDeAlumnos());
        for(Object objAct: this.getAlumnos().values()){
            Alumno alumnoAux = (Alumno) objAct;
            System.out.println(alumnoAux.getLu() + "  " + alumnoAux.nomYApe());
        }
    }
}