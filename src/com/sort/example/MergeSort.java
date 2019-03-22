package com.sort.example;

import static com.sort.example.Util.print;

public class MergeSort {

    void merge(int arr[], int l, int m, int r) {

        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int leftSubArr[] = new int[n1];
        int rightSubArr[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            leftSubArr[i] = arr[l + i];

        for (int j = 0; j < n2; ++j)
            rightSubArr[j] = arr[m + 1 + j];

        //Merge temp arrays
        //Initial indexes of first and second sub arrays
        int i = 0;
        int j = 0;

        // Initial index of merged sub array
        int k = l;

        while (i < n1 && j < n2) {
            if (leftSubArr[i] <= rightSubArr[j]) {
                arr[k] = leftSubArr[i];
                i++;
            } else {
                arr[k] = rightSubArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of LeftSubArray[] if any
        while (i < n1) {
            arr[k] = leftSubArr[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightSubArray[] if any
        while (j < n2) {
            arr[k] = rightSubArr[j];
            j++;
            k++;
        }
    }

    void sort(int[] arr, int l, int r) {

        if (l < r) {

            // Find the middle point
            int m = (l + r) / 2;

            // sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }


    public static void main(String[] args) {

        int[] arr = {12, 11, 13, 5, 6, 7};
        MergeSort obj = new MergeSort();
        obj.sort(arr, 0, arr.length - 1);
        print(arr);
    }
}


// Time complexity of Merge Sort is \Theta(nLogn) in all 3 cases (worst, average and best)
// as merge sort always divides the array in two halves and take linear time to merge two halves.