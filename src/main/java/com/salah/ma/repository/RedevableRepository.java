package com.salah.ma.repository;

import com.salah.ma.bean.Redevable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RedevableRepository extends JpaRepository<Redevable, Long> {

    @Query("SELECT COUNT(r.id) from Redevable r")
    int countRedevable();

    Redevable findByNameLikeOrEmailLike(String name, String email);

    Redevable findByCin(String cin);
}
