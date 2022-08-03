import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AimalRunClass {
    public static void main(String[] args) {
        List<Animal> animalList =new ArrayList<>();
        Scanner input =new Scanner(System.in);
        while (true) {
            System.out.println(" Do you want to create an animal");
            System.out.println("Yes Y No N");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("Y")){
                Animal animalwilladd =new Animal();
                System.out.println("Pease enter a animal");
                animalwilladd.setName(input.nextLine());
                System.out.println("please enter animal's color");
                animalwilladd.setColore(input.nextLine());
                System.out.println("please enter animal's weight");
                animalwilladd.setKilo(Integer.parseInt(input.nextLine()));
                animalList.add(animalwilladd);
            }else if(answer.equalsIgnoreCase("H")) {
                break;
            }else{
                System.out.println("pls retried");
            }
        }
        System.out.println("This the animals you enter");
        for (Animal animal : animalList) {
            System.out.println("Name "+animal.getName());
            System.out.println("Color "+animal.getColore());
            System.out.println("Weight "+animal.getKilo());
        }
    }
}
