import java.util.*;

public class income_tax {
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      System.out.println("Enter your income");
      double income = input.nextInt();
      int five_lakh = 500000;
      int ten_lakh = 1000000;
      
      if (income<five_lakh){
        System.out.println(" Your income tax is 0 % , Rs"+ (income *0)) ;
      }
      else if (income>=five_lakh && income<=ten_lakh){
        System.out.println(" Your Income tax is 20 % , Rs"+ ((int) income *0.20f));
      }
      else {
        System.out.println("your Income tax is 30 % , Rs" + ((int)income *0.30f));
      }

      input.close();
    }
}
