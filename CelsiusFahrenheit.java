import java.util.Scanner;

public class CelsiusFahrenheit {
    // Create a program to convert Celsius degrees to Fahrenheit degrees.
    // Data should be pre-filled in variable
    // Hints and examples:
    // F = (C * 9/5) + 32
    // 10 C = 50F
    // 11 C = 51.8F
    // 100 C = 212F

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please give me temperature");

        double Celsius;

        Celsius = scanner.nextDouble();

        double F = (Celsius * 9/5) + 32;

        System.out.println("Celsius: " + Celsius + ", Fahrenheit: " + F);
        }

    }

