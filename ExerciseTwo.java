import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class ExerciseTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please give me your name");

        String name = "";

        while (true) {

            name = scanner.next();

            if (name.charAt(0) == '@' && name.length() == 1)      /* тут пишем, когда программе надо остановиться: а именно, когда
                первый символ имени - @; 0 - because first value of the array is @ and then go all the names exist */
            {
                break;
            }

            char lastLetter = name.charAt(name.length() - 1);


            if (lastLetter == 'a') {       // WE WRITE == WHEN WE CHECKING AND = WHEN WE DECLARE !!!

                System.out.println("This is a women name");
            } else {
                System.out.println("This is a man's name");
            }
        }
//        String name = scanner.next();
//        int lastLetterPointer = name.length() - 1;
//        char lastLetter = name.charAt(lastLetterPointer);
//
//        if (lastLetter == 'a' || lastLetter == 'A') {
//            System.out.println("Femaile name");
//        }
//else {
//            System.out.println("Male name");
//        }
    }
}
