
/**
 * Clase localalidad recrea
 * 
 * @author GAUNA GASTON LEONEL - BARRIOS MARCOS 
 * @version (a version number or a date)
 */
public class Localidad {
    
    private String nombre;
    private String provincia;

    
    /**
     * metodo constructor
     * 
     * @param p_nombre
     * @param p_provincia
     */
    public Localidad(String p_nombre, String p_provincia) {
        this.setNombre(p_nombre);
        this.setProvincia(p_provincia);
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setProvincia(String p_provincia) {
        this.provincia = p_provincia;
    }

    public String getProvincia() {
        return this.provincia;
    }
    
    /**
     * El método mostrar() de Localidad retorna la siguiente cadena
     * (los valores en negrita dependen del estado interno del objeto):
     */
    public String mostrar(){
        return "Localidad: " + this.getNombre() + "   Provincia: " + this.getProvincia();
    }
}