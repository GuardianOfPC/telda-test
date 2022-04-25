package com.telda.service;

import com.telda.mapper.RegionMapper;
import com.telda.model.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {

    @Autowired
    private RegionMapper regionMapper;

    @CachePut("regions")
    public List<Region> getAll(){
        return regionMapper.getAllRegions();
    }

    @CachePut("regions")
    public Region getById(Integer id){
        return regionMapper.getRegionById(id);
    }

    @CachePut(value = "regions", key = "#region.id")
    public void create(Region region){
        regionMapper.insertRegion(region);
    }

    @CacheEvict("regions")
    public void delete(Integer id) { regionMapper.deleteById(id); }

    @CachePut("regions")
    public void update(Region region) { regionMapper.update(region); }
}
