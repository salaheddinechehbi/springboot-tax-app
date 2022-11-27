package com.salah.ma.service;

import com.salah.ma.bean.Redevable;
import com.salah.ma.repository.RedevableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RedevableService {

    @Autowired
    private RedevableRepository redevableRepository;

    public int countRedevable() {
        return redevableRepository.countRedevable();
    }

    public Redevable findByNameLikeOrEmailLike(String name, String email) {
        return redevableRepository.findByNameLikeOrEmailLike(name, email);
    }

    public List<Redevable> findAll() {
        return redevableRepository.findAll();
    }

    public List<Redevable> findAll(Sort sort) {
        return redevableRepository.findAll(sort);
    }

    public Redevable save(Redevable r) {
        return redevableRepository.save(r);
    }

    public long count() {
        return redevableRepository.count();
    }

    @Transactional
    public void deleteById(Long aLong) {
        redevableRepository.deleteById(aLong);
    }

    @Transactional
    public void delete(Redevable entity) {
        redevableRepository.delete(entity);
    }

    public Redevable findByCin(String cin) {
        return redevableRepository.findByCin(cin);
    }
}
