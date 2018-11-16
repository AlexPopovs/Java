public class Concatenation {

    // Concatenation in Java is the operation of joining two strings together.
    // You can join strings using either the addition (+) operator or the String's concat() method.

    public static void main(String[] args) {

        String myNameAndSurname;
        String name = "Alex";
        String surname = "Popov";

        int age = 18;
        age = age + 10;
        age++;
        age--;
        age+= 10; // age = age + 10;
        age-=10; // age = age - 10;

        boolean hasCat = false;

        myNameAndSurname = name + " " + surname + " I'm " + age + " years old" + " He has a cat: " + hasCat;

        System.out.println(myNameAndSurname);


    }
}
