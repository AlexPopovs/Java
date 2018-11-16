public class HomeworkMain {
    public static void main(String[] args) {
        int arr [] = {4,7,5,6};
        int largest, smallest;
        // smallest = arr [0]; // assigning first element of an array
        largest = arr [0]; // assigning first element of an array
        for (int i=0; i < arr.length; i++) {
            if ( arr [i] > largest ) {
                largest = arr [i];
            }
            //else if (arr[i] < smallest) {
            //    smallest = arr [i];
            //}

        }
        System.out.println("largest number in array is " + largest);
// System.out.println("smallest number is " + smallest);

    }
}
