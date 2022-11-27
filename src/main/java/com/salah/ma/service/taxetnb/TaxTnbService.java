package com.salah.ma.service.taxetnb;

import com.salah.ma.bean.TaxTnb;
import com.salah.ma.repository.TaxTnbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxTnbService {

    public TaxTnb findByTerrainRefAndAnnee(String terrainRef, int annee) {
        return taxTnbRepository.findByTerrainRefAndAnnee(terrainRef, annee);
    }

    public List<TaxTnb> findAll() {
        return taxTnbRepository.findAll();
    }

    public TaxTnb save(TaxTnb taxTnb){
        return taxTnbRepository.save(taxTnb);
    }
    @Autowired
    private TaxTnbRepository taxTnbRepository;
}
