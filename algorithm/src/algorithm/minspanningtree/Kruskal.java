package algorithm.minspanningtree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * 最小生成树算法（无向图）
 * 克鲁斯卡算法
 * 加边
 * 使用并查集实现
 */
public class Kruskal {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    while (in.hasNext()) {
      int vertex=in.nextInt();
      int edgeNum=in.nextInt();
      Edge[]edges=new Edge[edgeNum];
      for(int i=0;i<edgeNum;i++){
        int s=in.nextInt();
        int e=in.nextInt();
        int value=in.nextInt();
        Edge edge=new Edge(s, e, value);
        edges[i]=edge;
      }
      //边对象按照权重的大小进行排序
      Arrays.sort(edges, new Comparator<Edge>() {

        @Override
        public int compare(Edge o1, Edge o2) {
          // TODO Auto-generated method stub
          return o1.value-o2.value;
        }});
      
      //使用并查集记录每个顶点的分类信息
      int[]sets=new int[vertex];
      for (int i = 0; i < sets.length; i++) {
        sets[i]=i;
      }
      int total=0;
      for (int i = 0; i < edges.length; i++) {
        int v1=edges[i].s;
        int v2=edges[i].e;
        int value=edges[i].value;
        if(!find(v1, v2, sets)){
          union(v1, v2, sets);
          total+=value;
          System.out.println("("+v1+","+v2+")的矩阵="+value);
        }
        
      }
      System.out.println(total);
      
    }
    in.close();
  }
  
  //将两个顶点进行合并，慢合并,将v1合并到v2
  public static void union(int v1,int v2,int[]sets){
    int temp=sets[v1];
    for (int i = 0; i < sets.length; i++) {
      if(sets[i]==temp){
        sets[i]=sets[v2];
      }
    }
  }
  
  //判断两个顶点是否属于同一颗子树,快查找
  public static boolean find(int v1,int v2,int []sets){
    if(sets[v1]==sets[v2]){
      return true;
    }else{
      return false;
    }
  }
  
  private static class Edge{
    int s;
    int e;
    int value;
    public Edge(int s, int e, int value) {
     
      this.s = s;
      this.e = e;
      this.value = value;
    }
    
  }
}
