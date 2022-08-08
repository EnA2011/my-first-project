package prediction;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class NumberPrediction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 1;
        int max = 10;
        Random random = new Random();
        int numberPredicted = random.nextInt(max - min + 1) + min;
        System.out.println(" sana 1 ve 10 arasinda bir rakam rahmin etirecem ");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "sayiyi giriniz");
            int answer = Integer.parseInt(input.nextLine());
            if (answer == numberPredicted) {
                System.out.println("tebrikler");
                break;
            } else {
                if (i == 2) {
                    System.out.println("Kaybetiniz cevap " + numberPredicted);
                    break;
                }
                if (answer < numberPredicted) {
                    System.out.println(" biraz yukari ");
                } else if (answer > numberPredicted) {
                    System.out.println("biraz asagi ");
                }
            }
        }
    }
}