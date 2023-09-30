package Question_Module7;

import java.util.*;

public class Positive_negatiove {
    public static void main(String[] args) {
        Scanner sc /*input */ = new Scanner (System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();

     //   String check = num>=0? "Positive" : "Negative";
     //   System.out.println(check);

        if (num>=0){
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }

        sc.close();
    } 
}
