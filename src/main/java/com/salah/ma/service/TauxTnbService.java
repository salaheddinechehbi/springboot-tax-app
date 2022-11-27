package com.salah.ma.service;

import com.salah.ma.bean.TauxTnb;
import com.salah.ma.repository.TauxTnbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TauxTnbService {

    @Autowired
    private TauxTnbRepository tauxTnbRepository;

    public List<TauxTnb> findAll() {
        return tauxTnbRepository.findAll();
    }

    public void save(TauxTnb tauxTnb) {
        tauxTnbRepository.save(tauxTnb);
    }

    public TauxTnb findById(Long aLong) {
        return tauxTnbRepository.findById(aLong).get();
    }

    public long count() {
        return tauxTnbRepository.count();
    }

    public void deleteById(Long aLong) {
        tauxTnbRepository.deleteById(aLong);
    }
}
