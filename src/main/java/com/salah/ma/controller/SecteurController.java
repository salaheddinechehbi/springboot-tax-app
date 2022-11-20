package com.salah.ma.controller;

import com.salah.ma.bean.Secteur;
import com.salah.ma.service.SecteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/secteurs")
public class SecteurController {

    @Autowired
    private SecteurService secteurService;

    @PostMapping("")
    public void save(@RequestBody Secteur secteur) {
        secteurService.save(secteur);
    }

    @PostMapping("update")
    public void updateCategorie(@RequestParam String label, @RequestParam String code, @RequestParam int id) {
        secteurService.updateCategorie(label, code, id);
    }

    public void delete(@RequestParam int id) {
        secteurService.delete(id);
    }

    @GetMapping("")
    public List<Secteur> findAll() {
        return secteurService.findAll();
    }

    public int countSecteur() {
        return secteurService.countSecteur();
    }

    @GetMapping("find/{id}")
    public Secteur findById(@PathVariable int id) {
        return secteurService.findById(id);
    }

    @GetMapping("findByCode/{code}")
    public Secteur findByCode(@PathVariable String code) {
        return secteurService.findByCode(code);
    }
}
