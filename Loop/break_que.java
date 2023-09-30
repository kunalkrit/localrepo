package Loop;

import java.util.*;

public class break_que {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        

        do {
            System.out.print("Enter Your no : ");
            int n = input.nextInt();

            if (n%10==0){
                break;
            }

            System.out.println(n);

        }while (true);

        input.close(); // this for to remove the display error for resource leakage

    }
}
