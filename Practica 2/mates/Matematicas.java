package mates;

import java.util.Random;

public class Matematicas {
    /**
     * Genera una aproximación al número pi mediante el método de Montecarlo de forma recursiva.
     * El parámetro `pasos` indica el número de puntos generados.
     */
    public static double generarNumeroPiRecursivo(long pasos) {
        return generarNumeroPiRecursivo(pasos, pasos, 0);
    }

    private static double generarNumeroPiRecursivo(long pasos, long pasosRestantes, long puntosDentroCirculo) {
        if (pasosRestantes == 0) {
            double aproximacionPi = 4.0 * puntosDentroCirculo / pasos;
            return aproximacionPi;
        } else {
            Random random = new Random();
            double x = random.nextDouble();
            double y = random.nextDouble();
            double distanciaAlOrigen = Math.sqrt(x * x + y * y);
            if (distanciaAlOrigen <= 1) {
                puntosDentroCirculo++;
            }
            return generarNumeroPiRecursivo(pasos, pasosRestantes - 1, puntosDentroCirculo);
        }
    }
}