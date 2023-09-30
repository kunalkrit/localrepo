package Loop;

import java.util.*;

public class prime_num {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print( "Enter Your no : ");
        int n = input.nextInt();

        if(n==2){
            System.out.println(n + " is prime num");

        }
        else{
          boolean primeNo = true;

          for (int i = 2 ; i<=n-1 /*also use Math.sqrt(n) // for √n */; i++){
              if(n%i==0) {
                primeNo = false;

              }
          }
          if (primeNo==true){
              System.out.println(n + " is prime num");
          }
          else {
              System.out.println(n + " is not prime num");
          }

        }

        input.close();
    }
}
