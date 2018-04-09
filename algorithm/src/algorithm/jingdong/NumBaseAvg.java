package algorithm.jingdong;
/*
 * 问题描述：
 * 尽管是一个CS专业的学生，小B的数学基础很好并对数值计算有着特别的兴趣，
 * 喜欢用计算机程序来解决数学问题，现在，她正在玩一个数值变换的游戏。
 * 她发现计算机中经常用不同的进制表示一个数，
 * 如十进制数123表达为16进制时只包含两位数7、11（B），用八进制表示为三位数1、7、3，
 * 按不同进制表达时，各个位数的和也不同，如上述例子中十六进制和八进制中各位数的和分别是18和11,。
 *  小B感兴趣的是，一个数A如果按2到A-1进制表达时，各个位数之和的均值是多少？
 *  她希望你能帮她解决这个问题？ 所有的计算均基于十进制进行，结果也用十进制表示为不可约简的分数形式。
 * 思路：
 * 1，计算每一种进制的和
 * 2，求两个数的最大公约数
 * 
 * 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class NumBaseAvg {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	while(in.hasNextInt()){
		int n=in.nextInt();
		int count=0;
		HashMap<Integer, Integer>map=new HashMap<>();
		for(int i=2;i<n;i++){
			
			int j=0;
			while(n>=Math.pow(i, j)){
				j++;
				map.put(i, j);
			}
			
		}
		//map数组存放的是对于i进制，这个数对应的位数
		for(Map.Entry<Integer, Integer> entry: map.entrySet()){
			int m=entry.getKey();
			int v=entry.getValue();
			int temp1=n;
		    for(int i=v;i>0;i--){
		    	if(temp1>=Math.pow(m, i-1)){
		    		int temp=(int) (temp1/Math.pow(m, i-1));
			    	temp1=(int) (temp1-temp*Math.pow(m, i-1));
			    	count=count+temp;
		    	}
		    
		    	
		    }
		}
		
		/*
		 * 求的是最大公约数
		 */
		List<Integer>list=new ArrayList<>();
	for(int i=1;i<n-2;i++){
		if(count%i==0&&(n-2)%i==0){
			list.add(i);
		}
	}
	
    Object[]objects=list.toArray();
  
		
		if(count%(n-2)==0){
			System.out.println(count/(n-2)+"/"+"1");
		}else if(objects.length==0){
			System.out.println(count+"/"+(n-2));
		}else{
			  Arrays.sort(objects);
		       int num=(int) objects[objects.length-1];
		       System.out.println(count/num+"/"+(n-2)/num);
		}
		
	}
}
}
