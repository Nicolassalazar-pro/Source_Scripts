//Name: Nicolas Salazar
//PantherID: 002-585-883
//Due date:January 14
//==========================
import java.util.*;
public class GuessMyNumber {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        Scanner hlc = new Scanner(System.in);
        int L;
        double H;
        int Temp;
        System.out.print("Enter n: ");
        H= Input.nextDouble();
        while (H<=0){
            System.out.print("Enter a positive integer for n: ");
            H= Input.nextDouble(); 
        }
        L=(int)H;
        System.out.println("Welcome to Guess My Number");
        System.out.println("Please think of a number between 0 and "+(L-1)+".");
        H=H/2;
        L=(int)Math.ceil(H);//16
        Temp=(int)H*2;//32
        System.out.println("Is this your number? "+L);
        String Ans="";
        while (!(Ans.contains("C")||Ans.contains("c"))){
            System.out.println("Please enter C for correct, H for too high, or L for too low.");
            System.out.print("Enter your response (H/L/C): ");
            Ans= hlc.nextLine();
            if (Ans.contains("H")||Ans.contains("h")){
                H=L;
                L=((Temp-L)/2)-L;
                Temp=(int)H;
                L=Math.abs(L);
                System.out.println("Is this your number? "+ L);
            }else if (Ans.contains("L")||Ans.contains("l")){
                H=Temp;
                L=((Temp-L)/2)+L;
                Temp=(int)H;
                L=Math.abs(L);
                System.out.println("Is this your number? "+ L);
            }else if (Ans.contains("C")||Ans.contains("c")){
                System.out.println("Thank you for playing Guess My Number!");
                }
        }
    }
}
