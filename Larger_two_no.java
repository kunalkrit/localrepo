import java.util.*;

public class Larger_two_no {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first no");
        int first = input.nextInt();
        System.out.println("Enter second no");
        int second = input.nextInt();
 
        System.out.print(" The greatest no is "); 

        if (first > second){
            System.out.println(first);

        }
        else {
            System.out.println(second);
        }

    }
}
