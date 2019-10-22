package jzOffer.effect;

import java.util.ArrayList;

public class UglyNum {
  public int GetUglyNumber_Solution(int index) {
    if(index<7){
      return index;
    }
    ArrayList<Integer>list=new ArrayList<>();
    int p2 = 0,p3 = 0,p5=0;
    int uglyNum=1;
    list.add(uglyNum);
    while (list.size()<index) {
      uglyNum=Math.min(Math.min(list.get(p2)*2, list.get(p3)*3), list.get(p5)*5);
      
      if(uglyNum==list.get(p2)*2)
        p2++;
      if(uglyNum==list.get(p3)*3)
        p3++;
      if(uglyNum==list.get(p5)*5)
        p5++;
      list.add(uglyNum);
    }
    return list.get(index-1);
}
  
  
}
