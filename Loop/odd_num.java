package Loop;

import java.util.*;

public class odd_num {
    public static void main(String[] args) {
        // this is make using continue 
        Scanner input = new Scanner (System.in);
        System.out.print("Enter no : ");
        int n = input.nextInt();

        for (int i = 1; i<=n; i++ ){
            if (i%2==0){
                continue;
            }
            System.out.print(i + " ");

        }

        input.close();

    }
}
