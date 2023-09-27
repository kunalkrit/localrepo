import java.util.*;

public class pass_fail {
    public static void main(String[] args) {
      Scanner input =  new Scanner (System.in);
      System.out.println("Enter your marks in Maths");
      int maths = input.nextInt();  
      System.out.println("Enter your marks in English");
      int eng = input.nextInt();    
      System.out.println("Enter your marks in Science");  
      int science = input.nextInt();  
      System.out.println("Enter your marks in Hindi");  
      int hindi = input.nextInt();  
      System.out.println("Enter your marks in Computer");
      int comp = input.nextInt();  
      
      int total = (maths + eng + science + hindi + comp);
      int percen = total / 5;
      String pass = (percen>=33)? "Pass" : "Fail";

      System.out.println("Total marks " + total);
      System.out.println("Percentage  " + percen + "%");
      System.out.println(pass);

    }
}
