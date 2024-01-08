/*
Luis Angel Castillo Cerda 1856931
Lenguajes de Programación - LMV - V5
Ing. Ismael Gutierrez Pimentel
*/
import java.util.Scanner;

public class Tarea_19 {
    public static void main(String[] args){
        Scanner lec = new Scanner(System.in);

        int i, n, b;
        int[] A;

        System.out.print("Ingrese el total de numeros: ");
        n = lec.nextInt();
        A = new int[n];

        for(i = 0; i < n; i++){
            System.out.print("A[" + (i+1) + "] = ");
            A[i] = lec.nextInt();
        }

        System.out.print("Ingrese el vector a buscar: ");
        b = lec.nextInt();
        int cont=0;
        for(i = 0; i < n; i++){
            if( b == A[i] ){
                cont++;
            }
        }
        System.out.println("\nEl numero [" + b + "] se encontro: " + cont + " veces.\n");

        System.out.print("A = ");
        for(i = 0; i < n; i++){
            System.out.print("[" + A[i] + "] ");
        }
    }
}
