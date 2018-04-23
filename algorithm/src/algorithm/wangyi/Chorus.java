package algorithm.wangyi;

import java.util.Scanner;

/*
 * 问题描述：
 * 有 n 个学生站成一排，每个学生有一个能力值，
 * 牛牛想从这 n 个学生中按照顺序选取 k 名学生，
 * 要求相邻两个学生的位置编号的差不超过 d，
 * 使得这 k 个学生的能力值的乘积最大，你能返回最大的乘积吗？
 * 
 * 输入描述：
 * 每个输入包含 1 个测试用例。
 * 每个测试数据的第一行包含一个整数 n (1 <= n <= 50)，
 * 表示学生的个数，接下来的一行，包含 n 个整数，
 * 按顺序表示每个学生的能力值 ai（-50 <= ai <= 50）。
 * 接下来的一行包含两个整数，k 和 d (1 <= k <= 10, 1 <= d <= 50)。
 * 
 * 
 * 思路：用max[k][i]表示选取k个数最后选的数的位置是i的最大值,min[k][i]选取k个数最后选的数的位置是i的最小值
 * min的出现是为了维护在出现负数的情况
 * max[m][i]=Max{max[m][i],max{max[m-1][j]*arr[i],min[m-1][j]*arr[i]}
 * 
 * 并有约束条件i-j<=d
 */    
public class Chorus {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	while(in.hasNextInt()){
		int n =in.nextInt();
		int[]arr=new int[n+1];
		for (int i = 1; i < arr.length; i++) {
			arr[i]=in.nextInt();
		}
		int k=in.nextInt();
		int d=in.nextInt();
		long[][]max=new long[k+1][n+1];
		long[][]min=new long[k+1][n+1];
		for(int i=1;i<=n;i++){
			max[1][i]=arr[i];
			min[1][i]=arr[i];
			for(int m=2;m<=k;m++){
				for(int j=i-1;j>=1&&i-j<=d;j--){
					max[m][i]=Math.max(max[m][i], Math.max(max[m-1][j]*arr[i], min[m-1][j]*arr[i]));
					min[m][i]=Math.min(min[m][i], Math.min(max[m-1][j]*arr[i], min[m-1][j]*arr[i]));
				}
			}
		}
		long maxs=Integer.MIN_VALUE;
		for(int i=1;i<=n;i++){
			if(maxs<max[k][i]){
				maxs= max[k][i];
			}
		}
                System.out.println(maxs);
	}
	in.close();
	
}
}
