package com.fiberhome.algrothm.loadbalance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import com.fiberhome.algrothm.data.ColllectData;

/**
 * 不同的后台服务器可能机器的配置和当前系统的负载并不相同， 因此它们的抗压能力也不一样。跟配置高、负载低的机器分配更高的权重， 使其能处理更多的请求，而配置低、负载高的机器，则给其分配较低的权重，
 * 降低其系统负载，加权轮询很好的处理了这一问题，并将请求按照顺序且根据权重分配给后端。 与普通的轮询算法的区别就是，serverlist里面的重复次数和权重相关，因此会使用到list
 * 而不是set(set不能重复)
 * 
 * @author tz
 *
 */
public class WeightPolling {
  private static Integer pos = 0;

  public static String weightPolling() {

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

    // 这部分的代码和普通轮询一致
    String server = null;
    synchronized (pos) {
      if (pos > serverList.size()) {
        pos = 0;
      }

      server = serverList.get(pos);
      pos++;
    }



    return server;

  }
}
