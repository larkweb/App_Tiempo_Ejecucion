package app_tiempo_ejecucion;

import java.util.Scanner;

public class App_Tiempo_Ejecucion {

    public static void main(String[] args) {
        // Registrar el tiempo inicial
        long tiempoInicial = System.nanoTime();

        // Lógica para sumar datos ingresados por el usuario
        Scanner scanner = new Scanner(System.in);
        int bandera = 1;
        double suma = 0.0;

        while (bandera == 1) {
            System.out.print("Introduzca un dato: ");
            double dato = scanner.nextDouble();
            suma += dato;

            System.out.print("¿Desea continuar ingresando datos (S/N)? ");
            char c = scanner.next().charAt(0);

            if (c == 'N' || c == 'n') {
                bandera = 0;
            }
        }

        System.out.println("La suma es: " + suma);
        scanner.close();

        // Registrar el tiempo final
        long tiempoFinal = System.nanoTime();

        // Calcular el tiempo de ejecución
        long tiempoEjecucion = tiempoFinal - tiempoInicial;

        // Mostrar el tiempo de ejecución en nanosegundos
        System.out.println("Tiempo de ejecución en nanosegundos: " + tiempoEjecucion);

        // Convertir a milisegundos si es necesario
        double tiempoEjecucionMs = tiempoEjecucion / 1_000_000.0;
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempoEjecucionMs);
    }
}
