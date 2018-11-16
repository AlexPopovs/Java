public class Loop {

    public static void main(String[] args) {

        // for
        // foreach
        // do-while
        // while

        int number = 0;
//        while (number < 10){            // IF WE WRITE "TRUE" THE PROCESS WILL BE INFINITE AND NEVER END
//            System.out.println(number);
//            number++;
//        }
//        System.out.println("END");

        while (true)
        {
            System.out.println(number);
            number++;
            if (number > 10)
            {
                break;
            }
        }
    }
}
