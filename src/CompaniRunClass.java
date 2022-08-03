import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompaniRunClass {
    public static void main(String[] args) {
        List<Compani> companiList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("DO you wanthe to creat a compani");
            System.out.println("Yes Y No N");
            String answer = input.nextLine();
                 if (answer.equalsIgnoreCase("Y")) {
                Compani companiwilladd = new Compani();
                System.out.println("So you wanna creat a compani okay lets Begin !!!");
                System.out.println("Enter your companis name");
                companiwilladd.setName(input.nextLine());
                System.out.println("Enter your companis owner name");
                companiwilladd.setOwner(input.nextLine());
                System.out.println("Enter companis localitation");
                companiwilladd.setLocalitation(input.nextLine());
                System.out.println("Enter companis money");
                companiwilladd.setMoney(Integer.parseInt(input.nextLine()));
                System.out.println("How many client has the compani have");
                companiwilladd.setClient(Integer.parseInt(input.nextLine()));
                companiList.add(companiwilladd);
            }else if (answer.equalsIgnoreCase("H")){
                break;
            }else {
                System.out.println("pls try again you idiot");
            }
        }
        System.out.println("dis is the compagni you create");
        for (Compani item : companiList) {
            System.out.println("Name"+item.getName());
            System.out.println("Owner"+item.getOwner());
            System.out.println("Locate"+item.getLocalitation());
            System.out.println("Money"+item.getMoney());
            System.out.println("Client"+item.getClient());

        }

    }
}