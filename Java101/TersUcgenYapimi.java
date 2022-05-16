package Java101;
import java.util.*;

public class TersUcgenYapimi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int basamakSayisi;

        System.out.println("Basamak sayisini giriniz : ");
        basamakSayisi = input.nextInt();

        for (int m=1;m<=basamakSayisi;m++){

            for (int x=1;x<=m;x++){
                System.out.print(" ");
            }
            for (int y=1;y<=2*(basamakSayisi-m+1)-1;y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


