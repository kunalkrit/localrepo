package Loop;

import java.util.*;

public class while_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Your Name");
        String name = input.nextLine();

        int counter = 0 ;

        while (counter<100){
            System.out.println("Happy Birthday "+ name);
           // counter = counter + 1 ; 
           counter++ ;


        }
        input.close();

    }
}
