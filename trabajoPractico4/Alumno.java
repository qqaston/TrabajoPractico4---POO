
/**
 * Esta clase representa a un alumno con su nombre apellido y datos escolares importantes para la institucion
 * 
 * @author GAUNA GASTON LEONEL - BARRIOS MARCOS
 * @version 23/8/26
 * 
 */
public class Alumno
{
    //atributos
    private int lu;
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;
    
    
    /**
     * @param p_lu (Parametro de 'Libreta Universitaria')
     * @param p_nombre
     * @param p_apellido
     */
    public Alumno(int p_lu, String p_nombre, String p_apellido){
        this.setLu(p_lu);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
    }
    
    
    //accossers
    private void setLu(int p_lu){
        this.lu = p_lu;
    }
    
    public int getLu(){
        return this.lu;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public void setNota1(double p_nota){
        this.nota1 = p_nota;
    }
    
    public double getNota1(){
        return this.nota1;
    }
    
    public void setNota2(double p_nota){
        this.nota2 = p_nota;
    }
    
    public double getNota2(){
        return this.nota2;
    }
    
    /**
     * @return un double con la nota promedio del alumno
     */
    public double promedio(){
        return (this.getNota1() + this.getNota2()) / 2;
    }
    
    /**
     * @return un boolean donde true indica que el alumno aprobo y caso contrario devuelve un false
     */
    private boolean aprueba(){
        if(this.promedio() > 7.0 && this.getNota1() > 6.0 && this.getNota2() > 6.0 ) {
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Utiliza el motodo aprueba() para calcular si es aprobado o desaprobado
     * @return un String de APROBADO o DESAPROBADO
     */
    private String leyendaAprueba(){
        if (this.aprueba() == true )return "APROBADO";else return "DESAPROBADO";
    }
    
    /**
     * @return un String con el nombre y apellido del alumno
     */
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }
    
    /**
     * @return un String con el apellido y nombre del alumno
     */
    public String apeYNom(){
        return this.getApellido() + " " + this.getNombre();
    }

    /**
     * Este motodo imprime los datos del alumno por pantalla 
     */
    public void mostrar(){
        System.out.println(this.nomYApe());
        System.out.println("LU: " + this.getLu() + "  " + "Notas: " + this.getNota1() + "-" + this.getNota2());
        System.out.println("Promedio: " + this.promedio() + "-" + this.leyendaAprueba());
    }
}