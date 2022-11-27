package com.salah.ma.controller;

import com.salah.ma.bean.Quartier;
import com.salah.ma.service.QuartierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/quartiers")
public class QuartierController {

    @Autowired
    private QuartierService quartierService;

    @GetMapping("/findByLabel/{label}")
    public Quartier findByLabel(@PathVariable String label) {
        return quartierService.findByLabel(label);
    }

    @GetMapping("")
    public List<Quartier> findAll() {
        return quartierService.findAll();
    }

    @PostMapping("")
    public void save(@RequestBody Quartier quartier) {
        quartierService.save(quartier);
    }

    @GetMapping("/find/{id}")
    public Quartier findById(@PathVariable Long aLong) {
        return quartierService.findById(aLong);
    }

    public long count() {
        return quartierService.count();
    }

    @DeleteMapping
    public void deleteById(Long aLong) {
        quartierService.deleteById(aLong);
    }
}
