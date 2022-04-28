package Java101;
import java.util.*;

public class BurcBulmaProgrami {
    public static void main(String[] args) {
        int month,day;
		String burc = "";
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dogdunuz ay nedir ? ");
		month = input.nextInt();
		
		if (month <= 0 ||  month > 12) {
			 throw new RuntimeException("Try again");
		}
		
		System.out.println("Dogdugunuz gun nedir ? ");
		day = input.nextInt();
				
		if (month ==1) {
			if (day < 22 && day < 31 ) {
				burc = "Oglak" ;
			}else {
				burc = "Kova";
			}
		}
		
		else if (month ==2) {
			if(day < 20 && day <= 28) {
				burc = "Kova";
			}else {
				burc = "Balik";
			}
		}
		
		else if (month ==3) {
			if (day < 21 && day <= 31 ) {
				burc = "Balik";
			}else {
				burc = "Koc";
			}
			
		}
		
		else if (month ==4) {
			if (day < 21 && day <= 31 ) {
					burc = "Koc";
			}else {
					burc = "Boga";
			}
		}
	
		else if (month ==5) {
			if (day < 22 && day <= 31 ) {
					burc = "Boga";
			}else {
					burc = "Ikizler";
			}
		}
	
		else if (month ==6) {
			if (day < 23 && day <= 31 ) {
					burc = "Ikizler";
			}else {
					burc = "Yengec";
			}
		}
	
		else if (month ==7) {
			if (day < 23 && day <= 31 ) {
					burc = "Yengec";
			}else {
					burc = "Aslan";
			}
		}
		
		else if (month ==8) {
			if (day < 23 && day <= 31 ) {
					burc = "Aslan";
			}else {
					burc = "Basak";
			}
		}
		
		else if (month ==9) {
			if (day < 23 && day <= 31 ) {
					burc = "Basak";
			}else {
					burc = "Terazi";
			}
		}
		
		else if (month ==10) {
			if (day < 23 && day <= 31 ) {
					burc = "Terazi";
			}else {
					burc = "Akrep";
			}
		}
	
		else if (month ==11) {
			if (day < 22 && day <= 31 ) {
					burc = "Akrep";
			}else {
					burc = "Yay";
			}
		}
		
		else if (month ==12) {
			if (day < 22 && day <= 31 ) {
					burc = "Yay";
			}else {
					burc = "Oglak";
			}
		}
		
		
		
		System.out.println("Burcunuz : " + burc);
         
    }

}



		
	
		
		
		
		

