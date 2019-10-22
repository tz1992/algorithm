package algorithm.sort;

import java.util.Arrays;

/*
 * 直接插入排序
 * 插入排序是假定需要插入的序列已经排序完成
 * 稳定
 * 时间复杂度 O(n^2)
 */
public class InsertSort {
public static void main(String[] args) {
  int[]arr={1,9,8,2,5,3,4,7,6,0};
  for (int i = 1; i < arr.length; i++) {
    int temp=arr[i];
    int j;
    for( j=i-1;j>=0&&arr[j]>temp;j--){
     arr[j+1]=arr[j];
    }
    arr[j+1]=temp;
  }
  System.out.println(Arrays.toString(arr));
}
}
