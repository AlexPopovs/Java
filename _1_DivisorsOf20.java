public class _1_DivisorsOf20 {

    // two loops one inside of another: first loop with 2-20 "i" values divide against all values of second loop with "j" value
    // outer loop with 2-20 j values, here we check each i to be devided each j
    // second loop inside of the first also with 2-20;
    // if (i%j==0);

    public static void main(String[] args) {

        boolean hasPrevious = false;

        for (int i = 1;  20 >= i; i++) {
            System.out.print(i + ": " );

            hasPrevious = false;
            for (int j = 2; 20 >= j; j++) {

                if (0 == i % j) {
                    if (hasPrevious) {
                        System.out.print("," + j);
                    } else {
                        hasPrevious = true;
                        System.out.print(j);
                    }
                }
            }
            System.out.println();
        }
    }
}
