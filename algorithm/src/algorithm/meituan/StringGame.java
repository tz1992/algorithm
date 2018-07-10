package algorithm.meituan;

import java.math.BigInteger;
import java.util.Scanner;

public class StringGame {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
 while (in.hasNext()) {
   String s1=in.next();
   String s2=in.next();
   try {
    
     BigInteger n=new BigInteger(s1);
     BigInteger m=new BigInteger(s2);
     System.out.println(n.add(m));
   } catch (Exception e) {
    System.out.println("error");
   }
}
   
    
  
 in.close();
}
}
