package Java101;
import java.util.*;

public class BasamaklarinToplami {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
	    System.out.print("Sayi giriniz:");
	    int number,toplam=0;
	
	    number=input.nextInt();
		
	    while(number!=0) {
		    int rakam=number%10;
		    toplam=rakam+toplam;
		    number=number/10;
		
	    }
	
	System.out.println("Rakamlar toplami:"+toplam);
    }
}


