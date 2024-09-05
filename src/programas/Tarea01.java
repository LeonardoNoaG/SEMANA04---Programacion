package programas;
import java.util.Scanner;
public class Tarea01 {
    public static void main(String[] args){
        //VARIABLES
        int num;
        String letra="";
        Scanner lectura = new Scanner(System.in);
        //ENTRADA DE DATOS
        System.out.print("Ingrese un numero del 1 - 5 : ");
        num = lectura.nextInt();
        //PROCESO DE DATOS
        switch (num) {
            case 1:letra = "UNO";break;
            case 2:letra = "DOS";break;
            case 3:letra = "TRES";break;
            case 4:letra = "CUATRO";break;
            case 5:letra = "CINCO";break;
        }
        System.out.println("El numero en letras es: " + letra);
    }
}
