/*
Luis Angel Castillo Cerda 1856931
Lenguajes de Programación - LMV - V5
Ing. Ismael Gutierrez Pimentel
*/
import java.util.Scanner;

public class Tarea_18 {
    public static void main(String[] args){
        Scanner lec = new Scanner(System.in);

        double k = 1, n, i;

        System.out.print("Ingresa un numero: ");
        n = lec.nextDouble();

        for(i = 1; i <= n; i++){

            double expo = ((2*i) - 1);
            k = Math.pow(i, expo);

            System.out.print("[" + k + "] ");
        }
    }
}