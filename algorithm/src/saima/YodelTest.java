package saima;

import java.util.Scanner;

/*
 * 基本算法/约德尔测试
 */
public class YodelTest {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNext()) {
    char[] s1=in.next().toCharArray();
    char[] s2=in.next().toCharArray();
    for (int i = 0; i < s1.length; i++) {
      if((s1[i]>='A'&&s1[i]<='Z')||(s1[i]>='a'&&s1[i]<='z')||(s1[i]>='0'&&s1[i]<='9')){
        s1[i]='1';
      }else {
        s1[i]='0';
      }
    }
    int count=0;
    for (int i = 0; i < s2.length; i++) {
      if(s1[i]==s2[i]){
        count++;
      }
    }
    double b=(float)count*100/s1.length;
    System.out.printf("%.2f",b);
    System.out.println("%");
  }
  in.close();
}
}
