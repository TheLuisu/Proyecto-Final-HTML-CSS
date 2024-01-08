/*
Luis Angel Castillo Cerda 1856931
Lenguajes de Programación - LMV - V5
Ing. Ismael Gutierrez Pimentel
*/
import java.util.Scanner;

public class Tarea_21 {
    public static void main(String args[]) {
        Scanner lec= new Scanner(System.in);

        int i, j, n, m, x, y;
        int [][] A; int [][] B; int [][] C;

        System.out.println("Ingrese la cantidad de filas de la Matriz A: ");
        n = lec.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la Matriz A: ");
        m = lec.nextInt();

        System.out.println("\nIngrese la cantidad de filas de la Matriz B: ");
        x = lec.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la Matriz B: ");
        y = lec.nextInt();

        if(n==x && m==y) {//tienen que ser del mismo orden

            A = new int [n][m];
            B = new int [x][y];
            C = new int [x][y];

            System.out.println("\nIngrese los datos de la matriz A");

            for(i=0;i<n;i++){
                for(j=0;j<m;j++){
                    System.out.print("A["+(i+1)+"]["+(j+1)+"]= ");
                    A[i][j]=lec.nextInt();
                }
            }

            System.out.println();
            System.out.println("\nIngrese los datos de la matriz B");

            for(i=0;i<x;i++){
                for(j=0;j<y;j++){
                    System.out.print("B["+(i+1)+"]["+(j+1)+"]= ");
                    B[i][j]=lec.nextInt();
                }
            }

            for(i=0;i<x;i++){
                for(j=0;j<y;j++){
                    C[i][j]=B[i][j]+A[i][j];
                }
            }

            System.out.println("\nLa suma de la Matriz A por la B es:");
            System.out.print("\nC["+(n)+"]["+(y)+"] \n\n");

            for(i=0;i<n;i++){
                for(j=0;j<y;j++){
                    System.out.print("["+ C[i][j] + "] ");
                }
                System.out.println();
            }
        }
        else System.out.println("Las matrices tienen que ser del mismo orden");
    }
}
