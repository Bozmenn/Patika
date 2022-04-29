package Java101;
import java.util.*;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n,r,total1=1,total2=1,total3=1,combinasyon;
        
        System.out.println("C(n,r) hesabi için n degeri giriniz:");
        n=input. nextInt();

        System.out.println("C(n,r) hesabi için r degeri giriniz:");
        r=input. nextInt();


        for(int i=1 ; i<=n; i++){
            total1=total1*i;
        }

        for (int k=1; k<=r;k++){
            total2=total2*k;
        }
        for(int m=1; m<=(n-r);m++){
            total3=total3*m;
        }

        combinasyon=(total1)/ (total2 * total3);
        System.out.println("Combinasyon sonucu:"+combinasyon);
    }
}





