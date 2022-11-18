package com.salah.ma.service;

import com.salah.ma.bean.Categorie;
import com.salah.ma.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {

    @Autowired
    private CategorieRepository categorieRepository;

    public void save(Categorie categorie) {

        this.categorieRepository.save(categorie);
    }

    public void updateCategorie(String label,String code,int id) {

        categorieRepository.updateCategorie(label, code, id);
    }

    public void delete(int id) {

        categorieRepository.deleteById(id);
    }

    public List<Categorie> findAll() {

        return categorieRepository.findAll();
    }

    public int countCat() {

        return categorieRepository.countCategorie();
    }

    public Categorie findById(int id) {

        return categorieRepository.findById(id).get();
    }

    public Categorie findByCode(String code) {

        return categorieRepository.findByCode(code);
    }
}
