//Name: Nicolas Salazar
//PantherID: 002-585-883
//Due date:January 28
//==========================
import java.util.*;
public class Matrix2 {
    public static void main(String[] args){
        int m, n, i, j;
        Scanner sc=new Scanner (System. in);
        System.out.print("Enter the number of rows: ");
        m = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        n = sc.nextInt ();
        int array[][] = new int [m][n];
        System.out.println("Enter the elements of the array: ");
        int Counter=1;
        for (i = m-1; i >= 0; i--){
            System.out.println("Row "+(Counter)+": ");
            for (j = 0; j <n; j++){
                array[j][i] = sc.nextInt();
            }
            Counter++;
        }

        for (j = 0; j <n; j++){
            System.out.print("===");
        }
        System.out.println("");
        
        for (i = 0; i < m; i++){
            for (j = 0; j < n; j++){
                System.out.print(array[i] [j] + " ");
            }
            System.out.println();
        }
    }
}