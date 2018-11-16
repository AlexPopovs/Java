import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String info = "";

        System.out.println("please give me your name :)");
        info = "Hello: " + scanner.next();
        System.out.println("plz give me your number :)");
        info+= ". Your number is: " + scanner.next();
        System.out.println(info);


    }
}
