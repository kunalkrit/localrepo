package Patterns.Pattern_Questions;

public class zero_one_triangle {
    public static void main(String[] args) {
        
        int num=5;
        int printValue = 0;

        for(int line=1; line<=num; line++){
            
            // it is responsible for change printValue for different line.
            if(line%2==0){
                printValue=0;
            }
            else{
                printValue=1;
            }

            for(int digit=1; digit<=line; digit++){

                System.out.print(printValue + " ");

                // it is risponsible for change printValue in same line but for next raw
                if(printValue==0){
                    printValue=1;
                }
                else{
                    printValue=0;
                }
            }
            System.out.println();
        }        
    }
}
