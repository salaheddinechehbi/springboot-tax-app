package com.salah.ma.controller;

import com.salah.ma.bean.Redevable;
import com.salah.ma.service.RedevableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/redevables")
public class RedevableController {

    @Autowired
    private RedevableService redevableService;

    public int countRedevable() {
        return redevableService.countRedevable();
    }

    @GetMapping("findByName/{name}/{email}")
    public Redevable findByNameLikeOrEmailLike(@PathVariable String name, @PathVariable String email) {
        return redevableService.findByNameLikeOrEmailLike(name, email);
    }

    @GetMapping("")
    public List<Redevable> findAll() {
        return redevableService.findAll();
    }

    @PostMapping("")
    public Redevable save(@RequestBody Redevable r) {
        return redevableService.save(r);
    }

    @PutMapping("")
    public Redevable update(@RequestBody Redevable r) {
        return redevableService.save(r);
    }

    public long count() {
        return redevableService.count();
    }

    @DeleteMapping()
    public void deleteById(Long aLong) {
        redevableService.deleteById(aLong);
    }

    public void delete(Redevable entity) {
        redevableService.delete(entity);
    }
}
