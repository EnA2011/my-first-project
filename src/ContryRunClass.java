import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class ContryRunClass {
    public static void main(String[] args) {
        List<Contry> contryList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("Do you wanth to create a contry");
            System.out.println("if you wanth Y otervise H");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("Y")) {
                Contry contrywilladd = new Contry();
                System.out.println("Pls enter contry name");
                contrywilladd.setName(input.nextLine());
                System.out.println("Pls enter contry luanguage");
                contrywilladd.setLunguage(input.nextLine());
                System.out.println("Pls enter contry  capitale");
                contrywilladd.setBaskent(input.nextLine());
               contryList.add(contrywilladd);

            } else if (answer.equalsIgnoreCase("H")) {
                break;
            } else {
                System.out.println("Pls try again");

            }

        }
        System.out.println("dis is the contry you enter");
        for (Contry item : contryList) {
            System.out.println("===============================");
            System.out.println("name: "+item.getName());
            System.out.println("Capitale: "+item.getBaskent());
            System.out.println("Luanguage: "+item.getLunguage());
            System.out.println("===============================");

        }

    }
}


