package com.tz.algorithm.entity;

public class Area {
  private String id;
  private String areaName;
  private String parentId;
  
  

  public Area(String id, String areaName, String parentId) {
    super();
    this.id = id;
    this.areaName = areaName;
    this.parentId = parentId;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getAreaName() {
    return areaName;
  }

  public void setAreaName(String areaName) {
    this.areaName = areaName;
  }

  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }
}
