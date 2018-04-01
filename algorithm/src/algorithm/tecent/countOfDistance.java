package algorithm.tecent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 小Q今天在上厕所时想到了这个问题：有n个数，两两组成二元组，差最小的有多少对呢？差最大呢？
 * 输入描述;
 * 第一行  数组大小
 * 第二行  数组
 * 输出 第一个数   差最小的对数
 *     第二个数  差最大的对数
 *     
 *  思路：1 求差值
 *       2，对差值进行排序
 *       3，计算各自个数
 *       
 *   优化思路：
 *   1，先排序(最好的时间复杂度较低的排序算法)
 *   2，差值最大的个数=maxNum*minNum
 *   3,对新的有序数组生成新的差值数组
 *   4，求最小差值的个数
 *  
 */
public class countOfDistance {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  int n=in.nextInt();
  int[]arr=new int[n];
  for (int i = 0; i < arr.length; i++) {
    arr[i]=in.nextInt();
  }
  in.close();
  List<Integer> list=new ArrayList<Integer>();
  for (int i = 0; i < arr.length; i++) {
    for (int j = i+1; j < arr.length; j++) {
      list.add(Math.abs(arr[i]-arr[j]));
    }
  }
  
  Object[]objects=list.toArray();
  for (int i = 0; i < objects.length; i++) {
    for (int j = 0; j < objects.length-1-i; j++) {
      if((int)objects[j]>(int)objects[j+1]){
       Object temp=objects[j];
       objects[j]=objects[j+1];
       objects[j+1]=temp;
      }
    }
  }
  
  int min=(int) objects[0];
  int maxNum=0;
  int minNum=0;
  int max=(int)objects[objects.length-1];
  for (int i = 0; i < objects.length; i++) {
    if((int)objects[i]==min){
      minNum++;
    }
    if((int)objects[i]==max){
     maxNum++;
    }
  }
      System.out.print(minNum+"  ");  
      System.out.print(maxNum+"  ");  
   }

}
