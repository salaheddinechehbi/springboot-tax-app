package com.salah.ma.repository;

import com.salah.ma.bean.Redevable;
import com.salah.ma.bean.Terrain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TerrainRepository extends JpaRepository<Terrain, Long> {

    List<Terrain> findByCategorie(Long id);

    List<Terrain> findByRedevable(Long id);

   Terrain findByRef(String ref);
}
