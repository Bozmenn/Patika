package Java101;
import java.util.*;
import java.util.*;

public class YildizDeseni {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number For Triangle:  ");
        int invalue = input.nextInt();
        invalue /= 2;
        invalue++;


        for(int i = 0; i<invalue; i++){

            for(int j = invalue; j> (i+1); j--)
                System.out.print(" ");

            for(int k = 0; k< (i*2)+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        int g = 1;
        for(int i = invalue-1; i> 0; i--){

            for(int j = 0; j< g; j++)
                System.out.print(" ");
            g++;

            for(int k=0; k< (i*2)-1; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}


