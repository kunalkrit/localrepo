package Question_Module7;

import java.util.*;

public class fever {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your temperature");
        double temp = input.nextDouble();

        String fever = (temp >= 100) ? " You have a fever" : " You don't have a fever" ;
        System.out.println(fever);

        input.close();
    }
}
