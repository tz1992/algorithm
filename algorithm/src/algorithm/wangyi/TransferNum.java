package algorithm.wangyi;

/*
 * 问题描述： 对于一个整数X，定义操作rev(X)为将X按数位翻转过来，
 * 并且去除掉前导0。例如: 如果 X = 123，则rev(X) = 321; 如果 X = 100，则rev(X) = 1.
 * 现在给出整数x和y,要求rev(rev(x) + rev(y))为多少？
 * 输入描述：输入为一行，x、y(1 ≤ x、y ≤ 1000)，以空格隔开
 * 输出描述：输出rev(rev(x) + rev(y))的值
 * 
 */
import java.util.Scanner;

public class TransferNum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNextInt()) {
      int num1 = in.nextInt();
      int num2 = in.nextInt();
      System.out.println(trans(trans(num1) + trans(num2)));
    }
    in.close();
  }

  private static int trans(int n) {
    String temp = n + "";
    char[] arr = temp.toCharArray();
    String finals = "";
    for (int i = arr.length - 1; i >= 0; i--) {
      finals += arr[i];
    }
    int num = Integer.parseInt(finals);
    return num;
  }
}
