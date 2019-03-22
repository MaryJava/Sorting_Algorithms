package com.sort.example;

import static com.sort.example.Util.print;

public class RecursiveInsertionSort {

    static void sort(int arr[], int n) {

        if (n <= 1)
            return;

        sort(arr, n - 1);

        int last = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;

    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 3};
        sort(arr, arr.length);
        print(arr);
    }
}
