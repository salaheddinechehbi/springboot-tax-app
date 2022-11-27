package com.salah.ma.controller;

import com.salah.ma.bean.Terrain;
import com.salah.ma.service.TerrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/terrains")
public class TerrainController {

    @Autowired
    private TerrainService terrainService;

    @GetMapping("/findByCat/{id}")
    public List<Terrain> findByCategorie(@PathVariable Long id) {
        return terrainService.findByCategorie(id);
    }

    @GetMapping("/findByRedevable/{id}")
    public List<Terrain> findByRedevable(@PathVariable Long id) {
        return terrainService.findByRedevable(id);
    }

    @GetMapping("")
    public List<Terrain> findAll() {
        return terrainService.findAll();
    }

    @PostMapping("")
    public void save(@RequestBody Terrain terrain) {
        terrainService.save(terrain);
    }

    @GetMapping("/find/{id}")
    public Terrain findById(@PathVariable Long aLong) {
        return terrainService.findById(aLong);
    }

    public long count() {
        return terrainService.count();
    }

    @DeleteMapping
    public void deleteById(@RequestParam Long aLong) {
        terrainService.deleteById(aLong);
    }
}
