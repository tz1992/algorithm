package algorithm.wangyi;

import java.util.Scanner;

/*
 * 地牢逃脱
 */
public class PIt {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNext()) {
    int n=in.nextInt();
    int  m=in.nextInt();
    String[][]arr=new String[n][m];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j]=in.next();
      }
    }
    int x0=in.nextInt();
    int y0=in.nextInt();
    int k=in.nextInt();
    int [][]steps=new int[k][2];
    for (int i = 0; i < steps.length; i++) {
      for (int j = 0; j < steps[0].length; j++) {
        steps[i][j]=in.nextInt();
      }
    }
    
    int [][]dp=new int[n][m];
    for (int i = 0; i < dp.length; i++) {
      
    }
  }
  in.close();
}
}
