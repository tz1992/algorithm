package algorithm.toutiao;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 今日头条/头条校招
 * 思路：算出差值大于10的个数，就是需要补数的个数
 * 需要补数的个数和当前数目之和就是符合要求的个数
 * 如果刚好是3的倍数，大于10的个数就是需要补的个数
 * 当不是3的倍数，对总和取模，最后3-取模的个数加上大于
 * 10的个数就是需要补的个数。
 */
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNextInt()) {
      int n = in.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < arr.length; i++) {
        arr[i] = in.nextInt();
      }
      Arrays.sort(arr);
      int[] dis = new int[n - 1];
      for (int i = 0; i < dis.length; i++) {
        dis[i] = arr[i + 1] - arr[i];

      }
      int count = 0;
      for (int i = 0; i < dis.length; i++) {
        if (dis[i] > 10) {
          count++;
        }
      }
       int total=count+n;
       int temp=total%3;
       System.out.println(temp==0?count:count+3-temp);


    }
    in.close();
  }
}
