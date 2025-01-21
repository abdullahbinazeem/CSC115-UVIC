import java.lang.Math;

/*
 * Lab1.java
 *
 * A class of static methods with errors
 *
 */
public class Lab1 {

    /*
     * Purpose: returns a String representation of array
     * Parameters: int[] - array containing integers
     * Returns: String - the textual representation of the array
     */
    public static String getString(int[] array) {
        String result = "{";

        for(int i = 0; i < array.length; i++) {
            result += array[i];
            if(i+1 < array.length){
                result += ",";
            }
        }
        result += "}";

        return result;
    }

    /*
     * Purpose: calculates the average of a, b and c
     * Parameters: int a, int b, int c
     * Returns: double - the average of the three integers
     */
    public static double getAverage(int a, int b, int c) {
        double result = 0;

        result = (a + b + c) / 3.0;
        
        return (Math.round(result*100.0)/100.0);
    }

    /*
     * Purpose: returns a count of the number of elements
     *  in array bigger than the given treshold
     * Parameters: int[] array, int threshold
     * Returns: int - the number of elements in the array above threshold
     */
    public static int countAbove(int[] array, int threshold) {
        int count = 0;

        for(int i=0; i<array.length; i++) {
            if (array[i]>threshold) {
                count++;
            } 
        }

        return count;
    }

    /*
     * Purpose: finds the biggest number in the array of integers
     * Parameters: int[] - the array of integers
     * Returns: int - the maximum value found in the array
	 * Preconditions: the given array is not empty
     */
    public static int getMax(int[] array) {
        int max = array[0];

        for(int i=0; i<array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }


    /*
     * Purpose: determines whether the numbers in array
     *  are in sorted increasing order
     * Parameters: int[] array
     * Returns: boolean - true if sorted, false otherwise
     */
    public static boolean isSorted(int[] array) {

        for(int i = 0; i < array.length - 1; i++) {
            if (array[i+1] < array[i]) {
                return false;
            } 
        }

        return true;
    }

}
