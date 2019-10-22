package saima.baidu;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 编号转换
 * @author HP
 *
 */
public class Code {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  while (in.hasNext()) {
    int n=in.nextInt();
    String[]arr=new String[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i]=in.next();
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(tansfer(arr[i]));
    }
  }
  in.close();
}

public static String tansfer(String str){
  char[]arr=str.toCharArray();
  String regex="^R\\d+C\\d+";
 if(Pattern.matches(regex, str)){
   String col="";
   String column="";
   for (int i = 1; i < arr.length; i++) {
    if(arr[i]>='0'&&arr[i]<='9'){
      col+=arr[i];
    }else {
      break;
    }
  }
 
   for (int i = arr.length-1; i>= 0; i--) {
     if(arr[i]>='0'&&arr[i]<='9'){
       column+=arr[i];
     }else {
       break;
     }
  }
   
   StringBuilder s=new StringBuilder(column);
     column= s.reverse().toString();
   int temp=Integer.parseInt(column);
    return convert(temp)+col;
     
   
   
 }else {
   String col="";
   String column="";
   for (int i = 0; i < arr.length; i++) {
    if(arr[i]>='A'&&arr[i]<='Z'){
      column+=arr[i];
    }else {
      col+=arr[i];
     
    }
   
  }
   return "R"+col+"C"+convert1(column);
}

}

public static String convert(int n) {
  String str = "";
  int len = 0;
  if (n >= 1 && n <= 26) {
    len = 1;
  } else if (n >= 27 && n <= 702) {
    len = 2;

  } else if (n >= 703 && n <= 18279) {
    len = 3;

  } else if (n >= 18280 && n <= 475255) {
    len = 4;

  } else {
    len = 5;
  }
  for(int i=0;i<len;i++){
    n-=Math.pow(26, i);
  }
  for (int i = len-1; i >=0; i--) {
    int temp=(int) (n / Math.pow(26, i));
    char c = (char) ('A' + temp);
    n -= Math.pow(26, i)*temp;
    str += c;
  }
  return str;
}

public static String convert1(String str){
  int len=str.length();
  char[]arr=str.toCharArray();
  String ans="";
  int temp=0;
  
  for(int i=0;i<len;i++){
    temp+=Math.pow(26, i);
  }
  for (int i = 0; i < arr.length; i++) {
   temp+=Math.pow(26, len-i-1)*(arr[i]-'A');
 }
  ans=temp+"";
  return ans;
}

}
