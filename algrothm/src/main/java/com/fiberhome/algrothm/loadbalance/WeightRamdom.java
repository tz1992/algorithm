package com.fiberhome.algrothm.loadbalance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

import com.fiberhome.algrothm.data.ColllectData;

/**
 * 加权随机,前面一部分加权过程和加权轮询一致，后面一部分的随机部分和普通随机算法一致
 * @author tz
 *
 */
public class WeightRamdom {
  
  public static String weightRamdom(){
    
    Map<String, Integer> servers = ColllectData.getServerData();
    Iterator<String> iterator = servers.keySet().iterator();
    // 获取加权后的serverlist，里面的ip会重复，重复次数和权重一致
    ArrayList<String> serverList = new ArrayList<>();
    while (iterator.hasNext()) {
      String key = (String) iterator.next();
      int weight = servers.get(key);
      for (int i = 0; i < weight; i++) {
        serverList.add(key);
      }

    }
    
    // 使用随机函数获取随机数，并取得对应的随机数
    Random random = new Random();
    int randomPos = random.nextInt(serverList.size());
    String server = serverList.get(randomPos);
    return server;

  }

}
