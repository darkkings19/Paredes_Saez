import java.text.DecimalFormat;
import java.util.Scanner;
public class Sismos {
    public static void main(String[] args) {
        Menu();
    }
    public static void Menu(){
        double[][] matriz = llenarMatriz(crearMatriz(nDias()));
    Scanner menu = new Scanner(System.in);
    boolean salir = false;
    int opcion;

    while (!salir){
        System.out.println("1. Sismo mas alto");
        System.out.println("2. Sismos mayores o iguales a 5.5");
        System.out.println("3. ¿Hay alerta de escalado sismico?");
        System.out.println("4. ¿Hay alerta de enjambre sismico?");
        System.out.println("5. Salir del Sistemas");
        System.out.println("/");
        System.out.println("Elija una de las opciones");
        opcion = menu.nextInt();
    switch (opcion){
        case 1:
            mostrarMayor(matriz);
            System.out.println();
            break;
        case 2:
            System.out.println();
            mayoresAcinco(matriz);
            break;
        case 3:
            escSismica(matriz);
            break;
        case 4:
            System.out.println("dou");
            break;
        case 5:
            salir = true;
            break;
        default:
            System.out.println("solo numeros enteros entre 1 y 5");
    }
    }
    }
        public static double[][] crearMatriz(int n){
            System.out.println("Ingresa el numero de Dias");
            double matriz [][]= new double[n][24];
            //
            return matriz;
        }

    public static void mostrarMayor(double matriz[][]) {
        double[] mayorPosicion=new double[3];
        double sismo=matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > sismo) {
                    sismo=matriz[i][j];
                    mayorPosicion[0] = sismo;
                    mayorPosicion[1] = i+1;
                    mayorPosicion[2] = j+1;
                }
            }
        }
        System.out.println("El sismo mayor fue de "+mayorPosicion[0]+" El dia "+mayorPosicion[1]+" en la hora "+mayorPosicion[2]);
    }
    public static void mayoresAcinco(double matriz[][]){
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > 5.4) {
                    contador++;

                }
            }
            
        }
        System.out.println("los sismos mayores e iguales a 5.5: "+contador);
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
