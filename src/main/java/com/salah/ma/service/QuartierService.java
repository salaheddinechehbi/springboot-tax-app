package com.salah.ma.service;

import com.salah.ma.bean.Quartier;
import com.salah.ma.repository.QuartierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuartierService {

    @Autowired
    private QuartierRepository quartierRepository;

    public Quartier findByLabel(String label) {
        return quartierRepository.findByLabel(label);
    }

    public List<Quartier> findAll() {
        return quartierRepository.findAll();
    }

    public void save(Quartier quartier) {
        quartierRepository.save(quartier);
    }

    public Quartier findById(Long aLong) {
        return quartierRepository.findById(aLong).get();
    }

    public long count() {
        return quartierRepository.count();
    }

    public void deleteById(Long aLong) {
        quartierRepository.deleteById(aLong);
    }
}
