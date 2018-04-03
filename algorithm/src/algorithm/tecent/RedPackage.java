package algorithm.tecent;
/*
 * 问题描述
 * 
 * 春节期间小明使用微信收到很多个红包，非常开心。在查看领取红包记录时发现，
 * 某个红包金额出现的次数超过了红包总数的一半。
 * 请帮小明找到该红包金额。写出具体算法思路和代码实现，要求算法尽可能高效。
         给定一个红包的金额数组gifts及它的大小n，请返回所求红包的金额。
         若没有金额超过总数的一半，返回0。
 */
import java.util.HashMap;
import java.util.Map;

public class RedPackage {
	 public int getValue(int[] gifts, int n) {
		 Map<Integer, Integer>map=new HashMap<>();
	       for (int i = 0; i < gifts.length; i++) {
			if(map.containsKey(gifts[i])){
			int temp=	map.get(gifts[i]);
				map.put(gifts[i], temp+1);
			}else{
				map.put(gifts[i], 1);
			}
		}
	       int key=0;
	       for(Map.Entry<Integer, Integer> entry:map.entrySet()){
	    	   if(entry.getValue()>n/2){
	    		 key=entry.getKey();
	    	   }
	       }
	       return key;
	    }
}
