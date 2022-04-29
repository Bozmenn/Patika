package Java101;
import java.util.*;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double toplam=1,a=0;
        
        System.out.println("Harmonik serisini bulacagimiz sayiyi giriniz: ");
        a= input.nextInt();

        for (double i=2;i<=a;i++){
            toplam=toplam+(1.00/i);
        }
        System.out.println(toplam);
    }    
}



