package com.fiberhome.algrothm.loadbalance;

import java.util.ArrayList;
import java.util.Set;

import com.fiberhome.algrothm.data.ColllectData;

/**
 * 源地址hash
 * 对源地址求hashcode，并对其取模
 * @author tz
 *
 */
public class SourceHash {

  public static String getServerBySourceHash(String sourceIp){
    
    // 获取服务器列表
    Set<String> keysets=ColllectData.getServerData().keySet();
    ArrayList<String> serverKeys=new ArrayList<>();
    serverKeys.addAll(keysets);
    
    int index=sourceIp.hashCode()%serverKeys.size();
    
    return serverKeys.get(index);
    
  }
  
}
