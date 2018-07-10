package algorithm.tecent;

import java.util.Scanner;
/*
 * 腾讯/编码
 * 思路
 *16276=1+25*（1+25*（25+1））
 *651=1+25*（25+1）
 *26=1+25*1
 *这里的1代表的是这一位用占位符取代，表示这一位没有这个数 
 */
public class Recode {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNext()) {
    String s=in.next();
    int[]nums={16276,651,26,1};
    char[]arr=s.toCharArray();
    if(arr.length==1){
      int dis=arr[0]-'a';
      long  num=dis*nums[0]+1;
      System.out.println(num-1);
    }else if (arr.length==2) {
      int dis0=arr[0]-'a';
      int dis1=arr[1]-'a';
      long num=dis0*nums[0]+1+dis1*nums[1]+1;
      System.out.println(num-1);
    }else if (arr.length==3) {
      int dis0=arr[0]-'a';
      int dis1=arr[1]-'a';
      int dis2=arr[2]-'a';
      long num=dis0*nums[0]+1+dis1*nums[1]+1+dis2*nums[2]+1;
      System.out.println(num-1);
    }else {
      int dis0=arr[0]-'a';
      int dis1=arr[1]-'a';
      int dis2=arr[2]-'a';
      int dis3=arr[3]-'a';
      long num=dis0*nums[0]+1+dis1*nums[1]+1+dis2*nums[2]+1+dis3*nums[3]+1;
      System.out.println(num-1);
    }
  }
  in.close();
}
}
