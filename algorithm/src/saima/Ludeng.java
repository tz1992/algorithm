package saima;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author tz 基本算法/路灯
 */
public class Ludeng {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      int num = in.nextInt();
      int len = in.nextInt();
      int[] arr = new int[num];
      for (int i = 0; i < arr.length; i++) {
        arr[i] = in.nextInt();
      }

      Arrays.sort(arr);
      int max = Integer.MIN_VALUE;
      int last = len - arr[arr.length - 1];
      int first = arr[0];
      boolean flag = false;
      for (int i = 1; i < arr.length; i++) {
        if (arr[i] - arr[i - 1] == 0) {
          flag = true;
        }
        if (max < arr[i] - arr[i - 1]) {
          max = arr[i] - arr[i - 1];
        }
      }
      double dis = (float) max / 2;

      if (first != 0) {
        int firstDis = arr[0] - 0;
        if (flag) {
          System.out.printf("%.2f", Math.max(dis, firstDis));
        } else {
          System.out.printf("%.2f", Math.max(dis, Math.max(firstDis, last)));
        }
      } else {
        if (flag) {
          System.out.println(dis);
        } else {
          if (last < dis) {
            System.out.printf("%.2f", dis);
          } else {
            System.out.printf("%.2f", last);
          }
        }
      }



    }
    in.close();
  }
}
