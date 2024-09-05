package programas;
import java.util.Scanner;
public class Programa03 {
    public static void main(String[] args){
        //VARIABLES
        int num;
        String mes= "";
        Scanner lectura = new Scanner(System.in);
        //ENTRADA DE DATOS
        System.out.print("Ingresar un numero del {1 al 12} :=:");
        num = lectura.nextInt();
       //PROCESO DE DATOS
       switch (num) {
            case 1:mes = "Enero";break;
            case 2:mes = "Febrero";break;
            case 3:mes = "Marzo";break;
            case 4:mes = "Abril";break;
            case 5:mes = "Mayo";break;
            case 6:mes = "Junio";break;
            case 7:mes = "Julio";break;
            case 8:mes = "Agisto";break;
            case 9:mes = "Setiembre";break;
            case 10:mes = "Octubre";break;
            case 11:mes = "Noviembre";break;
            case 12:mes = "Diciembre";break;
        }
       System.out.println("El mes elegido es: " + mes);
    }
}
