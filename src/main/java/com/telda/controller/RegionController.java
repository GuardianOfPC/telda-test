package com.telda.controller;

import com.telda.model.Region;
import com.telda.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/regions")
public class RegionController {

    @Autowired
    private RegionService regionService;

    @GetMapping
    public List<Region> getAll() {
        return regionService.getAll();
    }

    @GetMapping("/{id}")
    public Region getById(@PathVariable Integer id) {
        return regionService.getById(id);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Region region){
        regionService.create(region);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
        regionService.delete(id);
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody Region region, @PathVariable Integer id){
        regionService.update(region);
    }

}
