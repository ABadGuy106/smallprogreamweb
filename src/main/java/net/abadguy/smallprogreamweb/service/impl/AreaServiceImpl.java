package net.abadguy.smallprogreamweb.service.impl;

import net.abadguy.smallprogreamweb.dao.AreaDao;
import net.abadguy.smallprogreamweb.entity.Area;
import net.abadguy.smallprogreamweb.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> queryArea() {
        return areaDao.queryArea();
    }

    @Override
    public Area queryAreaById(int areaId) {
        return areaDao.queryAreaById(areaId);
    }

    @Transactional
    @Override
    public boolean insertArea(Area area) {
        if(area.getAreaName()!=null&& "".equals(area.getAreaName())){
            area.setCreateTime(new Date());
            try {
                int effectedNum=areaDao.insertArea(area);
                if(effectedNum>0){
                    return true;
                }else{
                    throw new RuntimeException("插入区域信息失败！");
                }
            }catch (Exception e){
                throw new RuntimeException("插入区域信息失败："+e.getMessage());
            }
        }else{
            throw new RuntimeException("插入区域信息失败！");
        }
    }
    @Transactional
    @Override
    public boolean updateArea(Area area) {
        if(area.getAreaName()!=null&& "".equals(area.getAreaName())){
            area.setCreateTime(new Date());
            try {
                int effectedNum=areaDao.insertArea(area);
                if(effectedNum>0){
                    return true;
                }else{
                    throw new RuntimeException("插入区域信息失败！");
                }
            }catch (Exception e){
                throw new RuntimeException("插入区域信息失败："+e.getMessage());
            }
        }else{
            throw new RuntimeException("插入区域信息失败！");
        }
    }
    @Transactional
    @Override
    public boolean dalArea(int areaId) {
        if (areaId > 0) {
            try {
                // 删除区域信息
                int effectedNum = areaDao.dalArea(areaId);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("删除区域信息失败!");
                }
            } catch (Exception e) {
                throw new RuntimeException("删除区域信息失败:" + e.toString());
            }
        } else {
            throw new RuntimeException("区域Id不能为空！");
        }
    }
}
