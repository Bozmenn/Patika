package Java101;
import java.util.*;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mesafe, yas, yolculukTipi,toplamTutar;

        System.out.println("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextInt();
        if (mesafe <= 0){
            System.out.println("Hatali veri girdiniz !");
            System.exit(0);
        }
        
        
        System.out.println("Yasinizi giriniz : ");
        yas = input.nextInt();
        if (yas <= 0){
            System.out.println("Hatali veri girdiniz !");
            System.exit(0);
        }

        System.out.println("1 - Tek Yon \n2 - Gidis-Donus \nYolculuk tipini seciniz : ");
        yolculukTipi = input.nextInt();
        if (yolculukTipi != 1 && yolculukTipi != 2){
            System.out.println("Hatali veri girdiniz !");
            System.exit(0);
        }

        if (yas< 12){
            if (yolculukTipi == 1){
                toplamTutar = mesafe*0.10*0.50;
                System.out.println(toplamTutar);
            }else{
                toplamTutar = mesafe*0.10*0.50*0.80*2;
                System.out.println(toplamTutar); 
            }
        }

        else if (12 <= yas && yas < 24){
            if (yolculukTipi == 1){
                toplamTutar = mesafe*0.10*0.90;
                System.out.println(toplamTutar);
            }else{
                toplamTutar = mesafe*0.10*0.90*0.80*2;
                System.out.println(toplamTutar); 
            }
        }

        else if (yas > 65){
            if (yolculukTipi == 1){
                toplamTutar = mesafe*0.10*0.70;
                System.out.println(toplamTutar);
            }else{
                toplamTutar = mesafe*0.10*0.70*0.80*2;
                System.out.println(toplamTutar); 
            }
        }

        else {
            if (yolculukTipi == 1){
                toplamTutar = mesafe*0.10;
                System.out.println(toplamTutar);
            }else{
                toplamTutar = mesafe*0.10*0.80*2;
                System.out.println(toplamTutar); 
            }
        }
    }
}
