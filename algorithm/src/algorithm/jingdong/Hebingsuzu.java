package algorithm.jingdong;

/*
 * 将两个数组合并
 * 思路：
 * 使用集合Set,利用它的不可重复的性质
 * 然而转化为数组进行排序
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hebingsuzu {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int[] arr1 = new int[m];
		int[] arr2 = new int[n];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = in.nextInt();
		}

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = in.nextInt();
		}
		in.close();
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < m + n; i++) {
			if (i >= m) {
				if (!set.contains(arr2[i - m])) {
					set.add(arr2[i - m]);
				}
			} else {
				if (!set.contains(arr1[i])) {
					set.add(arr1[i]);
				}
			}
		}
		Object[] objects = set.toArray();
		Arrays.sort(objects);
		for (int i = 0; i < objects.length; i++) {
			if (i == objects.length - 1) {
				System.out.print(objects[i]);
			} else {
				System.out.print(objects[i] + " ");
			}

		}
	}
}
