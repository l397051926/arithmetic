package com.lmx.arithmetic.sort;

/**
 * @author liumingxin
 * @create 2018 25 21:37
 * @desc 冒泡排序
 **/
public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int [] arr = new int[]{4,2,1,6,3,4};
        bubbleSort.bubbleSort(arr,arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void bubbleSort(int[] a ,int n){
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i -1; j++) {
                if (a[j] > a [j+1]){
                    int tmp = a [j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    flag = true;
                }
            }
            if(!flag) {
                break;
            }
        }
    }
}
