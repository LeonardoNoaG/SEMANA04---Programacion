package programas;
import java.util.Scanner;
public class Tarea02 {
    public static void main(String[] args){
        //VARIABLES
        int num;
        String ROMANOS="";
        Scanner lectura = new Scanner(System.in);
        //ENTRADA DE DATOS
        System.out.print("Ingrese un numero del 1 - 5 : ");
        num = lectura.nextInt();
        //PROCESO DE DATOS
        switch (num) {
            case 1:ROMANOS = "I";break;
            case 2:ROMANOS = "II";break;
            case 3:ROMANOS = "III";break;
            case 4:ROMANOS = "IV";break;
            case 5:ROMANOS = "V";break;
        }
        System.out.println("El numero en romanos es: " + ROMANOS);
    }
}
