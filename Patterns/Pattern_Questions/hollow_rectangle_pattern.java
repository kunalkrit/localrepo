package Patterns.Pattern_Questions;

public class hollow_rectangle_pattern {
    public static void main(String[] args) {
        int num = 4;
        int recLast_line =5;

        //outer loop for no. of line print
         for (int line = 1; line<=num; line++){

            //
            for(int star=1; star<=recLast_line; star++){

                if(line==1 ||line==num){
                    System.out.print(" * ");
                 }
                else{
                    if(star==1 || star==recLast_line){
                        System.out.print(" * ");

                    }
                    else{
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();

        }
    }
}
