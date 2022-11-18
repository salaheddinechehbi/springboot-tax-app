package com.salah.ma;

import com.salah.ma.bean.Categorie;
import com.salah.ma.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorie")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    @PostMapping("")
    public void save(@RequestBody Categorie categorie) {
        categorieService.save(categorie);
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
