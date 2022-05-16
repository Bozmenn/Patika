package Java101;
import java.util.*;

public class MukemmelSayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, i, toplam = 0;

        System.out.println("Bir sayi giriniz : ");
        sayi = input.nextInt();

        for (i = 1; i < sayi; i++);{
            if (sayi % i == 0){
                toplam += i;
            }
        }
        if ( sayi == 1) {
            System.out.println(sayi + " Mukemmel sayi degildir.");
        }
        else if (toplam == sayi) {
            System.out.println(sayi + " Mukemmel sayidir.");
        }
        else {
            System.out.println(sayi + " Mukemmel sayi degildir.");
        }
    }    
}
