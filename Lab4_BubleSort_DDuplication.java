//Name: Nicolas Salazar
//PantherID: 002-585-883
//Due date:Febuary 6
//==========================
import java.util.*;
public class Lab4_BubleSort_DDuplication {
    public static void main(String[] args){
        //this is a userinput section
        Scanner input = new Scanner(System.in);
        System.out.println("Please Type in Array Length.");
        int Input = input.nextInt();
        int[] Given = new int[Input];
        for (int i = 0; i < Given.length; i++) {
            try{
                System.out.println("Please Type in Index["+(i+1)+"].");
                Given[i]=input.nextInt();
            }catch(InputMismatchException e){
                break;
            }
        }
        //this is the bubble sort to first organize the array
        int temp;
        //run for the array length
        for (Integer this_vairable_will_not_be_used : Given){
            //run for the array length
            for (int i = 0; i < Given.length; i++) {
                //creates a variable that is the index next to the one seacrching
                int T=i+1;
                //this prevents out of bounds error
                if (T<Given.length){
                    //swaps the 2 objects in the array if the first one is greater than the next
                    if (Given[i]>Given[T]){
                        temp=Given[i];
                        Given[i]=Given[T];
                        Given[T]=temp;
                    }
                }
            }
        }
        //this turn duplicates into zeros 
        temp=0;
        for (int i = 0; i < Given.length; i++) {
            //turns int into 0 if it is the object is the same a the refrence variable
            if (temp==Given[i]){
                Given[i]=0;
            //stops fom goin out of bounds
            }else if (i==Given.length-1){
                continue;
            //resets refrence once a new number is detected.
            }else if (temp!=Given[i]){
                temp=Given[i];
            }
        }
        // runs bubble sort again
        temp=0;
        for (Integer this_vairable_will_not_be_used : Given){
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
        //prints out results
        System.out.println("");
        System.out.println("Output:");
        System.out.println(Arrays.toString(Given));
        /*
        Test case: 
        Input:
        9 50 11 33 21 40 50 40 40 21
        Output:
        [0, 0, 0, 0, 11, 21, 33, 40, 50]
        Input:
        1 l
        Output:
        [0]
        
        */
    }
}