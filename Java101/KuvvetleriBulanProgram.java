package Java101;
import java.util.*;

public class KuvvetleriBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int exponentOfNumber;
        
        System.out.print("Sayi giriniz : ");
        exponentOfNumber = input.nextInt();

        for (int i=1; i<=exponentOfNumber; i*=4){

            System.out.println(i);

            }
        System.out.println("---------------------");
        
        for (int j=1; j<=exponentOfNumber; j*=5){
            System.out.println(+j);
        }
    }
}



