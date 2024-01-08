/*
Luis Angel Castillo Cerda 1856931
Lenguajes de Programación - LMV - V5
Ing. Ismael Gutierrez Pimentel
*/
import java.util.Scanner;

public class Tarea_20 {
    public static void main(String[] args){
        Scanner lec = new Scanner(System.in);

        int i, j, n, m, b;
        int[][] A;

        System.out.print("Ingrese el numero de filas: ");
        n = lec.nextInt();
        System.out.print("Ingrese el numero de columnas: ");
        m = lec.nextInt();
        A = new int[n][m];

        for( i = 0; i < n; i++){
            for( j = 0; j < m; j++){
                System.out.print("Ingrese un numero [" + i + "][" + j + "]: ");
                A[i][j] = lec.nextInt();
            }
        }

        System.out.print("Ingrese el vector a buscar: ");
        b = lec.nextInt();
        int cont=0;
        for(i = 0; i < n; i++){
            for (j = 0; j < m; j++) {
                if (b == A[i][j]) {
                    cont++;
                }
            }
        }
        System.out.println("\nEl numero [" + b + "] se encontro: " + cont + " veces en la matriz.\n");

        for( i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print("["+ A[i][j] + "] ");
            }
            System.out.print("\n");
        }
    }
}