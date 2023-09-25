import java.util.*;

public class if_else {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();



        if (age >= 18){
            System.out.println("Adult");

        }
        else {
            System.out.println("Not Adult");
        }
    }
}
