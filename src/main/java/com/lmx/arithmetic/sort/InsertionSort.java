package com.lmx.arithmetic.sort;

/**
 * @author liumingxin
 * @create 2018 25 21:46
 * @desc 插入排序
 **/
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{4,2,1,3,5,7,6};
        InsertionSort sort = new InsertionSort();
        sort.insertionSort(arr,arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     *  4 2 1 3 5 7 6
     *  2 4 1 3 5 7 6
     *  1 2 4 3 5 7 6
     *  .....
     * @param a
     * @param n
     */
    public void insertionSort(int[] a, int n){
        if(n <= 1 ) {
            return;
        }
        for (int i = 0; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0  ; --j) {
                if (a[j] > value){
                    a[j+1] = a[j];
                }else {
                    break;
                }
            }
            a[j+1] = value;
        }
    }

}
