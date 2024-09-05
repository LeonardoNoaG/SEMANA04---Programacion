package programas;
import java.util.Scanner;
public class Tarea04 {
    public static void main(String[] args) {
        //VARIABLES
        int numero;
        String periodo = "";
        Scanner scanner = new Scanner(System.in);
        // ENTRADA DE DATOS
        System.out.print("Ingrese un número (1, 2, 3, 4, 6, 12): ");
        numero = scanner.nextInt();
        // PROCESO DE DATOS
        switch (numero) {
            case 1:periodo = "mensual";break;
            case 2:periodo = "bimestral";break;
            case 3:periodo = "trimestral";break;
            case 4:periodo = "cuatrimestral";break;
            case 6:periodo = "semestral";break;
            case 12:periodo = "anual";break;
        }
        //SALIDA DE DATOS
        System.out.println("Periodo: " + periodo);
    }
}
