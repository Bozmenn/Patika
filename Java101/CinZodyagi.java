package Java101;
import java.util.*;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ay,kalan;

        System.out.println("Dogdugunuz yili giriniz : ");
        ay = input.nextInt();
        kalan= ay % 12;

        switch(kalan){
            case 0:
            System.out.println("Cin zodyagi burcunuz : MAYMUN");
            break;

            case 1:
            System.out.println("Cin zodyagi burcunuz : HOROZ");
            break;

            case 2:
            System.out.println("Cin zodyagi burcunuz : KOPEK");
            break;

            case 3:
            System.out.println("Cin zodyagi burcunuz : DOMUZ");
            break;

            case 4:
            System.out.println("Cin zodyagi burcunuz : FARE");
            break;

            case 5:
            System.out.println("Cin zodyagi burcunuz : OKUZ");
            break;

            case 6:
            System.out.println("Cin zodyagi burcunuz : KAPLAN");
            break;

            case 7:
            System.out.println("Cin zodyagi burcunuz : TAVSAN");
            break;

            case 8:
            System.out.println("Cin zodyagi burcunuz : EJDERHA");
            break;

            case 9:
            System.out.println("Cin zodyagi burcunuz : YILAN");
            break;

            case 10:
            System.out.println("Cin zodyagi burcunuz : AT");
            break;

            case 11:
            System.out.println("Cin zodyagi burcunuz : KOYUN");
            break;

        }

    }
}
