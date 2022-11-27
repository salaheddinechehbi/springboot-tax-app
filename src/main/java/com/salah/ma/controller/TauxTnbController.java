package com.salah.ma.controller;

import com.salah.ma.bean.TauxTnb;
import com.salah.ma.service.TauxTnbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tauxTnbs")
public class TauxTnbController {

    @Autowired
    private TauxTnbService tauxTnbService;

    @GetMapping("")
    public List<TauxTnb> findAll() {
        return tauxTnbService.findAll();
    }

    @PostMapping("")
    public void save(@RequestBody TauxTnb tauxTnb) {
        tauxTnbService.save(tauxTnb);
    }

    @GetMapping("find/{id}")
    public TauxTnb findById(@PathVariable Long aLong) {
        return tauxTnbService.findById(aLong);
    }

    public long count() {
        return tauxTnbService.count();
    }

    @DeleteMapping("")
    public void deleteById(@RequestParam Long aLong) {
        tauxTnbService.deleteById(aLong);
    }
}
