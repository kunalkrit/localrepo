package Patterns.Pattern_Questions;

public class inverted_half_pyramid {
    public static void main(String[] args) {
        
        int num=5;

        for(int line =1; line<=num; line++){

            for(int digit=1; digit<=num-line+1; digit++){
                System.out.print(digit + " ");
            }
            System.out.println();
        }
    }
}
