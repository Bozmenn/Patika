package Java101;
import java.util.Scanner;

public class DaireAlanCevreHesaplama {
    public static void main(String[] args) {
        double r, pi = 3.14, alan, cevre;
        Scanner input = new Scanner(System.in);

        System.out.print("Yari çap olcusunu giriniz : ");
        r = input.nextDouble();

        alan = pi * r * r;
        cevre = 2 * pi * r;
        System.out.println("Dairenin alani " + alan + " birim, cevresi " + cevre + " birimdir");
    }
    
}
