package com.rong.sort;

/**
 * Created by yiwei 2019-04-09
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 23, 1, 0, 9};
        int left = 0;
        int right = arr.length - 1;

        quickSort(arr, left, right);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] arr, int left, int right) {
        int partitionIndex = 0;
        if (left < right) {
            partitionIndex = partition(arr, left, right);
            quickSort(arr, 0, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }

    }

    private static int partition(int[] arr, int left, int right) {

        int index = left + 1;
        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[left]) {
                swap(arr, i, index);
                index++;
            }
        }
        swap(arr, left, index - 1);
        return index - 1;
    }

    private static void swap(int[] arr, int i, int index) {
        int tmp = arr[i];
        arr[i] = arr[index];
        arr[index] = tmp;
    }
}
