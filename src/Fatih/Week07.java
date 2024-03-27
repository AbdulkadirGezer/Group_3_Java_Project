package Fatih;

import java.util.ArrayList;
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
        int[] numbers = {99, 12, 23, 32, 44, 57, 6};
        findMin(numbers);


        int[] arr = {10, 9, 8, 7};
        System.out.println("Sorted form of "+Arrays.toString(arr)+ " is " + Arrays.toString(sort(arr)));
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


    /**
     * This method sorts an array of integers in ascending order using the bubble sort algorithm.
     *
     * @param arr the array of integers to be sorted
     */
    public static int [] sort(int[] arr) {
            //int[] arr = {10, 9, 8, 7};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }




}
