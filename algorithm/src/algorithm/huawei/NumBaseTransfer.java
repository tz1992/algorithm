package algorithm.huawei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）
 */
public class NumBaseTransfer {

public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	while(scanner.hasNextLine()){
		String string=scanner.nextLine();
		String str=string.substring(2);
		
		Map<Character,Integer> map=new HashMap<>();
		char[]arr={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		for(int i=0;i<=15;i++){
			map.put(arr[i],i);
		}
		char[]strs=str.toCharArray();
		int sum=0;
		for (int i = 0; i < strs.length; i++) {
			sum=(int) (sum+map.get(strs[i])*Math.pow(16, strs.length-i-1));
		}
		System.out.println(sum);
	}
	scanner.close();
	
}
}
