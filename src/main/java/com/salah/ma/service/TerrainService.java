package com.salah.ma.service;

import com.salah.ma.bean.Redevable;
import com.salah.ma.bean.Terrain;
import com.salah.ma.repository.TerrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TerrainService {

    @Autowired
    private TerrainRepository terrainRepository;

    public List<Terrain> findByCategorie(Long id) {
        return terrainRepository.findByCategorie(id);
    }

    public List<Terrain> findByRedevable(Long id) {
        return terrainRepository.findByRedevable(id);
    }

    public List<Terrain> findAll() {
        return terrainRepository.findAll();
    }

    public void save(Terrain terrain) {
        terrainRepository.save(terrain);
    }

    public Terrain findById(Long aLong) {
        return terrainRepository.findById(aLong).get();
    }

    public long count() {
        return terrainRepository.count();
    }

    public void deleteById(Long aLong) {
        terrainRepository.deleteById(aLong);
    }

    public Terrain findByRef(String ref) {
        return terrainRepository.findByRef(ref);
    }
}
