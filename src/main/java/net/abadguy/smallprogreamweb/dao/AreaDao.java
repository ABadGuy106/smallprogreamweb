package net.abadguy.smallprogreamweb.dao;

import net.abadguy.smallprogreamweb.entity.Area;

import java.util.List;

public interface AreaDao {

    List<Area> queryArea();

    Area queryAreaById(int areaId);

    int insertArea(Area area);

    int updateArea(Area area);

    int dalArea(int areaId);
}
