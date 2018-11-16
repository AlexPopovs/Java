public class _2_DivisorsOf20 {

    // WE need use "format string": System.out.println(String.format("%.2f", 1000.005F));

    public static void main(String[] args) {

        boolean hasPrevious;

        for (int i = 1; i <= 20; i++) {     // here boolean will always be false, because we have each time new line for i;

            if (i == 1) {
                System.out.print("    |");
            } else {

                System.out.print((i >= 10 ? i : (" " + i)) + ": "); // IF i>= 10 - it will show just "i", if i<= 10 it will show: (" " + i)) + ": ");
            }

            hasPrevious = false;

            for (int j = 2; j <= 20; j++) {
                if (i == 1) {
                    if (j >= 10) {
                        System.out.print("-" + j + "-|");  // instead of ("-" + (j >= 10 ? j : ("-" + j)) + "-|");
                    } else {
                        System.out.print("--" + j + "-|"); // instead of ("|-" + ("-" + j) + "-|");
                    } continue;
                }
                if (0 == i % j) {

                    if (hasPrevious) {
                        System.out.print("-XX-|");
                    } else {
                        hasPrevious = true;

                        System.out.print("|-XX-|");
                    }
                } else {
                    if (hasPrevious) {
                        System.out.print("-  -|");
                    } else {
                        hasPrevious = true;
                        System.out.print("|-  -|");
                    }
                }
            }
            System.out.println();
        }
    }
}
