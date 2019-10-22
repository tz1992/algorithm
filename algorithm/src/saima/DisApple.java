package saima;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author tz
 * 基本算法/分苹果
 *
 */
public class DisApple {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNext()) {
    int n=in.nextInt();
    List<Integer>list=new ArrayList<>();
    for(int i=1;i<=10000000;i++){
      if(judge(i, n)){
        list.add(i);
      }
    }
    long ans=0;
    
    for(Integer e:list){
      int count=0;
      e=(e/(n-1))*n+1;
      for(int i=1;i<n-1;i++){
        if(judge(e, n)){
          e=(e/(n-1))*n+1;
          count++;
        }else {
          break;
        }
      }
      if(count==n-2){
        ans=e;
        break;
        
      }
    }
    System.out.println(ans);
  }
  in.close();
}

public static boolean judge(int temp,int n){
  if(temp%(n-1)==0&&(temp-1)%n==0){
    return true;
  }else {
    return false;
  }
}

}
