package algorithm.dp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * 算法思想：
 * 核心求解next数组，令next[0]=-1,可以通过递归的方式根据next[0...i]求解next[i+1],
 * 如果k=next[i],如果 s.charAt(i)==s.charAt(k),next[i+1]=k+1
 * 如果不等  令k=next[k],再次重复上面的操作。
 *
 */
public class Kmp {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	String parentStr=scanner.nextLine();
	String modStr=scanner.nextLine();
	int[]arr=calNext(modStr);
		scanner.close();
    char[]p=parentStr.toCharArray();
    char[]m=modStr.toCharArray();
      int i=0;
      int j=0;
      List<Integer>list=new ArrayList<>();
      while(i<m.length&&j<p.length){
    	  if(m[i]==p[j]){
    		  if(i+1==m.length){
    			  //当匹配时候输出第一个字母的位置
    			 list.add(j-i);
    			 i=0;
    			 j++;
    		  }else{
    			  i++;
        		  j++;
    		  }
    		 
    		  
    	  }else{
    		 
    		  j+=i-arr[i];
    		  i=0;
    	  }
      }
      
      for(Integer in:list){
    	  System.out.println(in);
      }
	
}



public static int[] calNext(String s){
	int []next=new int[s.length()];
	
	int j=-1;
	int i=0;
	next[0]=-1;
	
	while(i<s.length()-1){
		if(j==-1||s.charAt(j)==s.charAt(i)){
			++i;
			++j;
			next[i]=j;
		}else{
			j=next[j];
		}
	}
	return next;
}
}
