package algorithm.toutiao;

import java.util.Scanner;

/*
 * 头条/异或
 */
public class XOR {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNextInt()) {
    int n=in.nextInt();
    int m=in.nextInt();
    int arr[]=new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i]=in.nextInt();
      
    }
    int count=0;
    for (int i = 0; i < arr.length-1; i++) {
      for (int j = i+1; j < arr.length; j++) {
        long temp=arr[i]^arr[j];
        if(temp>m){
          count++;
        }
      }
    }
    System.out.println(count);
  }
  in.close();
}
}
