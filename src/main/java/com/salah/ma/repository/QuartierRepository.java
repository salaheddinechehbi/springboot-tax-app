package com.salah.ma.repository;

import com.salah.ma.bean.Quartier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuartierRepository extends JpaRepository<Quartier, Long> {

    public Quartier findByLabel(String label);
}
