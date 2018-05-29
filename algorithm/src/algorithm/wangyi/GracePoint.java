package algorithm.wangyi;

import java.util.Scanner;
/*
 * 问题描述：
 * 小易有一个圆心在坐标原点的圆，小易知道圆的半径的平方。
 * 小易认为在圆上的点而且横纵坐标都是整数的点是优雅的，
 * 小易现在想寻找一个算法计算出优雅的点的个数，请你来帮帮他。
      例如：半径的平方如果为25
      优雅的点就有：(+/-3, +/-4), (+/-4, +/-3), (0, +/-5) (+/-5, 0)，一共12个点。
      输入描述：
      输入为一个整数，即为圆半径的平方,范围在32位int范围内。
   date：2018.5.29
 */
public class GracePoint {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNextInt()) {
    int n=in.nextInt();
    int m=(int) Math.sqrt(n);
    if(m*m==n){
      int count=4;
      for(int i=1;i<m;i++){
        int temp=n-i*i;
        int temp2=(int) Math.sqrt(temp);
        if(temp2*temp2==temp){
          count+=4;
        }
      }
      System.out.println(count);
    }else{
      int count =0;
      for(int i=1;i<=m;i++){
        int temp=n-i*i;
        int temp2=(int) Math.sqrt(temp);
        if(temp2*temp2==temp){
          count+=4;
        }
      }
      System.out.println(count);
    }
    
   
  }
  
  in.close();
}
}
