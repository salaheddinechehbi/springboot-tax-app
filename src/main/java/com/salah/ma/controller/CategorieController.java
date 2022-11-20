package com.salah.ma.controller;

import com.salah.ma.bean.Categorie;
import com.salah.ma.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    @PostMapping("")
    public void save(@RequestBody Categorie categorie) {
        categorieService.save(categorie);
    }

    @PostMapping("/update")
    public void update(@RequestParam String label, @RequestParam String code, @RequestParam int id) {
        categorieService.updateCategorie(label,code,id);
    }

    @GetMapping("")
    public List<Categorie> findAll() {
        return categorieService.findAll();
    }

    @GetMapping("/findByCode/{code}")
    public Categorie findByCode(@PathVariable String code) {
        return categorieService.findByCode(code);
    }

}
