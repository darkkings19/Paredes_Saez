import java.text.DecimalFormat;
import java.util.Scanner;

public class Sismos {
    public static void main(String[] args) {

    }

    public static int nDias() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el numero de Dias");
        int dias;
        do {
            try {
                dias = entrada.nextInt();
                break;
            } catch (Exception e) {
                mostrarError();
                entrada.nextLine();
            }
        } while (true);
        return dias;
    }

    public static void mostrarError() {
        System.err.println("Opción inválida");
        System.err.println("Ingrese un número válido");
    }


    public static double[][] llenarMatriz(double[][] matriz) {
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                double num = (Math.random() * 9 + 0.5);
                matriz[x][y] = Math.round(num * 10) / 10d;
            }
        }
        return matriz;
    }

    public static void mostrarMatriz(double[][] matriz) {
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print("[" + matriz[x][y] + "]");
            }
            System.out.println("");
        }
    }

    public static void escSismica(double[][] matriz) {
        int dia = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j < matriz[i].length - 4) {
                    if (matriz[i][j] > 6.0 && matriz[i][j + 1] > 6.0 && matriz[i][j + 2] > 6.0 && matriz[i][j + 3] > 6.0) {
                        dia = i + 1;
                    }
                }
            }
        }
        if (dia == 0) {
            System.out.println("No hubo escalada sismica");
        } else {
            System.out.println("ESCALADA SISMICA EL DIA " + dia);
        }
    }
}
