package com.lmx.arithmetic.sort;

/**
 * @author liumingxin
 * @create 2018 25 21:59
 * @desc 选择排序
 **/
public class CheckSort {

    public static void main(String[] args) {
        int[] arr = new int[]{4,2,1,3,5,7,6};
        CheckSort sort = new CheckSort();
        sort.checkSort(arr,arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void checkSort(int [] a,int n){
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
                if(a[j] < a[i]){
                    int tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
            }
        }

    }
}
