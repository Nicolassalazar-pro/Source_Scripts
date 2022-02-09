//Name: Nicolas Salazar
//PantherID: 002-585-883
//Due date:January 28
//==========================
import java.util.*;
public class Matrix1 {
    public static void main(String[] args){
        int m, n, i, j;
        Scanner sc=new Scanner (System. in);
        System.out.print("Enter the number of rows: ");
        m = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        n = sc.nextInt ();
        int Input[][] = new int [m][n];
        int Output[][] = new int [m][n];
        int Counter=m-1;
        System.out.println("Enter the elements of the array: ");

        for (i = 0; i < m; i++){
            System.out.println("Row "+(i+1)+": ");
            for (j = 0; j <n; j++){
                Input[i][j] = sc.nextInt();
                Output[j][Counter] = Input[i][j];
            }
            Counter--;
        }

        for (i = 0; i < m; i++){
            for (j = 0; j < n; j++){
                System.out.print(Input[i] [j] + " ");
            }
            System.out.println();
        }

        for (j = 0; j <n; j++){
            System.out.print("===");
        }
        System.out.println("");
        
        for (i = 0; i < m; i++){
            for (j = 0; j < n; j++){
                System.out.print(Output[i] [j] + " ");
            }
            System.out.println();
        }
    }
}