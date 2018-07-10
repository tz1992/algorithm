package algorithm.qunaer;

import java.util.Scanner;

/*
 * 身份证分组
 */
public class ID {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNextLine()) {
    char[]arr=in.nextLine().trim().toCharArray();
    String temp="";
    for (int i = 0; i < arr.length; i++) {
      if(arr[i]!=' '){
        temp+=arr[i];
      }
    }
    
    System.out.println(deal(temp));
  }
  in.close();
}

public static String deal(String temp){
  int len=temp.length();
  if(len<=6){
    return temp;
  }else if(len>6&&len<=14) {
    String s1=temp.substring(0, 6);
    String s2=temp.substring(6);
    return (s1+" "+s2);
  }else {
    String s1=temp.substring(0, 6);
    String s2=temp.substring(6,14);
    String s3=temp.substring(14);
    return (s1+" "+s2+" "+s3);
    
  }
}
}
