public class Array {
    public static void main(String[] args) {

        String[] pets = new String[3]; // Here we create reservation for 3 containers

        pets[0] = "dog";
        pets[1] = "cat";
        pets[2] = "mouse";

        System.out.println(pets[0]);
        System.out.println(pets[1]);
        System.out.println(pets[2]);


        boolean[] zoo = new boolean[4];

        zoo[0] = true;
        zoo[1] = true;
        zoo[2] = true;

        System.out.println(zoo[0]);
        System.out.println(zoo[1]);
        System.out.println(zoo[2]);
        System.out.println(zoo[3]);


        char[] pets2 = new char[3]; // Here we create reservation for 3 containers

        pets2[0] = 'd';
        pets2[1] = 'c';
        pets2[2] = 'm';

        System.out.println(pets2[0]);
        System.out.println(pets2[1]);
        System.out.println(pets2[2]);

        System.out.println(pets.length); // длина array

    }
}