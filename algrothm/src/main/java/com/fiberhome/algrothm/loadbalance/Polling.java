package com.fiberhome.algrothm.loadbalance;

import java.util.ArrayList;
import java.util.Set;

import com.fiberhome.algrothm.data.ColllectData;

/**
 * 轮询算法，将请求按照顺序轮流分配到后台服务器上
 * 不关心当前服务器的负载
 * @author tz
 * 
 *
 */
public class Polling {
  private static Integer pos = 0;

  public static String polling(){
    // 获取server的list
    Set<String> keysets=ColllectData.getServerData().keySet();
    ArrayList<String> serverKeys=new ArrayList<>();
    serverKeys.addAll(keysets);
    
    String server=null;
    
    // 给轮询的位置上锁，保证在同一时间只有一个线程能够对轮询的位置做出修改，保证服务器选择的顺序性以及防止数组越界
    synchronized (pos) {
      if(pos>serverKeys.size()){
        pos=0;
      }
      pos++;
      server=serverKeys.get(pos);
    }
    
    return server;
    
  }
  
  public static void main(String[] args) {
    polling();
  }
}
