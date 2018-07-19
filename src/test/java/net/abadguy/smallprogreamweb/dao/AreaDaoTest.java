package net.abadguy.smallprogreamweb.dao;

import net.abadguy.smallprogreamweb.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;

//    @Test
//    public void queryArea() {
//        List<Area> list=areaDao.queryArea();
//        assertEquals(2,list.size());
//    }
//
//    @Test
//    public void queryAreaById() {
//        Area area=areaDao.queryAreaById(1);
//        assertEquals("南区",area.getAreaName());
//    }
//
//    @Test
//    public void insertArea() {
//        Area area=new Area();
//        area.setAreaName("东区");
//        area.setPriority(3);
//        area.setCreateTime(new Date());
//        int id=0;
//        id=areaDao.insertArea(area);
//    }
//
//    @Test
//    public void updateArea() {
//        Area area=areaDao.queryAreaById(1);
//        area.setAreaName("西区");
//        areaDao.updateArea(area);
//    }
//
//    @Test
//    public void dalArea() {
//    }
}