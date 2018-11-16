public class exerciseONE {

    public static void main(String[] args) {


        boolean doYouLikeDogs = true;
        boolean doYouLikeCats = true;

        if (doYouLikeDogs && doYouLikeCats) {
            System.out.println("You like dogs and cats");
        } else if (doYouLikeCats) {
            System.out.println("You like cats only");
        } else if (doYouLikeDogs) {
            System.out.println("You like dogs only");
        } else {
            System.out.println("You do not like animals");

        }
    }
}
