package algorithm.mogujie;
/*
 * 给定一个字符串，问是否能通过添加一个字母将其变为回文串。
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddForBackString {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	while (in.hasNext()) {
		String s=in.next();
		boolean flag=false;
		for(int i=0;i<=s.length();i++){
			String temp=produceNewString(i, s)	;
			String back=backString(temp);
			boolean flag2=isOk(temp, back);
			flag=flag||flag2;
		}
		if(flag){
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}
	in.close();
}

public static String produceNewString(int i,String s){
    String s1=s.substring(0,i);
    String s2=s.substring(i);
    return s1+"_"+s2;
}


public static String backString(String s){
	char[]arr=s.toCharArray();
	String back="";
	for (int i = arr.length-1; i >= 0; i--) {
		back+=arr[i];
	}
	return back;
}

public static boolean isOk(String s1,String s2){
	char[]arr1=s1.toCharArray();
	char[]arr2=s2.toCharArray();
	List<Node>list=new ArrayList<>();
	for (int i = 0; i < arr2.length; i++) {
		if(arr1[i]!=arr2[i]){
			list.add(new Node(arr1[i], arr2[i]));
		}
	}
	
	if(list.size()!=2){
		return false;
	}else{
		if(list.get(0).first==list.get(1).second&&list.get(0).second==list.get(1).first){
			return true;
		}else {
			return false;
		}
	}
}

static class Node{
	
	int first,second;
	public Node(int first,int second){
		this.first=first;
		this.second=second;
	}
}

}
