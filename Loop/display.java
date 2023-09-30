package Loop;

import java.util.*;

public class display {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        while (true){
            System.out.print("Enter no : ");
            int n = input.nextInt();
            input.close(); // this for to remove the display error of resource leak

            if (n%10==0){
                continue;
            }

            System.out.println("Right : "+ n);

        }    
          
    }
}
