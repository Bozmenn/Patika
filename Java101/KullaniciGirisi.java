package Java101;
import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ID,Pass;
        Boolean key = true;

        while (key){
            System.out.println("Kullanici adinizi giriniz : ");
            ID = input.nextLine();

            System.out.println("Sifrenizi giriniz : ");
            Pass = input.nextLine();

            if (ID.equals("patika") && Pass.equals("java123")){
                System.out.println("Giris yaptiniz !");
                key = false;
            }else{
                System.out.println("Hatali giris yaptiniz !");
            }
        }
        
    }
}
