package algorithm.chart.matrix;

import java.util.Scanner;
import java.util.Stack;

/*
 * dfs
 * 
 * 使用邻接矩阵来存储图，使用一维数组存储顶点的访问情况
 */
public class DFS {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNextInt()) {
    int vertix=in.nextInt();
    int edges=in.nextInt();
    int[][]dis=new int[vertix][vertix];
    for (int i = 0; i < dis.length; i++) {
      for (int j = 0; j < dis[0].length; j++) {
        dis[i][j]=0;
      }
    }
    boolean []visted=new boolean[vertix];
    for (int i = 0; i < visted.length; i++) {
      visted[i]=false;
    }
    //无向图，0表示不可达，1表示可达
    for(int i=0;i<edges;i++){
      int s=in.nextInt();
      int e=in.nextInt();
      dis[s][e]=1;
      dis[e][s]=1;
    }
    printChart(dis);
//    System.out.println("递归DFS遍历:");
//    dfsRecursion(0, vertix, visted, dis);
    System.out.println();
    System.out.println("非递归DFS遍历:");
    dfsNoRecursion(0, vertix, visted, dis);
  }
  in.close();
}
//从顶点v开始遍历，递归
public static void dfsRecursion(int v,int vertex,boolean[]visted,int[][]dis){
  if(v>=vertex||v<0){
    System.out.println("顶点错误");
  }
  System.out.print(v+" ");
  visted[v]=true;
  for (int i = 0; i < vertex; i++) {
    //当v和i可达，并且顶点i还没有访问的时候
    if(dis[v][i]==1&&!visted[i]){
      dfsRecursion(i, vertex, visted, dis);
    }
  }
  
}
//从顶点v开始遍历，非递归
public static void dfsNoRecursion(int v,int vertix,boolean[]visted,int[][]dis){
  if(v>=vertix||v<0){
    System.out.println("顶点错误");
  }
  Stack<Integer>stack=new Stack<>();
  stack.push(v);
  visted[v]=true;
  System.out.print(v+" ");
  while (!stack.isEmpty()) {
    Integer temp=stack.peek();
    int i;
    for ( i = 0; i < dis.length; i++) {
      if(dis[temp][i]==1&&!visted[i]){
        visted[i]=true;
        System.out.print(i+" ");
        stack.push(i);
        break;
      }
    }
    //当顶点的所有邻接点都访问完成之后，将该顶点出栈
    if(i==vertix){
      stack.pop();
    }
  }
}

public static void printChart(int[][]arr){
  for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[0].length; j++) {
      System.out.print(arr[i][j]+" ");
    }
    System.out.println();
  }
}
}
