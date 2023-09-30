package Question_Module7;

import java.util.*;

public class week_name {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 1 to 7 to choose week days name");
        int week_name = sc.nextInt();

        switch (week_name){

            case 1 : System.out.println("Sunday");
            break;

            case 7 : System.out.println("Saturday");
            break;

            case 2 : System.out.println("Monday");
            break;

            case 3 : System.out.println("Tuesday");
            break;

            case 4 : System.out.println("Wednesday");
            break;

            case 5 : System.out.println("Thursday");
            break;

            case 6 : System.out.println("Friday");
            break;

            default : System.out.println("Your enter Wrong no");

        }

        sc.close();
    }
}
