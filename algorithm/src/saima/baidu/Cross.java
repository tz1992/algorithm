package saima.baidu;

import java.util.Scanner;

/*
 * 十字架
 */
public class Cross {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      int n = in.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < arr.length; i++) {
        arr[i] = in.nextInt();
      }
      for (int i = 0; i < arr.length; i++) {
        System.out.println("Case #" + (i + 1) + ":");
        print(arr[i]);
      }
    }
    in.close();
  }

  private static void print(int n) {
    int size = (int) Math.pow(3, n - 1);
    String [][]arr=new String[size][size];
    int index=size/2;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        arr[i][j]=" ";
      }
    }
    
    for (int i = 0; i < arr.length; i++) {
      arr[i][index]="o";
    }
    
    for (int i = 0; i < arr.length; i++) {
      arr[index][i]="o";
    }
    
    for (int i = 1; i < arr.length; i=i+3) {
      arr[index-1][i]="o";
      arr[index+1][i]="o";
    }
    
    for (int i = 1; i < arr.length; i=i+3) {
      arr[i][index-1]="o";
      arr[i][index+1]="o";
    }
    
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        System.out.print(arr[i][j]);
      }
      System.out.println();
    }

  }
}
