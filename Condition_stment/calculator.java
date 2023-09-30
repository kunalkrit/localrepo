import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner input =  new Scanner (System.in);
        System.out.println("Enter Your First No");
        int first = input.nextInt();
        System.out.println("Enter Your Second No");
        int second = input.nextInt();

        System.out.println("Enter your operation + , - , / , * , % ");
        char operation = input.next().charAt(0);

        switch(operation){

            case '+' : System.out.println((first + second ));
            break;

            case '-' : System.out.println((first - second ));
            break;

            case '/' : System.out.println((first / second ));
            break;

            case '*' : System.out.println((first * second ));
            break ; 

            case '%' : System.out.println((first % second ));
            break;

            default : System.out.println(" Something went WrongEnter right operator");
        }
        
        input.close(); // this is for the error you display resoorce leaked

        

    }
}
