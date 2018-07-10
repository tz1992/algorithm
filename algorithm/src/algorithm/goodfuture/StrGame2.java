package algorithm.goodfuture;

import java.util.Scanner;

/*
 * 好未来/删除公共字符
 */
public class StrGame2 {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNextLine()) {
    String string=in.nextLine();
    String string2=in.nextLine();
    
    char str1[]=string.toCharArray();
    char str2[]=string2.toCharArray();
    String conc="";
    for (int i = 0; i < str1.length; i++) {
      if(!contain(str2, str1[i])){
        conc+=str1[i];
      }
    }
    System.out.println(conc);
    
    
  }
  in.close();
}

public static boolean contain(char[]arr,char temp){
  boolean flag=false;
  for (int i = 0; i < arr.length; i++) {
    if(arr[i]==temp){
      flag=true;
      break;
    }
  }
  return flag;
}
}
