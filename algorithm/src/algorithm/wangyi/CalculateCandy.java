package algorithm.wangyi;

/*
 * 问题描述： A,B,C三个人是好朋友,每个人手里都有一些糖果,
 * 我们不知道他们每个人手上具体有多少个糖果,
 * 但是我们知道以下的信息： A - B, B - C, A + B, B + C.
 * 这四个数值.每个字母代表每个人所拥有的糖果数. 
 * 现在需要通过这四个数值计算出每个人手里有多少个糖果,即A,B,C。
 * 这里保证最多只有一组整数A,B,C满足所有题设条件。
 * 输入描述：
 * 输入为一行，一共4个整数，分别为A - B，B - C，A + B，B + C，
 * 用空格隔开。 范围均在-30到30之间(闭区间)。
 * 输出描述：
 * 输出为一行，如果存在满足的整数A，B，C则按顺序输出A，B，C，
 * 用空格隔开，行末无空格。 如果不存在这样的整数A，B，C，则输出No
 * date:2018.6.6
 * 
 */
import java.util.Scanner;

public class CalculateCandy {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNextInt()) {
       int num1=in.nextInt();
       int num2=in.nextInt();
       int num3=in.nextInt();
       int num4=in.nextInt();
       int a=num1+num3;
       int b=num2+num4;
       if(a%2!=0||b%2!=0){
         System.out.println("No");
       }else{
         int A=a/2;
         int B=b/2;
         int C=B-num2;
         if(A-B==num1&&B-C==num2&&A+B==num3&&B+C==num4){
           System.out.print(A);
           System.out.print(" ");
           System.out.print(B);
           System.out.print(" ");
           System.out.print(C);
         
         }else {
          System.out.println("No");
        }
       }
       
    }
    in.close();
  }
}
