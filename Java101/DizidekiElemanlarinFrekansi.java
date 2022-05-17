package Java101;

import java.util.ArrayList;
import java.util.Collections;

public class DizidekiElemanlarinFrekansi {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        ArrayList<Integer> arrlist = new ArrayList<>();

        for (int i : list) {
            arrlist.add(i);
        }

        Collections.sort(arrlist);

        for (int i = 0 ; i < arrlist.size() ; i++) {
            int sayac = 0;
            for (int j = 0 ; j < arrlist.size() ; j++) {
                if (arrlist.get(i)==arrlist.get(j)) {
                    sayac += 1;
                } 
            }
        
            System.out.println(arrlist.get(i) + " sayisi " + sayac + " kere tekrar edildi.");
            i += (sayac-1);
        }
    }
}
