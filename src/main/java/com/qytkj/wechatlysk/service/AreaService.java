package com.qytkj.wechatlysk.service;

import java.util.List;

import com.qytkj.wechatlysk.entity.Area;

public interface AreaService {

	//获取区域列表
	List<Area> getAreaList();
	//通过区域ID获取区域信息
	Area getAreaById(int areaId);
	//增加区域信息
	boolean addArea(Area area);
	//修改区域信息
	boolean modifyArea(Area area);
	//删除区域信息
	boolean deleteArea(int areaId);
}
