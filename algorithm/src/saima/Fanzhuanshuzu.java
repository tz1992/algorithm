package saima;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 基本算法/翻转数组
 */
public class Fanzhuanshuzu {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNext()) {
    int n=in.nextInt();
    int []arr=new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i]=in.nextInt();
    }
    int []temp=new int[n];
    for (int i = 0; i < temp.length; i++) {
      temp[i]=arr[i];
    }
    Arrays.sort(temp);
    int first = 0;
    int last = 0;
    for (int i = 0; i < temp.length; i++) {
      if(temp[i]!=arr[i]){
        first=i;
        break;
      }
    }
    
    for(int i=temp.length-1;i>=0;i--){
      if(temp[i]!=arr[i]){
        last=i;
        break;
      }
    }
    boolean flag=true;
    for(int i=first;i<=last;i++){
      if(temp[i]!=arr[last-i+first]){
        flag=false;
        break;
      }
    }
    if(flag){
      System.out.println("yes");
    }else {
      System.out.println("no");
    }
    
  }
  in.close();
}
}
