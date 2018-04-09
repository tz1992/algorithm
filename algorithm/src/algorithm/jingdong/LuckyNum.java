package algorithm.jingdong;

/*
 * 
小明同学学习了不同的进制之后，拿起了一些数字做起了游戏。
小明同学知道，在日常生活中我们最常用的是十进制数
，而在计算机中，二进制数也很常用。现在对于一个数字x，
小明同学定义出了两个函数f(x)和g(x)。
 f(x)表示把x这个数用十进制写出后各个数位上的数字之和。
 如f(123)=1+2+3=6。 g(x)表示把x这个数用二进制写出后各个数位上的数字之和。
 如123的二进制表示为1111011，那么，g(123)=1+1+1+1+0+1+1=6。 
 小明同学发现对于一些正整数x满足f(x)=g(x)，他把这种数称为幸运数，
 现在他想知道，小于等于n的幸运数有多少个？ 
 
 输入描述：
 每组数据输出一行，小于等于n的幸运数个数。
 主要目的：
 将十进制的数转化为二进制
 先计算出二进制的位数
 从高位到低位一步步计算
 
 */
import java.util.Scanner;

public class LuckyNum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (isLuckyNum(i)) {
				count++;
			}
		}
		System.out.println(count);
	}

	private static boolean isLuckyNum(int i) {
		String string = i + "";
		char[] arr = string.toCharArray();
		int total1 = 0;
		for (int j = 0; j < arr.length; j++) {
			int temp = Integer.parseInt(arr[j] + "");
			total1 = total1 + temp;
		}

		int j = 0;
		while (i >= 1 << j) {
			j++;
		}
		int wei = j;

		int total2 = 0;
		int temp2 = i;
		for (int n = wei; n > 0; n--) {

			if (temp2 >= (1 << n - 1)) {
				temp2 = temp2 - (1 << n - 1);
				total2++;
			}
		}
		if (total1 == total2) {
			return true;
		} else {
			return false;
		}

	}
}
