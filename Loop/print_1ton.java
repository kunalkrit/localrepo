package Loop;

import java.util.*;

public class print_1ton {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter no. how much you need to print");
        int last = input.nextInt();
    
        int start = 1 ;

        while (start <=last){
            System.out.println(start);
            start++;
        }
        
        input.close();
    }
}
