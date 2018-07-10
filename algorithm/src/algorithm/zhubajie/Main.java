package algorithm.zhubajie;

import java.util.Scanner;

/*
 * 数串
 */
public class Main {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNext()) {
    int n=in.nextInt();
    int[]arr=new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i]=in.nextInt();
    }
    
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length-i-1; j++) {
        if(compare(arr[j], arr[j+1])){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    for (int i = arr.length-1; i >= 0; i--) {
      System.out.print(arr[i]);
    }
  }
  in.close();
}

public static boolean compare(int a,int b){
  String s1=a+"";
  String s2=b+"";
  int t1=Integer.parseInt(s1+s2);
  int t2=Integer.parseInt(s2+s1);
  if(t1>t2){
    return true;
  }else {
    return false;
  }
}
}
