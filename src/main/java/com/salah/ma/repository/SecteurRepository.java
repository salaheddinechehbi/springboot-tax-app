package com.salah.ma.repository;

import com.salah.ma.bean.Categorie;
import com.salah.ma.bean.Secteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface SecteurRepository extends JpaRepository<Secteur, Integer> {

    @Query("SELECT COUNT(s.id) from Secteur s")
    int countSecteur();

    @Modifying
    @Transactional
    @Query("UPDATE Secteur s SET s.label=:label,s.code=:code where s.id=:id")
    void updateSecteur(@Param("label") String label, @Param("code") String code, @Param("id") int id);

    public Secteur findByCode(String code);

    Secteur deleteSecteurByCode(String code);

}
