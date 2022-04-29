package Java101;
import java.util.*;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int n,k,total=1;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Taban sayiyi giriniz :");
        n=input.nextInt();
        
        System.out.println("Us olacak sayiyi giriniz :");
        k= input.nextInt();

        for(int i=1;i<=k;i++){
           total=total*n;
        }

        System.out.println("sonuc:"+total);
    }
}


