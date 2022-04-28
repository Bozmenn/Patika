package Java101;
import java.util.Scanner;

public class SayilariBuyuktenKucugeSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi1, sayi2, sayi3;

        System.out.println("1. sayiyi giriniz :");
        sayi1 = input.nextInt();

        System.out.println("2. sayiyi giriniz :");
        sayi2 = input.nextInt();

        System.out.println("3. sayiyi giriniz :");
        sayi3 = input.nextInt();

        if (sayi1 > sayi2 && sayi1 > sayi3){
            if (sayi2 > sayi3){
                System.out.println("sayi 1 > sayi 2 > sayi 3");
            }else{
                System.out.println("sayi 1 > sayi 3 > sayi 2");
            }
        }else if (sayi2 > sayi1 && sayi2 > sayi3){
            if (sayi1 > sayi3){
                System.out.println("sayi 2 > sayi 1 > sayi 3");
            }else{
                System.out.println("sayi 2 > sayi 3 > sayi 1");
            }
        }else if (sayi3 > sayi1 && sayi3 > sayi2){
            if (sayi2 > sayi1){
                System.out.println("sayi 3 > sayi 2 > sayi 1");
            }else{
                System.out.println("sayi 3 > sayi 1 > sayi 2");
            }
        }
    }
}
