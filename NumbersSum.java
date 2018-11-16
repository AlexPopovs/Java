import java.util.Scanner;

public class NumbersSum {
    public static void main(String[] args) {
        // Numbers should be in 0..999 range
        //Data must be read from console input.
        //Hints and examples: Remember,, that number 123 is 1*100 + 2*10 + 3
        //initiate console reader: new Scanner(System.in)
        //read number from console: Scanner.nextInt()
        // 123 = 6
        // 111 = 3

        Scanner scanner = new Scanner(System.in);
        System.out.println("please give me number");

        int number = scanner.nextInt();

        /*String numberString = "" + number;

       int result = 0;
       for (int i = 0; i < numberString.toCharArray(); [i])   //  здесь мы преобразовываем string in char


       int firstDigit = (number - number % 100) / 100; // firstDigit: 1 // % - остаток от деления
       int secondDigit = ((number - firstDigit * 100) - (number - firstDigit) % 10) / 10;
       int thirdDigit = (number - firstDigit * 100 - secondDigit * 10);
       int result = firstDigit + secondDigit + thirdDigit;
       */

       int firstDigit = number / 100;
       int secondDigit = (number / 10) % 10;
       int thirdDigit = number % 10;

       int result = firstDigit + secondDigit + thirdDigit;

        {
            System.out.println("Number " + number + " sum of digits is: " + result);
        }
    }
}