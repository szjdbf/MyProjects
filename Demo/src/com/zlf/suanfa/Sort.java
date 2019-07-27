package com.zlf.suanfa;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int arr[]={ 5, 1 ,6 ,3 ,7};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {

        // 5, 1 ,6 ,3 ,7
        //  1 5 6  3 7
        //  1 3 6 5 7
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            for (int j = 0; j < i; j++) {
                if (key < arr[j]) {
                    System.out.println("前"+Arrays.toString(arr));
                    arr[i] = arr[i] ^ arr[j];
                    arr[j] = arr[i] ^ arr[j];
                    arr[i] = arr[i] ^ arr[j];
                    System.out.println("后"+Arrays.toString(arr));
                }

            }


        }


    }

}
