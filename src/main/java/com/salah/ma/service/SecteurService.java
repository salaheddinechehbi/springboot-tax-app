package com.salah.ma.service;

import com.salah.ma.bean.Secteur;
import com.salah.ma.repository.SecteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SecteurService {

    @Autowired
    private SecteurRepository secteurRepository;

    public void save(Secteur secteur) {

        this.secteurRepository.save(secteur);
    }

    public void updateCategorie(String label,String code,int id) {

        secteurRepository.updateSecteur(label, code, id);
    }

    public void delete(int id) {

        secteurRepository.deleteById(id);
    }

    @Transactional
    public Secteur deleteSecteurByCode(String code) {
        return secteurRepository.deleteSecteurByCode(code);
    }

    public List<Secteur> findAll() {

        return secteurRepository.findAll();
    }

    public int countSecteur() {

        return secteurRepository.countSecteur();
    }

    public Secteur findById(int id) {

        return secteurRepository.findById(id).get();
    }

    public Secteur findByCode(String code) {

        return secteurRepository.findByCode(code);
    }

}
