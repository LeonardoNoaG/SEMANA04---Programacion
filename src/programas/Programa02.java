package programas;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args){
       //DECLARACION DE VARIABLES
       int numero;
       String diasem = "";
       Scanner lectura = new Scanner(System.in);
       //ENTRADA DE DATOS
       System.out.print("Ingresar un numero del {1 al 7} :=:");
       numero = lectura.nextInt();
       //PROCESO DE DATOS
        switch (numero) {
            case 1:
                diasem = "LUNES";
            break;
            case 2:
                diasem = "MARTES";
            break;
            case 3:
                diasem = "MIERCOLES";
            break;
            case 4:
                diasem = "JUEVES";
            break;
            case 5:
                diasem = "VIERNES";
            break;
            case 6:
                diasem = "SABADO";
            break;
            case 7:
                diasem = "DOMINGO";
            break;
        }
        //SALIDA DE DATOS
        System.out.println("EL DIA DE LA SEMANA ES: " + diasem);
    }
}
