package Java101;
import java.util.*;

public class MinMaxBulma {
    public static void main(String[] args) {
        int girilen_sayi_adet, sayi, i, max = 0, min = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Kac tane sayi gireceksiniz : ");
        girilen_sayi_adet = input.nextInt();

        for (i = 1; i <= girilen_sayi_adet; i++) {
            System.out.println(i + ". sayiyi giriniz : ");
            sayi = input.nextInt();

            if (i==1){
                max=sayi;
                min=sayi;
            }else{
                if (sayi>max){
                    max=sayi;
                } 
                else if (sayi<min) {
                    min=sayi;
                }
            }
        }
        System.out.println("En buyuk sayi:"+max);
        System.out.println("En kucuk sayi:"+min);
    }   
}



