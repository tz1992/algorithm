package traversal;

import java.util.ArrayList;

public class Enum {
 public static ArrayList<String>list=new ArrayList<>();
 public static int[]flag;
 public static char[]seq;
public static void main(String[] args) {
  char[]arr={'1','2','3','4'};
  //判断当前是否使用
  flag=new int[arr.length];
  for (int i = 0; i < flag.length; i++) {
    flag[i]=0;
  }
  seq=new char[arr.length-1];
  get(arr, 0);
  for(String s:list){
    System.out.println(s);
  }
}

public static void get(char[]arr,int step){
 
  if(step==3){
   String str="";
   for (int i = 0; i < arr.length-1; i++) {
    str+=seq[i];
  }
   list.add(str);
   return ;
    
  }
  for (int i = 0; i < arr.length; i++) {
    if(flag[i]==0){
      seq[step]= arr[i];
      flag[i]=1;
      get(arr, step+1);
      flag[i]=0;//回退
    }
   
  }
 
}
}
