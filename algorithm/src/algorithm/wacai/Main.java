package algorithm.wacai;
/*
 * 求数列的和
 */
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNext()) {
    int n=in.nextInt();
    int m=in.nextInt();
    double count=n;
    double temp=n;
    while (m>1) {
      count+=Math.sqrt(temp);
      temp= Math.sqrt(temp);
      m--;
    }
    System.out.printf("%.2f", count);
  }
  in.close();
}
}
