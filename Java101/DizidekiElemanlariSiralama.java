package Java101;
import java.util.*;
import java.util.Collections;

public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Dizinin boyutunu giriniz : ");
        int n = input.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i < n ; i++ ) {
            System.out.println("Dizinin elemanlarini giriniz : ");
            System.out.println((i+1) + ". elemani : ");
            list.add(input.nextInt());
        }
        
        Collections.sort(list);
        for (int i :list) {
            System.out.print(i + " ");
        }

    }
}
