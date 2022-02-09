//Name: Nicolas Salazar
//PantherID: 002-585-883
//Due date:January 14
//==========================
import java.util.*;
public class PersonalizedHelloWorld {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        System.out.print("What is your Name? "); 
        String Name = Input.nextLine();
        while (Name==""){
            System.out.print("Please enter your name: "); 
            Name = Input.nextLine();
        }
        System.out.println("Hello, " + Name +"!");

    }
}
