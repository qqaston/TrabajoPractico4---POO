
/**
 * Clase ejecutable para probar las funcionalidades de la clase Curso y Alumno.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Carrera {

    public static void main(String[] args) {
        
        // 5.1.1. Crear una instancia de Curso y varias de la clase Alumno
        Curso cursoPOO = new Curso("Programación Orientada a Objetos");
        
        Alumno alu1 = new Alumno(32555, "Pedro", "Gomez");
        Alumno alu2 = new Alumno(23564, "Maria", "Vasquez");
        Alumno alu3 = new Alumno(30123, "Juan", "Perez");
        Alumno alu4 = new Alumno(32655, "Marcela", "Martinez");
        
        // 5.1.2. Asignarles notas de parciales a los alumnos
        alu1.setNota1(5.0); alu1.setNota2(5.0); 
        alu2.setNota1(5.0); alu2.setNota2(6.0); // Promedio 5.5
        alu3.setNota1(7.0); alu3.setNota2(9.0); // Promedio 8.0
        alu4.setNota1(8.0); alu4.setNota2(8.0); 
        
        // 5.1.3. Inscribir los alumnos al curso creado anteriormente.
        cursoPOO.inscribirAlumno(alu1);
        cursoPOO.inscribirAlumno(alu2);
        cursoPOO.inscribirAlumno(alu3);
        cursoPOO.inscribirAlumno(alu4);
        
        // 5.1.4. Imprimir la cantidad y la lista de alumnos inscriptos al curso
        System.out.println("****-- Cantidad de inscriptos: " + cursoPOO.cantidadDeAlumnos());
        cursoPOO.mostrarInscriptos();
        
        // 5.1.5. Dar de baja un alumno del curso, y luego verificar que no esté inscripto
        System.out.println("****-- Se da de baja a Pedro porque abandona el curso --****");
        cursoPOO.quitarAlumno(32555);
        System.out.println("Está Pedro Gomez inscripto ?? --> " + cursoPOO.estaInscripto(32555));
        
        // 5.1.6. Imprimir nuevamente la lista de alumnos y la cantidad total
        System.out.println("****-- Alumnos inscriptos actualmente: " + cursoPOO.cantidadDeAlumnos());
        cursoPOO.mostrarInscriptos();
        
        // 5.1.7. Buscar un alumno por su libreta y mostrarlo
        System.out.println("****-- Busca y muestra el alumno con numero de libreta 30123 --****");
        Alumno alumnoBuscado = cursoPOO.buscarAlumno(30123);
        if (alumnoBuscado != null) {
            alumnoBuscado.mostrar();
        }
        
        // 5.1.8. Mostrar el promedio del alumno solicitado, según libreta
        System.out.println("****-- Mostrar promedio del alumno 23564 --****");
        cursoPOO.imprimirPromedioDelAlumno(23564);
    }
}