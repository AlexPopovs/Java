public class operators {
    public static void main(String[] args) {


//    Bitwise operators: & (and), | (or), ^ (XOR - excluding or / not or), ~ (NOT)
//    Assignment operators: = (назначение), +=, -=, *=, /=
//    Relational operators: <, <=, >, >=, == (сравнение), !=
//    Arithmetic operators: +,-,*,/,$, ++, --
//    Logical operators: &, |, &&, ||, ^
//    bIT-SHIFTING OPERATORS: <<, >>, >>>
//    Conditional operator (Elvis operator): ? :  - if we do not write code we write if ? and then :
//    Instance operator: instanceof (пример, образец)


    int integer1 = 10;
    int integer2;
    integer2 = integer1 +5;
    System.out.println("integer addition result: " + (++integer1)); // POST incrementiion
    System.out.println("integer1 = " + integer1); // PRE incrementation
    System.out.println("integer1>10 is" + (integer1 > 10));

    // for (int i =0; i<10; i++) {
    // }

    boolean b = false;
    if (b = true) {
        System.out.println("B is true");
    }
    // Logical operators: &, |, &&, || (or)

    if ((integer1 = 13) == 13 && (integer1 = 14) == 14) {
        System.out.println("integer1 = " + integer1);
    }

    // PREFIX AND POSTFIX

        int five = 5;
                    //6       //7
    int prefixSum = ++five + ++five;
        System.out.println("prefixSum = " + prefixSum); // it will be 13


}
}


