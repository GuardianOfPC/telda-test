package com.telda.mapper;

import com.telda.model.Region;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface RegionMapper {

    @Select("SELECT * FROM REGIONS")
    List<Region> getAllRegions();

    @Select("SELECT * FROM REGIONS WHERE id = #{id}")
    Region getRegionById(Integer id);

    @Insert("INSERT INTO REGIONS(id, name, short_name) VALUES (#{id}, #{name}, #{short_name})")
    void insertRegion(Region region);

    @Delete("DELETE FROM REGIONS WHERE ID = #{id}")
    void deleteById(Integer id);

    @Update("UPDATE REGIONS SET name=#{name}, " +
    " short_name=#{short_name} where id=#{id}")
    void update(Region region);
}
