package algorithm.wangyi;

import java.util.Scanner;

/*
 * 问题描述
 * 你就是一个画家！你现在想绘制一幅画，
 * 但是你现在没有足够颜色的颜料。为了让问题简单，
 * 我们用正整数表示不同颜色的颜料。
 * 你知道这幅画需要的n种颜色的颜料，
 * 你现在可以去商店购买一些颜料，
 * 但是商店不能保证能供应所有颜色的颜料，
 * 所以你需要自己混合一些颜料。
 * 混合两种不一样的颜色A和颜色B颜料可以产生(A XOR B)这种颜色的颜料(新产生的颜料也可以用作继续混合产生新的颜色,XOR表示异或操作)。
 * 本着勤俭节约的精神，你想购买更少的颜料就满足要求，所以兼职程序员的你需要编程来计算出最少需要购买几种颜色的颜料？
 */
public class MixedPigment {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	while (in.hasNextInt()) {
		int n=in.nextInt();
		int []arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=in.nextInt();
		}
	}
	in.close();
}
}
