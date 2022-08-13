package prediction;

import java.util.Random;
import java.util.Scanner;

public class ComputerNumberPrediction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 1;
        int max = 10;
        Random random = new Random();
        int numberPredicted = random.nextInt(max - min + 1) + min;
        System.out.println("i will predicte the number that you got");
        System.out.println("if i win Y otherwise U or D ");
        String answer = null;
        boolean isFound = false;
        for (int i = 0; i < 3; i++) {
            if (answer == null) {
                System.out.println("is your number " + numberPredicted);
                answer = input.nextLine();
                if (answer.equalsIgnoreCase("Y")) {
                    isFound = true;
                    break;
                }
            } else {
                if (answer.equalsIgnoreCase("U")) {
                    min = numberPredicted;
                    numberPredicted = random.nextInt(max - min + 1) + min;
                    System.out.println("is your number " + numberPredicted);
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("Y")) {
                        isFound = true;
                        break;
                    }
                } else if (answer.equalsIgnoreCase("D")) {
                    max = numberPredicted;
                    numberPredicted = random.nextInt(max - min + 1) + min;
                    System.out.println("is your number " + numberPredicted);
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("Y")) {
                        isFound = true;
                        break;
                    }
                }
            }

        }
        if (isFound) {
            System.out.println("i won");
        } else {
            System.out.println("i lost");
        }

    }
}

