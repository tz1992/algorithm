package algorithm.didi;

import java.util.Scanner;

/*
 * 问题描述：
 * 给定一个十进制数M，以及需要转换的进制数N。将十进制数M转化为N进制数
 * 输入描述：
 * 输入为一行，M(32位整数)、N(2 ≤ N ≤ 16)，以空格隔开。
 * 输出描述：
 * 为每个测试实例输出转换后的数，每个输出占一行。如果N大于9，
 * 则对应的数字规则参考16进制（比如，10用A表示，等等）
 * 
 */
public class RadixTransfer {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  char[]arr={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
  while (in.hasNextInt()) {
    int num=in.nextInt();
    int b=0;
    if(num>=0){
      b=num;
    }else {
      b=-num;
    }
    int radix=in.nextInt();
    int i=0;
    while (Math.pow(radix, i)<=b) {
      i++;
    }
    int an=0;
    if(Math.pow(radix, i)<=b){
      an=i;
    }else {
      an=i-1;
    }
    
    String out="";
    for(int j=an+1;j>=1;j--){
      int temp=(int) Math.pow(radix, j-1);
      int a=b/temp;
      b=b-a*temp;
      out+=arr[a];
    }
    if(num>=0){
      System.out.println(out);
    }else {
      System.out.println("-"+out);
    }
   
  }
  in.close();
}


}
