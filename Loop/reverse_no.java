package Loop;

public class reverse_no {
    public static void main(String[] args) {
        // 10345
       int n = 10899 ;
       int last_no  ;

       while ( n>0){
        last_no = n%10;
        System.out.print(last_no);
        n = n/10;  // n/=10 

       }
    }
}
