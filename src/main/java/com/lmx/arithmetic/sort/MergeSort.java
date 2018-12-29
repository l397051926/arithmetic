package com.lmx.arithmetic.sort;

import javax.xml.transform.Source;
import java.util.Arrays;

/**
 * @author liumingxin
 * @create 2018 27 20:32
 * @desc
 **/
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 1, 3, 5, 7, 6};
//        int[] x = new int[] {2,3,4};
//        arr = x;
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void mergeSort(int[] a, int n) {
        merge(a, 0, n - 1);
    }

    public void merge(int a[], int before, int end) {
        if (before >= end) {
            return;
        }
        int q = (before + end) / 2;
        merge(a,before,q);
        merge(a,q+1,end);
        int[] tmp = new int[end-before+1];
        int i = before;
        int j = q+1;
        for (int k = 0; k < tmp.length ; k++) {
            if(i > q){
                tmp[k] = a[j];
                j++;
                continue;
            }
            if(j > end){
                tmp[k] = a[i];
                i++;
                continue;
            }
            if(a[i] < a[j]){
                tmp[k] = a[i];
                i++;
            }else {
                tmp[k] = a[j];
                j++;
            }
        }
        for (int k = 0; k < tmp.length; k++) {
            a[before+k] = tmp[k];
        }

    }

}
