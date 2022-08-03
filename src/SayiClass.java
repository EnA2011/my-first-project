import Sayi.Sayi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SayiClass {


    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int toplanacakSayiAdedi;
        System.out.println("Kaç adet sayı toplamak istiyorsunuz");
        toplanacakSayiAdedi = Integer.parseInt(input.nextLine());
        for (int i = 0; i < toplanacakSayiAdedi; i++) {
            System.out.println((i + 1) + ". sayiyi giriniz");
            sayiList.add(Integer.parseInt(input.nextLine()));
//Toplanacak her bir sayı listeye atılır
        }
        int toplam = 0;
        System.out.println("Toplam bu ");
        for (Integer item : sayiList) {

            toplam = toplam + item;
            System.out.println("toplamak istediginiz sayilar "+item);
        }
        System.out.println("toplamak istediginiz sayi adedi " +toplanacakSayiAdedi);

        System.out.println("tomplami   " + toplam);
    }
}

