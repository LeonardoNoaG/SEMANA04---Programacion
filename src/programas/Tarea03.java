package programas;
import java.util.Scanner;
public class Tarea03 {
    public static void main(String[] args){
        //VARIABLES
        int num;
        String INGLES="";
        Scanner lectura = new Scanner(System.in);
        //ENTRADA DE DATOS
        System.out.print("Ingrese un numero del 1 - 5 : ");
        num = lectura.nextInt();
        //PROCESO DE DATOS
        switch (num) {
            case 1:INGLES = "ONE";break;
            case 2:INGLES = "TWO";break;
            case 3:INGLES = "THREE";break;
            case 4:INGLES = "FOUR";break;
            case 5:INGLES = "FIVE";break;
            case 6:INGLES = "SIX";break;
        }
        System.out.println("El numero en ingles es: " + INGLES);
    }
}
