package Loop;

import java.util.*;

public class sum_of_n_natural {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Your no");
        int n = input.nextInt();
        int start = 1 ;
        int sum = 0;

        while (start<=n){
            
            sum +=start;   // sum = sum + start ;
            start ++;

        }

        System.out.println(sum);

        input.close();
    }
}
