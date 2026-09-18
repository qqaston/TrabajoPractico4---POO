/**
 * Modela el concepto de cuenta bancaria, la cual debe permitir realizar depositos y extracciones
 * 
 * @author GAUNA GASTON LEONEL - BARRIOS MARCOS
 * @version 2/9/26
 */
public class CuentaBancaria
{
    private int nroCuenta;
    private double saldo;
    private Persona titular;

    /**
     * Constructor for objects of class CuentaBancaria
     * 
     * @param p_nroCuenta
     * @param p_titular
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
    }
    
    /**
     * Constructor for objects of class CuentaBancaria
     * 
     * @param p_nroCuenta
     * @param p_titular
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }
    
    //accossers
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    public Persona getTitular(){
        return this.titular;
    }
    
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    /**
     * El método
     * depositar(p_importe) incrementa el saldo actual con la cantidad pasada como parámetro.
     * 
     * @return el saldo actual sumado lo depositado
     */
    public double depositar(double p_saldo){
        this.setSaldo(this.getSaldo() + p_saldo);
        return this.getSaldo();
    }
    
    /**
     * El método
     * extraer(p_importe) disminuye el saldo actual. Ambos métodos devuelven el saldo resultante tras la operación.
     * @param p_saldo
     * @return el saldo actual restando el saldo extraido
     */
    
    public double extraer(double p_saldo){
        this.setSaldo(this.getSaldo() - p_saldo);
        return this.getSaldo();
    }
    
    
    /**
     * imprime por pantalla los datos y el saldo del titular
     */
    
    public void mostrar(){
        System.out.println("- CUENTA BANCARIA -");
        System.out.println("Titular: " + this.getTitular().nomYApe() + "(" + this.getTitular().edad() + ")");
        System.out.println("Saldo: " + this.getSaldo());
    }
    
    /**
     * @return a string, composed of the concatenation of the data (número, titular, saldo), tabulated.
     */
    
    public String toString(){
        return this.getNroCuenta() + "   " + this.getTitular().nomYApe() + "      " + this.getSaldo();
    }
}