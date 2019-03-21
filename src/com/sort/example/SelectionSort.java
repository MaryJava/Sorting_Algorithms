package com.sort.example;

public class SelectionSort {

    void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;

                // Swap the found minimum element with the first element
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();
        int[] arr = {64, 25, 12, 22, 11};
        ob.sort(arr);
        ob.printArray(arr);
    }
}

// Time Complexity: O(n2) as there are two nested loops.
