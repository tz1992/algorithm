package saima;
/*
 * 基本算法/股神
 */
import java.util.Scanner;

public class Gushen {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNext()) {
   int n=in.nextInt();
   int count=1;
   int temp=1;
   int add=2;
   for(int i=2;i<=n;i++){
     if(temp!=0){
       count++;
       temp++;
     }else {
      count--;
      temp++;
    }
     
     if(temp==add){
       add++;
       temp=0;
     }
   }
   System.out.println(count);
  }
  in.close();
}
}
