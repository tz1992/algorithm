package saima;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 基本算法/日期倒计时
 * @author HP
 *
 */
public class CountDown {
public static void main(String[] args) throws Exception {
  Scanner in=new Scanner(System.in);
  while (in.hasNext()) {
    String string=in.next();
    SimpleDateFormat format =new SimpleDateFormat("yyyy-MM-dd");
    Date date1= format.parse(string);
    Date date=format.parse("2015-10-18");
    long dis=date1.getTime()-  date.getTime();
    int disNum=(int) (dis/24/60/60/1000);
    System.out.println(disNum);
  }
  in.close();
}
}
