package algorithm.wangyi;

import java.util.Arrays;
import java.util.Scanner;

/*问题描述：
 * 考拉有n个字符串字符串，任意两个字符串长度都是不同的。考拉最近学习到有两种字符串的排序方法： 1.根据字符串的字典序排序。例如：
   "car" < "carriage" < "cats" < "doggies < "koala"
   2.根据字符串的长度排序。例如：
   "car" < "cats" < "koala" < "doggies" < "carriage"
         考拉想知道自己的这些字符串排列顺序是否满足这两种排序方法，考拉要忙着吃树叶，所以需要你来帮忙验证。
         
       输入描述：
       输入第一行为字符串个数n(n ≤ 100)
       接下来的n行,每行一个字符串,字符串长度均小于100，均由小写字母组成
 *
 */
public class TwoSorts {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			int n = Integer.parseInt(in.nextLine());
			String[] arr = new String[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = in.nextLine();
			}
			boolean isLenth = false;
			boolean isLookup = false;
			int lengths[] = new int[n];
			for (int i = 0; i < arr.length; i++) {
				lengths[i] = arr[i].length();
			}

			if (isSort(lengths)) {
				isLenth = true;
			}

			if (isLookup(arr)) {
				isLookup = true;

			}

			if (isLenth && isLookup) {
				System.out.println("both");
			} else if (isLenth) {
				System.out.println("lengths");
			} else if (isLookup) {
				System.out.println("lexicographically");
			} else {
				System.out.println("none");
			}

		}
		in.close();
	}

	public static boolean isSort(int[] arr) {
		
		int count = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]<=arr[i+1]){
				count++;
			}
		}
		if (count == (arr.length-1)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isLookup(String[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int cp = arr[i].compareTo(arr[i + 1]);
			if (cp < 0) {
				count++;
			}

		}
		if (count == (arr.length - 1)) {
			return true;
		} else {
			return false;
		}
	}
}
