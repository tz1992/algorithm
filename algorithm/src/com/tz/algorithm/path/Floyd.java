package com.tz.algorithm.path;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Floyd 算法，适用于有向图和无向图
 * 
 * path[i][j]=k表示从i到j的最短路径需要经过点k
 * 当path[i][j]=j 时表示从点i到点j不需要经过其他点
 */
public class Floyd {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  //kind区分有向图和无向图 1表示有向图，2表示无向图
  int kind=in.nextInt();
  int vertex=in.nextInt();
  int edge=in.nextInt();
  int[][]values=new int[vertex][vertex];
  int [][]path=new int[vertex][vertex];

  for (int i = 0; i < values.length; i++) {
    for (int j = 0; j < values.length; j++) {
      //初始化数组,使得数组最开始不可达
      values[i][j]=Integer.MAX_VALUE;
      //初始化path数组，表明最开始从i点到j点最开始不需要经过其他点
      path[i][j]=j;
    }
  }
  
  //使用邻接矩阵存储图
  for (int i = 0; i < edge; i++) {
    int first=in.nextInt();
    int end=in.nextInt();
    int weight=in.nextInt();
    if(kind==1){
      values[first-1][end-1]=weight;
    }else {
      values[first-1][end-1]=weight;
      values[end-1][first-1]=weight;
    }
    
  }
  in.close();
  
  for (int i = 0; i < path.length; i++) {
    for (int j = 0; j < path.length; j++) {
      if(values[i][j]!=Integer.MAX_VALUE){
        System.out.print(values[i][j]+" ");
      }else {
        System.out.print("∞ ");
      }
    }
    System.out.println();
  }
  
  for (int i = 0; i < vertex; i++) {
    for (int j = 0; j < vertex; j++) {
      for (int k = 0; k < vertex; k++) {
        if((values[j][k]>values[j][i]+values[i][k])
            &&values[j][i]!=Integer.MAX_VALUE&&values[i][k]!=Integer.MAX_VALUE){
           values[j][k]=values[j][i]+values[i][k];
           //表明从j到k中间需要经过点i;
         path[j][k]=i;
        }
      }
    }
  }
  //输出从最开始的顶点到其他点的最短路径
  for (int i = 1; i < path.length; i++) {
    if(values[0][i]==Integer.MAX_VALUE){
      System.out.println("从vo到v"+i+"没有最短路径");
    }else {
      System.out.print("从v0到V"+i+"的最短路径为:v0->");
     List<Integer>list=new ArrayList<>();
     int temp=path[0][i];
      while (temp!=i) {
        list.add(temp);
      temp=path[temp][i];
      
      }
      
      if(list.size()!=0){
        
        for(Integer e:list){
          System.out.print("v"+e+"->");
        }
      }
      System.out.print("v"+i+"="+values[0][i]);
      System.out.println();
      
    }
  }
}
}
