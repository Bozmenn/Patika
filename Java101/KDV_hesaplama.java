package Java101;
import java.util.Scanner;

public class KDV_hesaplama {
    public static void main(String[] args) {
        float fiyat, kdvOrani;

        Scanner input = new Scanner(System.in);

        System.out.print("Urunun fiyatini girinizi : ");
        fiyat = input.nextFloat();
        kdvOrani = 0.18f;

        System.out.println("KDV'siz Fiyat : " + fiyat);
        System.out.println("KDV' li fiyat : " + (fiyat+(fiyat*kdvOrani)));
        System.out.println("KDV tutari : " + (fiyat*kdvOrani));
    }
    
}
