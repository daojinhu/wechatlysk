package com.qytkj.wechatlysk.dao;

import java.util.List;

import com.qytkj.wechatlysk.entity.Area;
/**
 * 
    * @ClassName: AreaDao
    * @Description: 数据访问层
    * @author hudaojin
    * @date 2018年4月27日
    *
 */
public interface AreaDao {

	List<Area> queryArea();
	//查询
	Area queryAreaById(int areaId);
	//插入
	int insertArea(Area area);
	//修改
	int updateArea(Area area);
	//删除
	int deleteArea(int areaId);
}
