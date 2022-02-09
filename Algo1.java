//Name: Nicolas Salazar
//PantherID: 002-585-883
//Due date:January 26
//==========================
import java.util.*;
    public class Algo1 {
        public static void main(String[] args){
            int[] Input = {1,2,3,4};
            //int[] Output = {24,12,8,6};
            int A1[] =new int[Input.length+1];
            int A2[] =new int[Input.length+1];
            int[] Output = new int[Input.length];

            int temp=1;
            
            for (int x=0 ; x <= Input.length;x++){
                A1[x]=temp;
                if (x==Input.length){
                    continue;
                }else{
                    temp*=Input[x];
                }
        
            }

            temp=1;
            for (int i=Input.length; i >= 0;i--){
                A2[i]=temp;
                if (i==Input.length){
                    continue;
                }else{
                    temp*=Input[i];
                }
            }

            for (int j=0; j < Output.length; j++){
                Output[j]=A1[j]*A2[j];
            }
            
            System.out.println(Arrays.toString(Output));           
    }
}