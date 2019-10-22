package saima.baidu;
/**
 * topk
 * 大根堆
 */
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      int n = in.nextInt();
      int m = in.nextInt();
      int k = in.nextInt();
      List<Integer>list=new ArrayList<>();
      int[]arr=new int[k];
     for(int i=0;i<n;i++){
       for (int j = 0; j < m; j++) {
        if(i*m+j<k){
          list.add((i+1)*(j+1));
        }else {
          break;
        }
      }
     }
  
    for (int i = 0; i < arr.length; i++) {
      arr[i]=list.get(i);
    }
    buildMaxHeap(arr);
    for(int i=0;i<n;i++){
      for (int j = 0; j < m; j++) {
       if(i*m+j<k){
         continue;
       }else{
         int temp=(i+1)*(j+1);
         if(temp<arr[0]){
           arr[0]=temp;
           buildMaxHeap(arr);
         }
       }
     }
    }
    System.out.println(arr[0]);
     
    }
    in.close();

  }
  
  public static int[] buildMaxHeap(int[]arr){
    //从最后一个节点的根节点开始调整
    for(int i=(arr.length-1-1)/2;i>=0;i--){
      adjust(arr, i, arr.length);
    }
    return arr;
  }
  
  public static void adjust(int[]arr,int k,int length){
      int temp=arr[k];
      for(int i=2*k+1;i<length-1;i=2*i+1){//i为初始化为节点k的左孩子，沿节点较大的子节点向下调整
        //取节点较大的子节点的下标
        if(i<length&&arr[i]<arr[i+1]){
          i++;//如果节点的右孩子>左孩子，则取右孩子节点的下标
        }
        
        if(temp>=arr[i]){
          break;//根节点 >=左右子女中关键字较大者，调整结束
        }else { //根节点 <左右子女中关键字较大者
          arr[k]=arr[i];
          k=i;
        }
      }
      arr[k]=temp;
  }
}
