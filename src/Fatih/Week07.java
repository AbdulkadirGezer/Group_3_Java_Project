package Fatih;

import java.util.Arrays;

public class Week07 {
    public static void main(String[] args) {


        /*int [] numbers = new int[7];
        numbers[0] = 99;
        numbers[1] = 12;
        numbers[2] = 23;
        numbers[3] = 32;
        numbers[4] = 44;
        numbers[5] = 57;
        numbers[6] = 6;*/
        int [] numbers = {99, 12, 23, 32, 44, 57, 6};

        findMin(numbers);


    }



    /**
     * This method finds the minimum value in an array of integers.
     *
     * @param numbers the array of integers to search
     */
    public static void findMin(int[] numbers) {

        int min = numbers[0]; // stores the minimum value found so far

        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i]; // updates the minimum value if a smaller one is found
            }
        }
        System.out.println("Minimum number of " + Arrays.toString(numbers) + " is: " + min);
    }
}
