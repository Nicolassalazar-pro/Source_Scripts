//Name: Nicolas Salazar
//PantherID: 002-585-883
//Due date:January 21
//==========================
import java.util.*;
public class sort {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Type in Array Length.");
        int Input = input.nextInt();
        int[] Given = new int[Input];
        for (int i = 0; i < Given.length; i++) {
            System.out.println("Please Type in Index["+i+"].");
            Given[i]=input.nextInt();
        }
        int temp;
        for (Integer w : Given){
            for (int i = 0; i < Given.length; i++) {
                int T=i+1;
                if (T<Given.length){
                    if (Given[i]>Given[T]){
                        temp=Given[i];
                        Given[i]=Given[T];
                        Given[T]=temp;
                    }
                }
            }
        }
        System.out.println("");
        System.out.println("Output:");
        System.out.println(Arrays.toString(Given));
    }
}