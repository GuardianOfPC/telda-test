package com.telda.service;

import com.telda.mapper.RegionMapper;
import com.telda.model.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {
    @Autowired
    private RegionMapper regionMapper;

    public List<Region> getAll(){
        return regionMapper.getAllRegions();
    }

    public Region getById(Integer id){
        return regionMapper.getRegionById(id);
    }

    public void create(Region region){
        regionMapper.insertRegion(region);
    }

    public void delete(Integer id) { regionMapper.deleteById(id); }

    public void update(Region region) { regionMapper.update(region); }
}
