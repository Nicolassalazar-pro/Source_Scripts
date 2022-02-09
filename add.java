//Name: Nicolas Salazar
//PantherID: 002-585-883
//Due date:January 21
//==========================
import java.util.*;
public class add {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Type in Array Length.");
        int Input = input.nextInt();
        int[] Given = new int[Input];
        for (int i = 0; i < Given.length; i++) {
            System.out.println("Please Type in Index["+i+"].");
            Given[i]=input.nextInt();
        }
        int Output=0;
        int x=0;
        for (int i = Given.length-1; i >= 0; i--) {
            Output+=Math.pow(10, i)*Given[x];
            x++;
        }
        System.out.println("Output:");
        System.out.println(Output+1);

    }
}