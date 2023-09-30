package Loop;

public class reverse_given_n0 {
    public static void main(String[] args) {
        int n=10899;
        int last_digit ;
        int reverse = 0 ;

        while (n>0){

            last_digit = n%10; //  if you want the last digit of any no then get their remainder
            reverse = (reverse * 10) + last_digit ; 
            n = n /10 ;  // if you want to remove the last no of digit then divide the no by 10
        }

        System.out.println(reverse);

    }
}
