
package com.fiberhome.algrothm.entity;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * Area.
 * 
 * @author root
 * @timestamp 2019-12-10 10:31:43
 */
public class Area implements Serializable {

  /**
  * 
  */
  private static final long serialVersionUID = 1L;
  private String id;
  private String parentId;
  private String areaName;
  private ArrayList<Area> children=new ArrayList<>();

  public Area(String id, String areaName, String parentId) {
    super();
    this.id = id;
    this.areaName = areaName;
    this.parentId = parentId;
  }

  /**
   * getId. return String.
   */
  public String getId() {
    return id;
  }

  /**
   * setId.
   * 
   * @param String.
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * getParentId. return String.
   */
  public String getParentId() {
    return parentId;
  }

  /**
   * setParentId.
   * 
   * @param String.
   */
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  /**
   * getAreaName. return String.
   */
  public String getAreaName() {
    return areaName;
  }

  /**
   * setAreaName.
   * 
   * @param String.
   */
  public void setAreaName(String areaName) {
    this.areaName = areaName;
  }

  public ArrayList<Area> getChildren() {
    return children;
  }

  public void setChildren(ArrayList<Area> children) {
    this.children = children;
  }

}
