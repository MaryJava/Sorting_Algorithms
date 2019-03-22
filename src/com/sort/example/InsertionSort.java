package com.sort.example;

import static com.sort.example.Util.print;

public class InsertionSort {

    void sort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        int[] arr = {12, 11, 13, 5, 6};
        obj.sort(arr);
        print(arr);
    }
}

// Time Complexity: O(n*2)~O(n)
