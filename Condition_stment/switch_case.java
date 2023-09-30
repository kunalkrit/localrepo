import  java.util.*;

public class switch_case{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter no bw 1 to 5");
        int num = input.nextInt();

        switch (num){

            case 1 : System.out.println("Kunal");
            break;

            case 2 : System.out.println("Ayush");
            break;

            case 3 : System.out.println("Aditya");
            break;

            case 4 : System.out.println("Abhiraj");
            break ;

            case 5 : System.out.println("Ansh");
            break ; 

            default : System.out.println("Dhabush");

        }

        input.close();
    }
}