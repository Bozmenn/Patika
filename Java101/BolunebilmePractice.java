package Java101;
import java.util.*;

public class BolunebilmePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,toplam=0,sayac=0;
    
        System.out.println("Bir sayi giriniz : ");
        a = input.nextInt();
    
        for (int i = 1; i <= a; i++) {
    
            if ((i % 4 == 0) && (i % 3 == 0)) {
                toplam+=i;
                sayac++;
            }
            
        }
        System.out.println("Ortalama: "+(toplam=toplam/sayac));
       
    }
}
