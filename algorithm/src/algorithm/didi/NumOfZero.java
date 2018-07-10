package algorithm.didi;
/*
 * 问题描述：
 * 输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,所以答案为2
 * 输入描述：
 * 输入为一行，n(1 ≤ n ≤ 1000)
 * 输出描述：
 * 输出一个整数,即题目所求
 */
import java.util.Scanner;

public class NumOfZero {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNextInt()) {
    int n=in.nextInt();
    int count=0;
    for(int i=1;i<=n;i++){
      count+=getCount(i);
     
    }
    System.out.println(count);
  }
  in.close();
}
public static int getCount(int i){
  int count=0;
  while(i%5==0){
    count++;
    i=i/5;
  }
  return count;
}
}
