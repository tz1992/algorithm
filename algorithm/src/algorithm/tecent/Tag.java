package algorithm.tecent;

import java.util.Scanner;

/*
 * 腾讯/游戏任务标记
 */
public class Tag {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNextInt()) {
    int first=in.nextInt();
    int second=in.nextInt();
    if(!(second>=1&&second<=1024)){
      System.out.println(-1);
    }else{
      if(first==second){
        System.out.println(1);
      }else {
        System.out.println(0);
      }
    }
    
  }
  in.close();
}
}
