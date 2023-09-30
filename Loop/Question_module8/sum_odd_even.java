package Loop.Question_module8;

import java.util.*;

public class sum_odd_even {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int number;
        int choice ;
        int evenNo = 0;
        int oddNo = 0;

        do {
            System.out.print("Enter no : ");
            number = input.nextInt();

            if (number%2==0){
                evenNo += number;  // evenNo = evenNo +  number
            }
            else {
                oddNo += number ; // oddNo = oddNo + number
            }

            System.out.println("Enter '1' if you want continue else '0' ");
            choice =input.nextInt();

        }while(choice ==1);

        System.out.println("Sum of all even no : " + evenNo);
        System.out.println("Sum of all odd no : " + oddNo);

        input.close();

    }
}
