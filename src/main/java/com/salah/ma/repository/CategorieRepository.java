package com.salah.ma.repository;

import com.salah.ma.bean.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Integer> {

    @Query("SELECT COUNT(c.id) from Categorie c")
    int countCategorie();

    @Modifying
    @Transactional
    @Query("UPDATE Categorie c SET c.label=:label,c.code=:code where c.id=:id")
    void updateCategorie(@Param("label") String label, @Param("code") String code, @Param("id") int id);

    public Categorie findByCode(String code);

    List<Categorie> findByCodeLikeAndLabelLike(String code, String label);
}
