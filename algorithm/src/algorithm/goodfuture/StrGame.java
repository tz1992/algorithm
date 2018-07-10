package algorithm.goodfuture;

import java.util.Scanner;

/*
 * 好未来/倒置字符串
 */
public class StrGame {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNextLine()) {
    String str=in.nextLine();
    String[]arr=str.split(" ");
    
    for (int i = arr.length-1; i >0; i--) {
      System.out.print(arr[i]+" ");
    }
    System.out.print(arr[0]);
  }
  in.close();
 
}
}
