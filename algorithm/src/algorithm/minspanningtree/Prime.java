package algorithm.minspanningtree;
/*
 * 将所有顶点分为两个集合u和v
 * 最开始集合u中没有元素，visited=true,集合v中包含所有顶点 visited=false
 * 
 */
import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      int vertex = in.nextInt();
      int edgeNum = in.nextInt();
      Node[]nodes=new Node[vertex];
      for (int i = 0; i < nodes.length; i++) {
        nodes[i]=new Node(false);
      }
       int[][]dis=new int[vertex][vertex];
       //使用邻接矩阵存储图的信息，初始化图
       for (int i = 0; i < dis.length; i++) {
        for (int j = 0; j < dis[0].length; j++) {
          dis[i][j]=Integer.MAX_VALUE;
        }
      }
      for (int i = 0; i < edgeNum; i++) {
        int s = in.nextInt();
        int e = in.nextInt();
        int value = in.nextInt();
        //无向图
        dis[s][e]=value;
        dis[e][s]=value;
      }
      Node init=nodes[0];
      init.visited=true;
     /*
      * 最外层循环保证每次选取最小路径(一共完成vertex-1次完成)，
      * 里面两层循环找出每一次选取最小路径的时候
      * 选取的最小值(外层循环表示已经放入u集合中的元素)
      */
     
      int first=0;
      int last=0;
      int count =0;
    for (int i = 1; i < vertex; i++) {
      int min=Integer.MAX_VALUE;
      for (int j = 0; j <vertex; j++) {
        if(nodes[j].visited){
          for (int k = 0; k <vertex; k++) {
            if((min>dis[j][k])&&!nodes[k].visited&&dis[j][k]!=Integer.MAX_VALUE){
              min=dis[j][k];
              first=j;
              last=k;
              
            }
          }
          
        }
      
      }
      count+=min;
      if(!nodes[last].visited){
        nodes[last].visited=true;
        
      }
      System.out.println("("+first+","+last+")的矩阵="+min);
    }
    System.out.println(count);
    }
    in.close();
  }
  
  private static class Node{
    boolean visited;
    
    public Node(boolean visited) {
      super();
      this.visited = visited;
     
    }
    
  }
}
