package com.ict.erp.vo;

import org.apache.ibatis.type.Alias;

@Alias("li")
public class LevelInfo {

private Integer LiNum;
private Integer LiLevel;
private String LiName;
private String LiDesc;


public LevelInfo(Integer liNum, Integer liLevel, String liName, String liDesc) {
	super();
	LiNum = liNum;
	LiLevel = liLevel;
	LiName = liName;
	LiDesc = liDesc;
}
public LevelInfo() {}

@Override
public String toString() {
	return "LevelInfo [LiNum=" + LiNum + ", LiLevel=" + LiLevel + ", LiName=" + LiName + ", LiDesc=" + LiDesc + "]";
}
/**
 * @return the liNum
 */
public Integer getLiNum() {
	return LiNum;
}
/**
 * @param liNum the liNum to set
 */
public void setLiNum(Integer liNum) {
	LiNum = liNum;
}
/**
 * @return the liLevel
 */
public Integer getLiLevel() {
	return LiLevel;
}
/**
 * @param liLevel the liLevel to set
 */
public void setLiLevel(Integer liLevel) {
	LiLevel = liLevel;
}
/**
 * @return the liName
 */
public String getLiName() {
	return LiName;
}
/**
 * @param liName the liName to set
 */
public void setLiName(String liName) {
	LiName = liName;
}
/**
 * @return the liDesc
 */
public String getLiDesc() {
	return LiDesc;
}
/**
 * @param liDesc the liDesc to set
 */
public void setLiDesc(String liDesc) {
	LiDesc = liDesc;
}



}
