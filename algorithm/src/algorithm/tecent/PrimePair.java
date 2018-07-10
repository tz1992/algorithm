package algorithm.tecent;

import java.util.Scanner;

/*
 * 腾讯/素数对
 */
public class PrimePair {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNextInt()) {
    int n=in.nextInt();
    int count=0;
   
    for(int i=2;i<=n/2;i++){
      if(isPrime(i)&&isPrime(n-i)){
        count++;
      }else {
        continue;
      }
    }
    System.out.println(count);
    
  }
  in.close();
}

public static boolean isPrime(int n){
  int count=0;
  for(int i=2;i<n;i++){
    if(n%i==0){
      count++;
      break;
    }
  }
  
  if(count==0){
    return true;
  }else {
    return false;
  }
}
}
