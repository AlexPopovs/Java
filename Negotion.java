public class Negotion {

    public static void main(String[] args) {

        boolean doYouLikeDogs = false;
        boolean doYouLikeCats = true;
        boolean doYouLikeMouse = true;

        if (doYouLikeCats && doYouLikeDogs) {

            System.out.println("U like cat");
        } else if (doYouLikeDogs) {
            System.out.println("You like dogs");
        } else if (doYouLikeMouse) {
            System.out.println("U like mouse");
        } else {
            System.out.println("You do not like animals");
        }
    }
}
