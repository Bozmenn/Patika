package Java101;
import java.util.*;

public class TekSayilarinToplami {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int toplam=0,a=0;

        do {
            System.out.println("Bir sayi giriniz: ");
            a= input.nextInt();

            if (a%2==0 && a%4==0){
                toplam+=a;
            }
        }while (a%2==0);

        System.out.println("Cift ve 4'un kati olan sayilarin toplami \n Toplam: "+toplam);
    }
}
