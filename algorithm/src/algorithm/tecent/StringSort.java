package algorithm.tecent;
/*问题描述：
 * 
 * 小Q最近遇到了一个难题：把一个字符串的大写字母放到字符串的后面，
 * 各个字符的相对位置不变，且不能申请额外的空间。
          你能帮帮小Q吗？
          
          解决思路：冒泡排序法
 */
import java.util.Scanner;

public class StringSort {
public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  String string=in.nextLine();
  in.close();
  char[]arr=string.toCharArray();
  for (int i = 0; i < arr.length; i++) {
    for(int j=0;j<arr.length-i-1;j++){
      if((arr[j]>='A'&&arr[j]<='Z')&&(arr[j+1]<'A'||arr[j+1]>'Z')){
        char temp=arr[j];
        arr[j]=arr[j+1];;
        arr[j+1]=temp;
        
      }
    }
   
  }
  for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i]);
  }
}
}
