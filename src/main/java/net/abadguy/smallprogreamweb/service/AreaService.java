package net.abadguy.smallprogreamweb.service;

import net.abadguy.smallprogreamweb.entity.Area;

import java.util.List;

public interface AreaService {
    List<Area> queryArea();

    Area queryAreaById(int areaId);

    boolean insertArea(Area area);

    boolean updateArea(Area area);

    boolean dalArea(int areaId);
}
