package com.tz.algorithm.path;

import java.util.Scanner;
/*
 * 时间复杂度 O(n^2)
 */
public class Dijkstra {
  
  
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  int vertex=in.nextInt();
  int edge=in.nextInt();
  //使用邻接矩阵存储图，初始化
  int [][]arr=new int[vertex][vertex];
  Node[]dis=new Node[vertex];
  for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[0].length; j++) {
      arr[i][j]=Integer.MAX_VALUE;
    }
  }
  
  //使用邻接矩阵存储图的结构
  for (int i = 0; i < edge; i++) {
    int head=in.nextInt();
    int end=in.nextInt();
    int value=in.nextInt();
        
     arr[head-1][end-1]=value;
  }
  //输出邻接矩阵
  for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr.length; j++) {
      if(arr[i][j]!=Integer.MAX_VALUE){
        System.out.print(arr[i][j]+" ");
      }else{
        System.out.print("∞ ");
      }
     
    }
    System.out.println();
  }
  
  
  for (int i = 0; i < dis.length; i++) {
    dis[i]=new Node("", 0, false);
  }
  //初始化dis数组,以v0为起点
  for (int i = 0; i < dis.length; i++) {
    dis[i].value=arr[0][i];
    dis[i].path="v"+0+"->v"+i;
  }
   
  dis[0].value=0;
  dis[0].path="";
  dis[0].visited=true;
  
  int count=1;
  while (count!=vertex) {
    //index 记录value最小值的下标
    int index=0;
    int min=Integer.MAX_VALUE;
    for (int i = 0; i < dis.length; i++) {
      if(!dis[i].visited&&dis[i].value<min){
        min=dis[i].value;
        index=i;
     
      }
    }
    
    dis[index].visited=true;
    count++;
    for (int i = 0; i < dis.length; i++) {
      //当前加入集合的点是否到顶点vi是否可达
      if(!dis[i].visited&&arr[index][i]!=Integer.MAX_VALUE&&
          (dis[index].value+arr[index][i]<dis[i].value)){
        dis[i].value=dis[index].value+arr[index][i];
        dis[i].path=dis[index].path+"->v"+i;
      }
    }
    
   
  }
  //输出从顶点vo到各顶点的最短距离
  
  for (int i =1; i < dis.length; i++) {
    if(dis[i].value!=Integer.MAX_VALUE){
      System.out.println(dis[i].path+"="+dis[i].value);
    }else {
      System.out.println(dis[i].path+"没有最短路径");
    }
  }
  
  in.close();
}

public static class Node{
  String path;
  int value;
  //表示这个顶点是否已经找到从v0到该顶点的最小距离
  boolean visited;
  public Node(String path, int value, boolean visited) {

    this.path = path;
    this.value = value;
    this.visited = visited;
  }
  
}




}
