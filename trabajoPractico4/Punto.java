/**
 * Clase que modela un punto geométrico en el plano cartesiano.
 * 
 * @author GAUNA GASTON LEONEL - BARRIOS MARCOS
 * @version 23/08/26
 */
public class Punto {
    
    //atributos
    private double x;
    private double y;
    
    /**
     * metodo constructor por defecto
     */
    public Punto() {
        this.setX(0.0);
        this.setY(0.0);
    }

    /**
     * metodo construcotr
     * 
     * @param p_x
     * @param p_y
     */
    public Punto(double p_x, double p_y) {
        this.setX(p_x);
        this.setY(p_y);
    }
    
    //accosers
    private void setX(double p_x) {
        this.x = p_x;
    }
    
    public double getX() {
        return this.x;
    }
    
    private void setY(double p_y) {
        this.y = p_y;
    }
    
    public double getY() {
        return this.y;
    }
    
    /**
     * Este metodo aplica desplazamiento del punto
     * @param p_dx
     * @param p_dy
     */
    public void desplazar(double p_dx, double p_dy) {
        this.setX(this.getX() + p_dx);
        this.setY(this.getY() + p_dy);
    }
    
    public double distanciaA(Punto p_ptoDistante){
        double x1 = this.getX();
        double y1 = this.getY();
        
        double x2 = p_ptoDistante.getX();
        double y2 = p_ptoDistante.getY();
        
        double pitagoras = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 -y1),2));
        return pitagoras;
    }    
    
    /**
     * @return las coordenadas del punto
     */
    public String coordenadas() {
        return "(" + this.getX() + ", " + this.getY() + ")";
    }
    
    /**
     * imprime en pantalla el valor de X y el valor Y del punto
     */
    public void mostrar() {
        System.out.println("Punto. X: " + this.getX() + ", Y: " + this.getY());
    }
}