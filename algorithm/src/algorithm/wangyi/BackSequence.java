package algorithm.wangyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 问题描述：
 * 如果一个数字序列逆置之后跟原序列是一样的就称这样的数字序列为回文序列。例如：
   {1, 2, 1}, {15, 78, 78, 15} , {112} 是回文序列, 
   {1, 2, 2}, {15, 78, 87, 51} ,{112, 2, 11} 不是回文序列。
        现在给出一个数字序列，允许使用一种转换操作：
         选择任意两个相邻的数，然后从序列移除这两个数，并用这两个数字的和插入到这两个数之前的位置(只插入一个和)。
         现在对于所给序列要求出最少需要多少次操作可以将其变成回文序列。
         输入描述  ： 
         输入为两行，第一行为序列长度n ( 1 ≤ n ≤ 50) 第二行为序列中的n个整数item[i] (1 ≤ iteam[i] ≤ 1000)，以空格分隔。
         输出描述：
         输出一个数，表示最少需要的转换次数     
 */
public class BackSequence {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			int n = in.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = in.nextInt();
			}
			List<Integer> list = new ArrayList<>();

			for (int i = 0; i < arr.length; i++) {
				list.add(arr[i]);
			}

			int num = 0;
			while (list.size() > 1) {
				if (list.get(0) < list.get(list.size() - 1)) {
					int a = list.get(0);
					int b = list.get(1);
					list.set(0, a + b);
					list.remove(1);
					num++;
				} else if (list.get(0) > list.get(list.size() - 1)) {

					int a = list.get(list.size() - 1);
					int b = list.get(list.size() - 2);
					list.set(list.size() - 2, a + b);
					list.remove(list.size() - 1);
					num++;
				}else{
					list.remove(list.size() - 1);
					list.remove(0);
				}

			}
			System.out.println(num);
		}
		in.close();
	}

	
}
