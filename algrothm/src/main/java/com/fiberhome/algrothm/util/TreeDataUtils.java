package com.fiberhome.algrothm.util;

import java.util.ArrayList;
import java.util.List;

import com.fiberhome.algrothm.entity.Area;
import com.fiberhome.algrothm.entity.TreeData;




public class TreeDataUtils {
  
  /**
   * 获取符合ant design 中的TreeSelect以及Tree的数据结构的数据
   * @param areas
   * @return
   */
  public static ArrayList<TreeData> getTreeData(List<Area> areas) {

    ArrayList<TreeData> roots = new ArrayList<>();
    TreeData root = null;
    // 将所有的根节点找出来
    for (Area area : areas) {
      if (area.getParentId().equals("0")) {
        root = new TreeData(area.getAreaName(), area.getId(), area.getId());
        roots.add(root);
      }
    }

    // 找所有根节点的子节点

    for (TreeData treeData : roots) {

      // 获取当前这个区域的子节点
      ArrayList<TreeData> child = getChild(treeData.getKey(), areas);
      treeData.setChildren(child);

    }



    return roots;


  }

  private static ArrayList<TreeData> getChild(String id, List<Area> areas) {
    ArrayList<TreeData> child = new ArrayList<>();
    for (Area area : areas) {
      if (area.getParentId().equals(id)) {
        TreeData treeData = new TreeData(area.getAreaName(), area.getId(), area.getId());
        child.add(treeData);
      }
    }

    for (TreeData treeData : child) {
      treeData.setChildren(getChild(treeData.getKey(), areas));
    }

    if (child.size() == 0) {
      return null;
    }

    return child;
  }
  
  
  
  /**
   * 获取普通树结构的数据
   */
  
  public static ArrayList<Area> getCommonTreeData(List<Area> areas){
    
    ArrayList<Area> res=new ArrayList<>();
    // 获取所有根节点
    for(Area area:areas){
      if(area.getParentId().equals("0")){
        res.add(area);
      }
    }
    
    // 获取所有根节点的子节点
    
    for(Area area:res){
      ArrayList<Area> child=findChildren(area.getId(),areas);
      area.setChildren(child);
    }
    
    return res;
    
  }

  private static ArrayList<Area> findChildren(String id, List<Area> areas) {
    ArrayList<Area> child=new ArrayList<>();
    // 查找下一级的子节点
       for(Area area:areas){
         if(area.getParentId().equals(id)){
           child.add(area);
         }
       }
       
       // 递归结束条件
       if(child.size()==0){
         return null;
       }
       
       
       // 找子节点的子节点
       for(Area area:child){
       area.setChildren( findChildren(area.getId(), areas));
         
       }
       
       return child;
  }
}
