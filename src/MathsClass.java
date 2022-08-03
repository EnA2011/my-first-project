import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MathsClass {
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
        int sayi1;
        int sayi2;
        int toplam;
        System.out.println("Lutfen sayi1 i giriniz");
        sayi1 = Integer.parseInt(input.nextLine());
        System.out.println("Lutfen sayi2 i girniz");
        sayi2 = Integer.parseInt(input.nextLine());
        toplam = sayi1 + sayi2;
        System.out.println("Sayi1 ve Sayi2 nin tomplami "+toplam);
        System.out.println("Sayi1 ve Sayi2 nin carpimi "+(sayi1*sayi2));
        System.out.println("Sayi1 ve Sayi2 nin cikartmasi "+(sayi1-sayi2));
        System.out.println("Sayi1 ve Sayi2 nin bolmesi " + (sayi1/sayi2));



    }
}
