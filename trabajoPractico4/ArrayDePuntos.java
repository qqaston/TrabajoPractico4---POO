import java.util.Scanner;

/**
 * Clase que crea un array de objetos de Clase Punto con menú interactivo
 * 
 * @author GAUNA GASTON LEONEL
 * @version 20/09/26
 */
public class ArrayDePuntos {
    
    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);
        //se crea un array estatico de seis elementos de tipo Punto
        Punto puntos[] = new Punto[6];
        int opcion;
        boolean cargados = false; //bandera para comprobar que este cargado el array
        
        do {
            System.out.println("\n========== MENU ARRAY DE PUNTOS ==========");
            System.out.println("1. Ingresar coordenadas de los 6 puntos");
            System.out.println("2. Mostrar coordenadas de los puntos cargados");
            System.out.println("3. Calcular distancia entre puntos consecutivos");
            System.out.println("0. Salir");
            System.out.println("==========================================");
            System.out.print("Ingrese una opcion: ");
            opcion = teclado.nextInt();
            
            switch(opcion) {
                case 1:
                    /**
                     *  Se agregan como elementos instancias de la clase Punto ingresados por teclado
                     */
                    for (int i = 0; i < puntos.length; i++){
                        System.out.println("\n-- OBJETO PUNTO NUMERO " + (i+1) + " --");
                        System.out.print("Ingresa coordenada X: ");
                        double x = teclado.nextDouble();
                        System.out.print("Ingresa coordenada Y: ");
                        double y = teclado.nextDouble();
                        puntos[i] = new Punto(x,y);
                    }
                    cargados = true;
                    System.out.println("\n¡Los 6 puntos fueron cargados exitosamente!");
                    break;
                    
                case 2:
                    if (cargados) {
                        /**
                         * Se recorre el array y se imprimen las coordenadas de cada elemento
                         */
                        System.out.println("\n--- Coordenadas registradas ---");
                        for (int i = 0; i < puntos.length; i++){
                            System.out.println("Punto " + (i+1) + ": " + puntos[i].coordenadas());
                        }
                    } else {
                        System.out.println("\n[ERROR] Primero debe ingresar los puntos (Opcion 1)");
                    }
                    break;
                    
                case 3:
                    if (cargados) {
                        /**
                         * Se imprime la distancia cada 2 elementos consecutivos del contenedor[cite: 8]
                         */
                        System.out.println("\n--- Distancias entre puntos consecutivos ---");
                        for (int i = 0; i < puntos.length - 1; i++){
                            System.out.println("Distancia Punto " + (i+1) + " a Punto " + (i+2) + ": " + puntos[i].distanciaA(puntos[i+1]));
                        }
                    } else {
                        System.out.println("\n[ERROR] Primero debe ingresar los puntos (Opcion 1)");
                    }
                    break;
                    
                case 0:
                    System.out.println("\nSaliendo del programa. ¡Hasta luego!");
                    break;
                    
                default:
                    System.out.println("\n[ERROR] Opcion no valida. Intente nuevamente con un numero del 0 al 3.");
            }
            
        } while (opcion != 0);
        
        teclado.close();
    }
}