
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class stringsOverall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write day or figure");
        String input = scanner.next();

        switch (input){

            case "Monday": System.out.println("1"); return;
            case "Tuesday": System.out.println("2"); return;
            case "Wednesday": System.out.println("3"); return;
            case "Thursday": System.out.println("4"); return;
            case "Friday": System.out.println("5"); return;
            case "Saturday": System.out.println("6"); return;
            case "Sunday": System.out.println("7"); return;
            case "1": System.out.println("Monday"); return;
            case "2": System.out.println("Tuesday"); return;
            case "3": System.out.println("Wednesday"); return;
            case "4": System.out.println("Thursday"); return;
            case "5": System.out.println("Friday"); return;
            case "6": System.out.println("Saturday"); return;
            case "7": System.out.println("Sunday"); return;
        }
    }
}
