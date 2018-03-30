package algorithm.tecent;

import java.util.Scanner;

/*
 * 给定一个字符串s，你可以从中删除一些字符，使得剩下的串是一个回文串。如何删除才能使得回文串最长呢？
        输出需要删除的字符个数。
        
        输入描述:abcda
         输出2
         
         问题解决：
         将字符串反转得到另外的一个字符串，然后求这两个字符串的公共字符串，字符串的长度减去公共字符串的最大长度就是想要的结果
         dp[i][j]表示从第一个字符串的前i个字符串到第二个字符串的前j个字符串的最大公共子串的长度
    
 */
public class LargestPalindrome {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String  string=in.nextLine();
	in.close();
	String bString="";
	for(int i=string.length()-1;i>=0;i--){
		bString=bString+string.charAt(i);
	}
	int [][]dp=new int[string.length()+1][bString.length()+1];
	dp[0][0]=0;
	for(int i=1;i<dp.length;i++){
		dp[0][i]=0;
	}
	for(int i=1;i<dp.length;i++){
		dp[i][0]=0;
	}
	
	for (int i = 1; i < dp.length; i++) {
		for (int j = 1; j < dp[0].length; j++) {
			if(string.charAt(i-1)==bString.charAt(j-1)){
				dp[i][j]=dp[i-1][j-1]+1;
			}else{
				dp[i][j]=Math.max(dp[i-1][j-1], Math.max(dp[i-1][j], dp[i][j-1]));
			}
		}
	}
	
	System.out.println(string.length()-dp[string.length()][bString.length()]);
}
}
