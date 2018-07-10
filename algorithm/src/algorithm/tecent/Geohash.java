package algorithm.tecent;

import java.util.Scanner;

/*
 * 腾讯/geohash
 * 思路：二分查找
 */
public class Geohash {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNextInt()) {
    int n=in.nextInt();
    int left=-90;
    int right=90;
    for(int i=0;i<6;i++){
      int temp=(left+right)/2;
      if (temp<=n){
        left=temp;
        System.out.print(1);
      }else {
        right=temp;
        System.out.print(0);
        
      }
    }
  }
  in.close();
}
}
