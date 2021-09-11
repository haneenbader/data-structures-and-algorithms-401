/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package insertion_sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 23, 42, 16, 15};
        System.out.println(Arrays.toString(quickSort(arr,0,arr.length-1)));




//        System.out.println(Arrays.toString(mergeSort(arr)));

        //       System.out.println(Arrays.toString(insertionSort(arr)));
    }

    public static int[] insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }


    public static int[] mergeSort(int[] arr) {
        int n = arr.length;
        if (n > 1) {
            int mid = n / 2;
            int[] left = new int[mid];
            for (int i = 0; i < left.length; ++i) {
                left[i] = arr[i];
            }
            int[] right = new int[n - mid];
            for (int j = 0; j < right.length; ++j) {
                right[j] = arr[j + mid];
            }
            mergeSort(left);
            mergeSort(right);
            marge(left, right, arr);
        }
        return arr;
    }

    public static void marge(int[] left, int[] right, int[] arr) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i = i + 1;
            } else {
                arr[k] = right[j];
                j = j + 1;
            }
            k = k + 1;
        }
        if (i == left.length) {
            for (int l = j; l < right.length; l++) {
                arr[k++] = right[l];
            }
        } else {
            for (int l = i; l < left.length; l++) {
                arr[k++] = left[l];
            }
        }
    }




    public static int[] quickSort(int[] arr, int left, int right) {
        if(left < right) {
            int position = partition(arr, left, right);
            quickSort(arr, left, position - 1);
            quickSort(arr, position + 1, right);
        }
        return arr;
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int low = left - 1;
        for(int i = left; i < right; i++) {
            if(arr[i] < pivot) {
                low++;
                swap(arr, i, low);
            }
        }

        swap(arr, right, low + 1);
        return low + 1;
    }

    public static void swap(int[] arr, int i, int low) {
        int temp;
        temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }

}