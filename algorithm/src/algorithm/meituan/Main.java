package algorithm.meituan;

import java.util.Scanner;

/*
 * 进制均值
 */
public class Main {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNextInt()) {
    int n=in.nextInt();
    int total=0;
    for(int i=2;i<n;i++){
      total+=getSum(n, i);
    }
   int down=n-2;
  
   int temp=getMaxNum(total,down);
    System.out.println(total/temp+"/"+down/temp);
  
  }
  in.close();
}

private static int getMaxNum(int total, int down) {
  
  int min=Math.min(total,down);
  int i =min;
  for(;i>=2;i--){
    boolean flag=(total%i==0)&&(down%i==0);
    if(flag){
      break;
    }
  }
  return i;
}

public static int getSum(int n,int radix){
 //ans表示这个进制数的位数为ans+1
  int ans=0;
  int i=0;
  while (Math.pow(radix, i)<=n) {
    i++;
  }
  if(Math.pow(radix, i)>n){
    ans=i-1;
  }else  {
    ans=i;
  }
  int sum=0;
  while (ans>=0) {
    int temp=(int) Math.pow(radix, ans);
    if(temp>n){
      ans--;
    }else {
      int value=n/temp;
      int mod=n%temp;
      if(mod==0){
        sum+=value;
        break;
      }else {
        sum+=value;
        n=n-temp*value;
      }
      ans--;
    }
    
  }
  return sum;
}
}
