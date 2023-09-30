package Loop.Question_module8;

import java.util.*;

public class table_n {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter No : ");
        int num = input.nextInt();
        int i = 1;

        while (i<=10){
            System.out.println(num + " * " + i +" = " + (num*i) );
            i++;
        }

       input.close();

    }
}
