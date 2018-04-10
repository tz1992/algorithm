package algorithm.qiniu;
/*问题描述：
 * 在情报传递过程中，为了防止情报被截获，往往需要对情报用一定的方式加密，
 * 简单的加密算法虽然不足以完全避免情报被破译，
 * 但仍然能防止情报被轻易的识别。我们给出一种最简的的加密方法，
 * 对给定的一个字符串，把其中从a-y,A-Y的字母用其后继字母替代，
 * 把z和Z用a和A替代，则可得到一个简单的加密字符串。 
 * 
 */

import java.util.Scanner;

public class Encryption {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		in.close();
		char[] arr = a.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>='A'&&arr[i]<='z'){
				if(arr[i]=='z'){
					arr[i]='a';
				}else if(arr[i]=='Z'){
					arr[i]='A';
				}else{
					arr[i]=(char) (arr[i]+1);
				}
				
			}
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	
     
}
