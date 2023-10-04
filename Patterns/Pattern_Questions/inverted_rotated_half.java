package Patterns.Pattern_Questions;

public class inverted_rotated_half {
    public static void main(String[] args) {
        
        int num=4;

        for (int line =1; line<=num; line++){

            for(int star_line=1; star_line<=line; star_line++){
                
                int rem =num-line;

                for(int space=1; space<=rem; space++){
                    System.out.print("   ");
                }

                for (int star =1; star<=line; star++){
                    System.out.print(" * ");
                }
                break;
            }
            System.out.println();
        }
    }
}
