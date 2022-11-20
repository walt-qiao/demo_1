package org.example5;

import java.util.ArrayList;

public class MaoPaoPaiXv {
    public static void main(String[] args) {

        int[] arr = {1,4,2,7,5,8,9};
        int[] permutation = permutation(arr);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("结果: [");
        for (int i = 0; i < permutation.length - 1; i++) {
            if (i < permutation.length-2){
                stringBuilder.append(permutation[i]+",");
            }else {
                stringBuilder.append(permutation[i]);
            }

        }
        stringBuilder.append("]");
        System.out.println(stringBuilder);
    }

    public static int[] permutation(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    int step = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = step;
                }
            }
        }
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i]);

        }
        return arr;
    }
}
