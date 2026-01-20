import java.util.Scanner;

public class Alumno {

    // Atributos
    private String nombre;
    private double[] calificaciones; // almacena 5 calificaciones

    // Constructor
    public Alumno(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // Método 1: Calcular promedio
    public double calcularPromedio(double[] calificaciones) {
        double suma = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }

        return suma / calificaciones.length;
    }

    // Método 2: Obtener calificación final (letra)
    public char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    // Método 3: Imprimir resultados
    public void imprimirResultados(String nombre, double promedio, char calificacion) {
        System.out.println("\nNombre del estudiante: " + nombre);
        System.out.println("Calificación 1: " + calificaciones[0]);
        System.out.println("Calificación 2: " + calificaciones[1]);
        System.out.println("Calificación 3: " + calificaciones[2]);
        System.out.println("Calificación 4: " + calificaciones[3]);
        System.out.println("Calificación 5: " + calificaciones[4]);
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }

    // MAIN
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pedir nombre
        System.out.print("Ingresa el nombre del estudiante: ");
        String nombre = sc.nextLine();

        // Pedir calificaciones
        double[] calificaciones = new double[5];

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Ingresa la calificación " + (i + 1) + ": ");
            calificaciones[i] = sc.nextDouble();
        }

        // Crear objeto
        Alumno alumno = new Alumno(nombre, calificaciones);

        // Calcular promedio y letra
        double promedio = alumno.calcularPromedio(calificaciones);
        char calificacionFinal = alumno.obtenerCalificacionFinal(promedio);

        // Imprimir resultados
        alumno.imprimirResultados(nombre, promedio, calificacionFinal);

        sc.close();
    }
}
