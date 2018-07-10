package algorithm.wangyi;

import java.util.Scanner;

/*
 * 问题描述：
 *  小易是一个数论爱好者，并且对于一个数的奇数约数十分感兴趣。
 *  一天小易遇到这样一个问题： 定义函数f(x)为x最大的奇数约数，x为正整数。
 *   例如:f(44) = 11.
 * 现在给出一个N，需要求出 f(1) + f(2) + f(3).......f(N) 
 * 例如： N = 7 f(1) + f(2) + f(3) + f(4) + f(5) + f(6) + f(7) = 1 + 1 + 3 + 1 + 5 + 3 + 7 = 21
 * 小易计算这个问题遇到了困难，需要你来设计一个算法帮助他。
 *  输入描述： 
 *  输入一个整数N (1 ≤ N ≤ 1000000000)
 *  输出描述：
 *   输出一个整数，即为f(1) + f(2) + f(3).......f(N)
 *    思路： 
 *    date：2018.6.4
 * 
 */
public class LargestOddNum {
  public static void main(String[] args) {
   Scanner in=new Scanner(System.in);
   while (in.hasNextInt()) {
     int n=in.nextInt();
     int num=0;
    for(int i=1;i<=n;i++){
      num+=getNum(i);
    }
    System.out.println(num);
  }
   in.close();
  }
  
  private static int getNum(int n) {
     if(n%2!=0){
       return n;
     }else{
       int num=n/2;
       return getNum(num);
     }
    
  }
}
