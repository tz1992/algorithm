package algorithm.qunaer;
/*
 * 优雅的点
 * 思路：
 * 使用一个数组分段存储这些数
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelPrice {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNextInt()) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int []arr=new int[10002];
        while (in.hasNextInt()) {
          int s=in.nextInt();
          int e=in.nextInt();
          int p=in.nextInt();
          for (int i = s; i <=e; i++) {
            arr[i]=p;
          }
          if(max<e){
            max=e;
          }
          
          if(min>s){
            min=s;
          }
        }
        int count=0;
        int temp=arr[min];
        List<Node>list=new ArrayList<>();
        for (int i = min+1; i <= max+1; i++) {
          count++;
          
          if(arr[i]!=temp){
           
           Node node=new Node(i-count, i-1, temp);
           list.add(node);
            count=0;
            temp=arr[i];
            
          }
        }
        
        for (int i = 0; i < list.size(); i++) {
          if(list.get(i).p!=0){
            if(i!=list.size()-1){
              Node node=list.get(i);
              System.out.print("["+node.s+", "+node.e+", "+node.p+"],");
            }else {
              Node node=list.get(i);
              System.out.print("["+node.s+", "+node.e+", "+node.p+"]");
            }
          }
        }
    }

    in.close();
  }
  
  public static class Node{
    int s;
    int e;
    int p;
    public Node(int s, int e, int p) {
      
      this.s = s;
      this.e = e;
      this.p = p;
    }
    
  }

}
