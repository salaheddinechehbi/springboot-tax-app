package com.salah.ma.repository;

import com.salah.ma.bean.TauxTnb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TauxTnbRepository extends JpaRepository<TauxTnb, Long> {

}
