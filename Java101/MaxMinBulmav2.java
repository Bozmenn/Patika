package Java101;
import java.util.*;;

public class MaxMinBulmav2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {15,12,788,1,-1,-778,2,0};
        System.out.println("Sayi giriniz : ");
        int girilenSayi = input.nextInt();

        ArrayList<Integer> minlist = new ArrayList<>();
        for (int i : list) {
            if (i< girilenSayi){    
                minlist.add(i);
            }
        }
        int min = minlist.get(0);
        for (int j : minlist) {
            if (j > min) {
                min = j;
            }
        }

        ArrayList<Integer> maxlist = new ArrayList<>();
        for (int i : list) {
            if (i> girilenSayi){    
                maxlist.add(i);
            }
        }
        int max = maxlist.get(0);
        for (int j : maxlist) {
            if (j < max) {
                max = j;
            }
        }

        System.out.println("Girilen sayidan kucuk en yakin sayi : " + min);
        System.out.println("Girilen sayidan buyuk en yakin sayi : " + max );
    }
}
