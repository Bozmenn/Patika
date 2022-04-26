package Java101;
import java.util.Scanner;
import java.math.*;

public class HipotenusBulma {
    public static void main(String[] args) {
        int a, b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.print("Ilk kenari giriniz : ");
        a = input.nextInt();

        System.out.print("Ikinci kenari giriniz : ");
        b = input.nextInt();

        c= Math.sqrt((a*a) + (b*b));
        System.out.print("Hipotenüs uzunlugu : " + c);

    }
}
