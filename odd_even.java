import java.util.*;

public class odd_even {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();
        
        if (num%2==0){
            System.out.println(num +" is Even");
        }
        else {
            System.out.println(num + " is Odd");
        }
    }
}
