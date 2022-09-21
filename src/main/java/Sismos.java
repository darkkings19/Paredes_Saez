import java.util.Scanner;
public class Sismos {
    public static void main(String[] args) {
        Menu();
    }
    public static void Menu(){
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
            System.out.println();
            break;
        case 2:
            System.out.println();
            break;
        case 3:
            System.out.println();
            break;
        case 4:
            System.out.println();
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
            return matriz;
        }
        public static String encontraMayor{
        String mayorPosicion= "0,0";
        double numeroMayor =matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz[x]; j++) {
                if (matriz[x][y]>numeroMayor){
                    numeroMayor = matriz[x][y];
                    mayorPosicion = x + "," + y;
                }
            }
            
        }
        return mayorPosicion;
    }
    public static void mayoresAlgo(){

    }
}
