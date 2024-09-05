package programas;
import java.util.Scanner;
public class Programa01 {
    public static void main (String[] args){
        //DECLARACION VARIABLES
        int n1, n2, r, opc;
        r = 0;
        Scanner lectura = new Scanner(System.in);
        //ENTRADA DE DATOS
        System.out.print("INGRESAR PRIMER NUMERO:");
        n1 = lectura.nextInt();
        System.out.print("INGRESAR SEGUNDO NUMERO:");
        n2 = lectura.nextInt();
        System.out.print("INGRESAR OPERACION A REALIZAR [1(+) 2(-) 3(*) 4(/)]");
        opc = lectura.nextInt();
        //PROCESO DE DATOS
        switch (opc) {
            case 1:
                r=n1+n2;
            break;
            case 2:
                r=n1-n2;
            break;
            case 3:
                r=n1*n2;
            break;
            case 4:
                r=n1/n2;
            break;
        }
        //SALIDA DE DATOS
        System.out.println("RESULTADO");
        System.out.println("El resultado de la operacion es:" + r);
    }
}
