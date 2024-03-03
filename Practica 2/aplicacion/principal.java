package aplicacion;

import mates.Matematicas;

public class principal {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso incorrecto. Debe proporcionar el número de pasos como argumento.");
            return;
        }

        long pasos = Long.parseLong(args[0]);
        System.out.println("El número PI es " + Matematicas.generarNumeroPiRecursivo(pasos));
    }
}
