package com.fiberhome.algrothm.loadbalance;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

import com.fiberhome.algrothm.data.ColllectData;

/**
 * 随机算法
 * 通过系统随机函数，根据后台服务器列表的大小值来随机选取其中一台进行访问。
 * 由概率概率统计理论可以得知，随着调用量的增大，其实际效果越来越接近于平均分配流量到后台的每一台服务器，
 * 也就是轮询法的效果。
 * @author tz
 *
 */
public class Ramdom {
  
  public String RamdomAlgorithm(){
    // 获取服务器列表
    Set<String> keysets=ColllectData.getServerData().keySet();
    ArrayList<String> serverKeys=new ArrayList<>();
    serverKeys.addAll(keysets);
    // 使用随机函数获取随机数，并取得对应的随机数
    Random random = new Random();
    int randomPos = random.nextInt(serverKeys.size());
    String server = serverKeys.get(randomPos);
    return server;
    
  }

}
