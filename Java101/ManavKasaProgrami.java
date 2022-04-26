package Java101;
import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5, toplamtutar;
        double armutkilo, elmakilo, domatkilo, muzkilo, patlicankilo;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo : ");
        armutkilo = input.nextDouble();

        System.out.print("Elma kaç kilo : ");
        elmakilo = input.nextDouble();

        System.out.print("Domates kaç kilo : ");
        domatkilo = input.nextDouble();

        System.out.print("Muz kaç kilo : ");
        muzkilo = input.nextDouble();

        System.out.print("Patlican kaç kilo : ");
        patlicankilo = input.nextDouble();

        toplamtutar = (armutkilo * armut) + (elmakilo * elma) + (domatkilo * domates) + (muzkilo * muz) + (patlicankilo * patlican);
        System.out.print("Toplam tutar : " + toplamtutar );
    }
}
