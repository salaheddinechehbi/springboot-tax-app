package com.salah.ma.repository;

import com.salah.ma.bean.TaxTnb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxTnbRepository extends JpaRepository<TaxTnb, Long> {


   TaxTnb findByTerrainRefAndAnnee(String terrainRef,int annee);
}
