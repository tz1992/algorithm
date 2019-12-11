
package com.fiberhome.algrothm.ui;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiberhome.algrothm.data.ColllectData;
import com.fiberhome.algrothm.entity.Area;
import com.fiberhome.algrothm.entity.TreeData;
import com.fiberhome.algrothm.service.AreaService;
import com.fiberhome.algrothm.util.TreeDataUtils;


/**
 * Area.
 * 
 * @author root
 * @timestamp 2019-12-10 10:31:43
 */
@RestController
public class AreaController {
  @Autowired
  private AreaService service;


  @GetMapping("/getTreeData")
  public Object getTreeData() {
    
    ArrayList<TreeData> res = TreeDataUtils.getTreeData(ColllectData.getTreeData());
    return res;

  }
  
  
  @GetMapping("/getCommonTreeData")
  public Object getCommonTreeData() {
    ArrayList<Area> res = TreeDataUtils.getCommonTreeData(ColllectData.getTreeData());
    return res;

  }

}
