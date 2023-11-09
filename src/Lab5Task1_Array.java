public class Lab5Task1_Array {
    //Create 9-0 array, use for loop to fill the array with length condition;
    //Use for-each loop to display the array list
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = array.length-1 - i;
        }

        System.out.println("Here is the Array:");

        for (int number : array) {
            System.out.println(number);
        }
    }

}
