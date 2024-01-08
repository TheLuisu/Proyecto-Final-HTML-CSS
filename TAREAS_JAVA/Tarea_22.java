/*
Luis Angel Castillo Cerda 1856931
Lenguajes de Programación - LMV - V5
Ing. Ismael Gutierrez Pimentel
*/
import java.util.Scanner;

public class Tarea_22 {
    public static void main(String[] arg){
        Scanner lec= new Scanner(System.in);

        int i, j, n, m, x, y, z;
        int [][] A; int [][] B; int [][] C;

        System.out.println("Ingrese la cantidad de filas de la Matriz A: ");
        n = lec.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la Matriz A: ");
        m = lec.nextInt();

        System.out.println("\nIngrese la cantidad de filas de la Matriz B: ");
        y = lec.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la Matriz B: ");
        z = lec.nextInt();

        if(m == y){

            A = new int [n][m];
            System.out.println("\nIngrese los datos de la matriz A");

            for(i=0;i<n;i++){
                for(j=0;j<m;j++){
                    System.out.print("A["+(i+1)+"]["+(j+1)+"]= ");
                    A[i][j]=lec.nextInt();
                }
            }

            System.out.println();

            B = new int [y][z];
            C = new int [n][z];

            System.out.println("Ingrese los datos de la matriz B");

            for(i=0;i<y;i++){
                for(j=0;j<z;j++){
                    System.out.print("B["+(i+1)+"]["+(j+1)+"]= ");
                    B[i][j]=lec.nextInt();
                }
            }

            System.out.println();
            System.out.println("A["+(n)+"]["+(m)+"]");

            for(i=0;i<n;i++){
                for(j=0;j<m;j++){
                    //System.out.print( A[i][j]+"\t");
                    System.out.print("["+ A[i][j] + "] ");
                }
                System.out.println();
            }

            System.out.println();
            System.out.println("B["+(y)+"]["+(z)+"]");

            for(i=0;i<y;i++){
                for(j=0;j<z;j++){
                    //System.out.print(B[i][j]+"\t");
                    System.out.print("["+ B[i][j] + "] ");
                }
                System.out.println();
            }

            for(i=0;i<n;i++){
                for(j=0;j<z;j++){
                    C[i][j] = 0;
                    for(x=0;x<m;x++){
                        C[i][j] = C[i][j] + ((A[i][x]) * (B[x][j]));
                    }
                }
            }

            System.out.println("\nLa multiplicacion de la Matriz A por la B es:");
            System.out.print("C["+(n)+"]["+(z)+"] \n");

            for(i=0;i<n;i++){
                for(j=0;j<z;j++){
                    System.out.print("["+ C[i][j] + "] ");
                }
                System.out.println();
            }
        }
        else
            System.out.print("El numero de columnas de la matriz A debe ser igual al numero de filas de la matriz B\n");
    }
}
