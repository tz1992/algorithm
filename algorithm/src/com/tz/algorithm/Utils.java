package com.tz.algorithm;

import java.util.ArrayList;
import java.util.List;

import com.tz.algorithm.datastructure.Area;
import com.tz.algorithm.entity.TreeData;


public class Utils {


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

  public static void main(String[] args) {
    Area area = new Area("1", "湖北", "0");
    Area area1 = new Area("2", "武汉", "1");
    Area area2 = new Area("3", "随州", "1");
    Area area3 = new Area("4", "洪山", "2");
    Area area4 = new Area("5", "武昌", "2");
    Area area5 = new Area("6", "汉阳", "2");
    ArrayList<Area> areas = new ArrayList<>();
    areas.add(area);
    areas.add(area1);
    areas.add(area2);
    areas.add(area3);
    areas.add(area4);
    areas.add(area5);
    ArrayList<TreeData> res = getTreeData(areas);
    System.out.println(res);


  }


}
