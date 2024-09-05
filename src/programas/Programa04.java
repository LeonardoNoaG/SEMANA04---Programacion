package programas;
import java.util.Scanner;
public class Programa04 {
    public static void main(String[] args){
        //VARIABLES
        int numero;
        String estacion="";
        Scanner lectura = new Scanner(System.in);
        //ENTRADA DE DATOS
        System.out.print("Ingresa un muero del 1 al 12: ");
        numero = lectura.nextInt();
        //PROCESO DE DATOS
        switch (numero) {
            case 1:
            case 2:
            case 3:
                    estacion = "VERANO";
            break;
            case 4:
            case 5:
            case 6:
                    estacion = "OTOÑO";
            break;
            case 7:
            case 8:
            case 9:
                    estacion = "INVIERNO";
            break;
            case 10: 
            case 11:
            case 12:
                    estacion = "PRIMAVERA";
            break;
        }
        System.out.println("El mes " + numero + " corresponde a la estacion " + estacion);
    }
}
