package com.tz.algorithm.datastructure;


import java.util.ArrayList;

public class TreeData {


  private String title;
  private String key;
  private String value;
  private ArrayList<TreeData> children = new ArrayList<>();
  


  public TreeData(String title, String key, String value) {
    super();
    this.title = title;
    this.key = key;
    this.value = value;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ArrayList<TreeData> getChildren() {
    return children;
  }

  public void setChildren(ArrayList<TreeData> children) {
    this.children = children;
  }


}
