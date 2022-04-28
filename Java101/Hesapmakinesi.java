package Java101;
import java.util.*;

public class Hesapmakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sayi1, sayi2;
        int islem;

        System.out.println("1. sayiyi giriniz : ");
        sayi1=input.nextDouble();

        System.out.println("2. sayiyi giriniz : ");
        sayi2=input.nextDouble();

        System.out.println("1- Toplama \n2- cikarma \n3-carpma \n4-bolme");
        System.out.println("Yapmak istediginiz islemi seciniz : ");
        islem=input.nextInt();

        switch(islem){
            case 1:
            System.out.println(sayi1+sayi2);
            break;

            case 2:
            System.out.println(sayi1-sayi2);
            break;

            case 3:
            System.out.println(sayi1*sayi2);
            break;

            case 4:
            System.out.println(sayi1/sayi2);
            break;
        }
    }
}
