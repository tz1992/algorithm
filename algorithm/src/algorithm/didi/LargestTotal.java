package algorithm.didi;
/*
 * 问题描述：
 * 一个数组有 N 个元素，求连续子数组的最大和。 例如：[-1,2,1]，和最大的连续子数组为[2,1]，其和为 3
 * 输入描述：
 * 输入为两行。 第一行一个整数n(1 <= n <= 100000)，
 * 表示一共有n个元素 第二行为n个数，
 * 即每个元素,每个整数都在32位int范围内。以空格分隔。
 * 输出描述：
 * 所有连续子数组中和最大的值。
 * 解题思路：
 * dp[i]表示以第i个数结尾的最大值，有dp[i]=arr[i]+max(0,dp[i-1])
 */
import java.util.Scanner;

public class LargestTotal {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNextInt()) {
    int n=in.nextInt();
    int arr[]=new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i]=in.nextInt();
    }
    int max=Integer.MIN_VALUE;
    
    int dp[]=new int[n];
    dp[0]=arr[0];
    for (int i = 1; i < arr.length; i++) {
      if(dp[i-1]<0){
        dp[i]=arr[i];
      }else{
        dp[i]=arr[i]+dp[i-1];
      }
    }
    
    for (int i = 0; i < dp.length; i++) {
      if(dp[i]>max){
        max=dp[i];
      }
    }
    
    System.out.println(max);
    
  }
  in.close();
}
}
