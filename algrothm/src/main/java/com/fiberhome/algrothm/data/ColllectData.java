package com.fiberhome.algrothm.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.fiberhome.algrothm.entity.Area;

public class ColllectData {
  private static Map<String, Integer> serviceWeightMap = new HashMap<String, Integer>();
  private static ArrayList<Area> areas = new ArrayList<>();
  static{
    // 用户负载均衡数据服务器数据
    serviceWeightMap.put("192.168.1.100", 1);
    serviceWeightMap.put("192.168.1.101", 1);           //权重为4
    serviceWeightMap.put("192.168.1.102", 4);
    serviceWeightMap.put("192.168.1.103", 1);
    serviceWeightMap.put("192.168.1.104", 1);       //权重为3
    serviceWeightMap.put("192.168.1.105", 3);
    serviceWeightMap.put("192.168.1.106", 1);       //权重为2
    serviceWeightMap.put("192.168.1.107", 2);
    serviceWeightMap.put("192.168.1.108", 1);
    serviceWeightMap.put("192.168.1.109", 1);
    serviceWeightMap.put("192.168.1.110", 1);
    
    // 用于树形数据
    Area area = new Area("1", "湖北", "0");
    Area area1 = new Area("2", "武汉", "1");
    Area area2 = new Area("3", "随州", "1");
    Area area3 = new Area("4", "洪山", "2");
    Area area4 = new Area("5", "武昌", "2");
    Area area5 = new Area("6", "汉阳", "2");
    areas.add(area);
    areas.add(area1);
    areas.add(area2);
    areas.add(area3);
    areas.add(area4);
    areas.add(area5);
  };
  
  
  public static Map<String, Integer> getServerData(){
    return serviceWeightMap;
  }
  
  public static ArrayList<Area> getTreeData(){
    return areas;
  }
  
  
  
}
