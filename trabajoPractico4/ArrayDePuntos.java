import java.util.*;
/**
 * Clase que crea un array de objetos de Clase Punto
 * 
 * @author GAUNA GASTON LEONEL
 * @version 7/9/26
 */
public class ArrayDePuntos
{
    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);
        Punto puntos[] = new Punto[6];
        
        for (int i = 0; i < puntos.length;i++){
            System.out.println("OBJETO PUNTO NUMERO " + (i+1));
            System.out.println("Ingresa punto X");
            double x = teclado.nextDouble();
            System.out.println("Ingresa punto Y");
            double y = teclado.nextDouble();
            puntos[i] = new Punto(x,y);
        }
        
        for (int i = 0;i < puntos.length-1;i++){
            System.out.println(puntos[i].coordenadas());
            System.out.println(puntos[i+1].coordenadas());
            System.out.println("Distancia: " + puntos[i].distanciaA(puntos[i+1]));

        }
    }
}