import java.util.*;

public class Larger_two_no{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter first no : ");
        int firstNo = input.nextInt();
        System.out.print("Enter second no : ");
         int secondNo = input.nextInt();

         if (firstNo>=secondNo){
            System.out.println("The greatest no. is : "+ firstNo);
         }
         else{
            System.out.println("The greatest no. is : "+ secondNo);
         }

         input.close();
    }
}