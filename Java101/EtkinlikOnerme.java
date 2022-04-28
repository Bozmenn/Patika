package Java101;
import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sicaklik;

        System.out.println("Hava sicakliğini giriniz :");
        sicaklik = input.nextDouble();

        if (sicaklik <= 5){
            System.out.println("Kayak yapabilirsiniz !");
        }else if (5 < sicaklik && sicaklik <= 15){
            System.out.println("Sinemaya gidebilirsiniz !");
        }else if (15 < sicaklik && sicaklik <= 25){
            System.out.println("Piknik yapabilirsiniz !");
        }else {
            System.out.println("Yüzmeye gidebilirsiniz !");
        }
    }
}
