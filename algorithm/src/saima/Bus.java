package saima;

import java.util.Scanner;

/**
 * 
 * @author HP
 * 基本算法/公交车乘客
 *
 */
public class Bus {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNext()) {
    int n=in.nextInt();
    int temp=0;
    int max=Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      int a=in.nextInt();
      int b=in.nextInt();
      temp+=(b-a);
      if(temp>=max){
        max=temp;
      }
    }
    System.out.println(max);
  }
  in.close();
}
}
