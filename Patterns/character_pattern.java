package Patterns;

public class character_pattern {
    public static void main(String[] args) {
        int num = 4;
        char ch = 'A';

        //Outer loop
        for (int line=1; line<=num; line++){
            //Inner Loop
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch+" ");
                ch++;
            }

            System.out.println();

        }

    }
}
