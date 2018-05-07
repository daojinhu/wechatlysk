package com.qytkj.wechatlysk.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qytkj.wechatlysk.dao.AreaDao;
import com.qytkj.wechatlysk.entity.Area;
import com.qytkj.wechatlysk.service.AreaService;
/**
 * 
    * @ClassName: AreaServiceImpl
    * @Description: 业务实现层
    * @author hudaojin
    * @date 2018年4月27日
    *
 */
@Service
public class AreaServiceImpl implements AreaService {

	@Autowired
	private AreaDao areaDao;

	@Override
	public List<Area> getAreaList() {

		return areaDao.queryArea();
	}

	@Override
	public Area getAreaById(int areaId) {
		//int a = 1/0;
		return areaDao.queryAreaById(areaId);
	}

	@Transactional
	@Override
	public boolean addArea(Area area) {
		if (area.getAreaName() != null && !"".equals(area.getAreaName())) {
			area.setCreateTime(new Date());
			area.setLastEditTime(new Date());
			try {
				int effectedNum = areaDao.insertArea(area);
				if (effectedNum > 0) {
					return true;
				} else {
					throw new RuntimeException("插入区域信息失败！");
				}
			} catch (Exception e) {
				throw new RuntimeException("插入区域信息失败" + e.getMessage());
			}
		} else {
			throw new RuntimeException("区域信息不能为空！");
		}
	}

	@Override
	public boolean modifyArea(Area area) {
		// 空值判断，主要是areaId不为空
		if (area.getAreaId() != null && area.getAreaId() > 0) {
			// 设置默认值
			area.setLastEditTime(new Date());
			try {
				int effectedNum = areaDao.updateArea(area);
				if (effectedNum > 0) {
					return true;
				} else {
					throw new RuntimeException("更新区域信息失败！");
				}
			} catch (Exception e) {
				throw new RuntimeException("更新区域信息失败：" + e.toString());
			}
		} else {
			throw new RuntimeException("区域信息不能为空！");
		}
	}

	@Override
	public boolean deleteArea(int areaId) {
		// 空值判断，主要是areaId不为空
		if (areaId > 0) {
			try {
				int effectedNum = areaDao.deleteArea(areaId);
				if (effectedNum > 0) {
					return true;
				} else {
					throw new RuntimeException("刪除区域信息失败！");
				}
			} catch (Exception e) {
				throw new RuntimeException("刪除区域信息失败：" + e.toString());
			}
		} else {
			throw new RuntimeException("区域ID不能为空！");
		}
	}

}
