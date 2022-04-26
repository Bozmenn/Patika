package Java101;
import java.util.Scanner;


public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz giriniz : ");
        mat = input.nextInt();
        
        System.out.print("Fizik Notunuz giriniz : ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz giriniz : ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz giriniz : ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz giriniz : ");
        tarih = input.nextInt();

        System.out.print("Muzik Notunuz giriniz : ");
        muzik = input.nextInt();

        int ortalama = (mat + fizik + kimya + turkce + tarih + muzik)/6;

        System.out.println("Ortalama Notunuz : " + ortalama);
    }
    
}