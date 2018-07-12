package algorithm.chart.matrix;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

/*
 * 广度优先遍历，使用邻接矩阵存储图信息,针对无向图
 */
public class BFS {
//邻接矩阵
private static int[][]dis;
//顶点的访问情况
private  static boolean[]visited;
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNextInt()) {
    int vertex=in.nextInt();
    dis=new int[vertex][vertex];
    for (int i = 0; i < dis.length; i++) {
      for (int j = 0; j < dis.length; j++) {
        dis[i][j]=0;
      }
    }
    visited=new boolean[vertex];
    for (int i = 0; i < visited.length; i++) {
      visited[i]=false;
    }
    int edges=in.nextInt();
    for(int i=0;i<edges;i++){
      int s=in.nextInt();
      int e=in.nextInt();
      dis[s][e]=1;
      dis[e][s]=1;
    }
    
    print(dis);
    System.out.print("图的广度优先遍历为：");
    bfs(0, vertex, visited, dis);
    
  }
  in.close();
}

public static void print(int [][]dis){
  for (int i = 0; i < dis.length; i++) {
    for (int j = 0; j < dis[0].length; j++) {
      System.out.print(dis[i][j]+" ");
    }
    System.out.println();
  }
}

public static void bfs(int v,int vertex,boolean[]visited,int [][]dis){
  Queue<Integer>queue=new LinkedBlockingQueue<>();
  queue.add(v);
  visited[v]=true;
  System.out.print(v+" ");
  while (!queue.isEmpty()) {
    Integer temp=queue.poll();
    for (int i = 0; i < vertex; i++) {
      if(dis[temp][i]==1&&!visited[i]){
        System.out.print(i+" ");
        queue.add(i);
        visited[i]=true;
        
      }
    }
  }
}
}
