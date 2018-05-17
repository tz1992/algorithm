package algorithm.wangyi;

import java.util.Scanner;

/*
 * 问题描述：
 * Fibonacci数列是这样定义的：
   F[0] = 0
   F[1] = 1
   for each i ≥ 2: F[i] = F[i-1] + F[i-2]
         因此，Fibonacci数列就形如：0, 1, 1, 2, 3, 5, 8, 13, ...，
         在Fibonacci数列中的数我们称为Fibonacci数。给你一个N，
         你想让其变为一个Fibonacci数，每一步你可以把当前数字X变为X-1或者X+1，
         现在给你一个数N求最少需要多少步可以变为Fibonacci数。
          输入：输入为一个正整数N(1 ≤ N ≤ 1,000,000)
          输出：输出一个最小的步数变为Fibonacci数"
    date：2018.5.16
 */
public class Fibonacci {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	while (in.hasNextInt()) {
		
		int n=in.nextInt();
		int t1=0;
		int t2=1;
		while (t1<n) {
			int temp=t1+t2;
			t1=t2;
			t2=temp;
			
		}
		
		int min=Math.min(Math.abs((t2-t1)-n), Math.abs(t1-n));
	System.out.println(min);
	}
	in.close();
}
}
