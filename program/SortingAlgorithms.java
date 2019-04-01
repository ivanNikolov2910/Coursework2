package program;

import java.util.Arrays;
import java.util.Date;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int[] array1 = new int[50000];
        int[] array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 1000000);
            array2[i] = array1[i];
        }
        System.out.println("Start time " + new Date().getMinutes() + ": " + new Date().getSeconds());
        System.out.println("Bubble sort: " + Arrays.toString(bubbleSort(array1)));
        System.out.println("End time " + new Date().getMinutes() + ": " + new Date().getSeconds());

        System.out.println("Start time 2: " + new Date().getMinutes() + ": " + new Date().getSeconds());
        quickSort(array2, 0 ,array2.length - 1);
        System.out.print("Quick Sort: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + ", " );
        }
        System.out.println("\nEnd time " + new Date().getMinutes() + ": " + new Date().getSeconds());

    }

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }


    public static void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }
    private static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }

}


