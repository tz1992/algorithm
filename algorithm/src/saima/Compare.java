package saima;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 基本算法/比大小
 */
public class Compare {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNext()) {
    int n=in.nextInt();
    String[]arr=new String[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i]=in.next();
      
    }
    
    for (int i = 0; i < arr.length; i++) {
      System.out.println(getNum(arr[i]));
    }
  }
  in.close();
}

private static int getNum(String s){
  char[]arr=s.toCharArray();
  int count=1;
  for (int i = 0; i < arr.length; i++) {
    char[]temp=s.toCharArray();
    Arrays.sort(temp);
    count+=(arr[i]-temp[0])*getMulty(11-i);
    
      s=s.substring(1);
    
    
  }
  return count;
}

public static int getMulty(int n){
  int num=1;
  for (int i = 1; i <=n; i++) {
    num*=i;
  }
  return num;
}
}
