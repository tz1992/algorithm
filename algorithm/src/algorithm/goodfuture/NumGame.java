package algorithm.goodfuture;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 好未来/n个数里最小的k个
 * 
 */
public class NumGame {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNextLine()) {
    String str=in.nextLine();
    String[]arr=str.split(" ");
    
    int k=Integer.parseInt(arr[arr.length-1]);
    int []nums=new int[arr.length-1];
    for (int i = 0; i < nums.length; i++) {
      nums[i]=Integer.parseInt(arr[i]);
    }
    
    Arrays.sort(nums);
    for (int i = 0; i < k; i++) {
      System.out.print(nums[i]+" ");
    }
  }
  in.close();
}
}
