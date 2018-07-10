package algorithm.wacai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 水仙花数
 */
public class NumGame {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNext()) {
    
    int begin=in.nextInt();
    int end=in.nextInt();
    List<Integer>list=new ArrayList<>();
    for(int i=begin;i<=end;i++){
      if(judge(i)){
        list.add(i);
      }
    }
    
    if(list.size()==0){
      System.out.println("no");
    }else {
      for(int i=0;i<list.size();i++){
        if(i!=list.size()-1){
          System.out.print(list.get(i)+" ");
        }else {
          System.out.print(list.get(i));
        }
      }
    }
    
  }
  in.close();
}

public static boolean judge(int num){
  String temp=num+"";
  char[]arr=temp.toCharArray();
  int count=0;
  for (int i = 0; i < arr.length; i++) {
    int single=Integer.parseInt(arr[i]+"");
    int third=single*single*single;
    count+=third;
  }
  if(count==num){
    return true;
  }else {
    return false;
  }
}

}
