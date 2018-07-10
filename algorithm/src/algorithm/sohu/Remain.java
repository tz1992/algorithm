package algorithm.sohu;

import java.util.Scanner;

/*
 * 保留最大的数
 */
public class Remain {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      String s1 = in.next();
      String s2 = in.next();

      int n = Integer.parseInt(s2);
      
      while (n > 0) {
       for(int i=9;i>=0;i--){
         int index=s1.indexOf(i+"");
         if(index!=-1&&index<=n){
           System.out.print(i);
           n=n-index;
           s1=s1.substring(index+1);
           //如果剩余的需要删除的个数与剩下的s1的长度相同，那么说明此方法已经可以结束了
           if(n==s1.length()){
             return;
           }
          break;
         }
       }
      }
     System.out.println(s1);
 
    }
    in.close();

  }

  
}
