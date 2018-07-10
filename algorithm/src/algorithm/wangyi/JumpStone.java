package algorithm.wangyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 跳石板 问题描述： 小易来到了一条石板路前，每块石板上从1挨着编号为：1、2、3....... 这条石板路要根据特殊的规则才能前进：对于小易当前所在的编号为K的 石板
 * ，小易单次只能往前跳K的一个约数(不含1和K)步， 即跳到K+X(X为K的一个非1和本身的约数)的位置。 小易当前处在编号为N的石板，他想跳到编号恰好为M的石板去，
 * 小易想知道最少需要跳跃几次可以到达。 例如： N = 4，M = 24： 4->6->8->12->18->24 于是小易最少需要跳跃5次，就可以从4号石板跳到24号石板 输入描述：
 * 输入为一行，有两个整数N，M，以空格隔开。 (4 ≤ N ≤ 100000) (N ≤ M ≤ 100000) 输出描述： 输出小易最少需要跳跃的步数,如果不能到达输出-1
 * 
 * date:2018.5.30
 * state:doubt
 */
public class JumpStone {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNextInt()) {
      int n = in.nextInt();
      int m = in.nextInt();
      int arr[] = getArr(n);
      int dis = m - n;
      int[] dp = new int[dis + 1];
      dp[0] = 0;
      dp[1] = -1;
      for (int i = 0; i <= dis; i++) {
        for (int j = 0; j < arr.length; j++) {
          if (i >= arr[j]) {
            dp[i] = dp[i - arr[j]] + 1;
          }
        }
      }
      System.out.println(dp[dis]);
    }
    in.close();
  }


  public static int[] getArr(int n) {
    List<Integer> list = new ArrayList<>();
    for (int i = 2; i < Math.sqrt(n); i++) {
      if (n % i == 0) {
        list.add(i);
        if(n%i!=i){
          list.add(n/i);
        }
      }
    }
    int[] arr = new int[list.size()];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = list.get(i);
    }
    return arr;

  }

  

  
   

}
