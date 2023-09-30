import java.util.*;

public class larger_three {
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      System.out.println("Enter First No");
      int a = input.nextInt();
      System.out.println("Enter Second No");
      int b = input.nextInt();
      System.out.println("Enter Third No");
      int c = input.nextInt();

    /* if (a>b){
        if (a>c){
            System.out.println(a);
        }
        else {
            System.out.println(c);
        }
      }
      else {
        if (b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
      }   */ 

      if (a>=b && a>=c){
        System.out.println(a);
      }
      else if (b>=c){
        System.out.println(b);
      }
      else {
        System.out.print(c);
      }

      input.close();

    }
}
