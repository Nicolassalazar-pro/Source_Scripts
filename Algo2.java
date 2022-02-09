//Name: Nicolas Salazar
//PantherID: 002-585-883
//Due date:January 26
//==========================
import java.util.*;
    public class Algo2 {
        public static void main(String[] args){
            int pre = 1;
            int post = 1;
            
            a1[0] = n[0];
            
            for (int i = 0; i < n.length-1; i++) {
             pre *= n[i];
             if (i == n.length - 1)
               a1[i] = pre;
             else
               a1[i + 1] = pre;
            }
            
            for (int f = n.length-1; f > 0; f--) {
              post *= n[f];
              if (f == 0)
                a1[f] *= post;
              else
                a1[f - 1] *= post;
            }
            System.out.println(Arrays.toString(a1)); 
        }
}