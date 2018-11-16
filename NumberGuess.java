import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {

        int minBoundary = 0;
        int maxBoundary = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please guess a number");

        int step = 0;

        while (true) {
            if (minBoundary > maxBoundary) {
                System.out.println("You're liar!!!, minBoundary[" + minBoundary + ") > maxBoundary[" + maxBoundary + "]");
                break;
            }
            if (++step > 8) {
                System.out.println("Liar!, step count > 8");
                break;
            }
            if (minBoundary == maxBoundary) {
                System.out.println("Your number is " + minBoundary);
                break;
            } else {

            }
        }
    }

}
