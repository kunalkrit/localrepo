package Patterns.Pattern_Questions;

public class floyd_triangle {
    public static void main(String[] args) {
        
        int num =5;
        int printValue =1;

        for(int line=1; line<=num; line++){

            for(int digit=1; digit<=line; digit++){
                System.out.print(printValue + " ");
                printValue++;
            }
            System.out.println();
        }
    }
}
