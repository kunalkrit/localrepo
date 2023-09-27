import java.util.*;

public class ternary {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        System.out.println("Enter your Number");
        int n = input.nextInt();
        String a = (n%2==0)?"Even":"Odd";
        System.out.println(a);
    }
}
