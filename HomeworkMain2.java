import java.util.Scanner;

public class HomeworkMain2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = "";

        System.out.println("Please write a word to convert");
        name = s.next();

        char[] ch_arr = name.toCharArray();

        for (int i = ch_arr.length - 1; i >= 0; i--) {
            System.out.print(ch_arr[i]);

        }
    }
}
