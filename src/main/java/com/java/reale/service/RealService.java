package com.java.reale.service;

import com.java.reale.model.Real;
import com.java.reale.repository.RealRepo;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RealService {

    @Autowired
    private RealRepo realRepo;

    public Real createReal(@NonNull Real real) {
        return realRepo.save(real);
    }

    public List<Real> getAllReals() {
        return realRepo.findAll();
    }

    public Real getRealById(@NonNull Integer id) {
        return realRepo.findById(id).orElse(null);
    }

    public boolean updateReal(int id, Real real) {
        if (getRealById(id) == null) {
            return false;
        }
        try {
            realRepo.save(real);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean deleteReal(int id) {
        if (getRealById(id) == null) {
            return false;
        }
        realRepo.deleteById(id);
        return true;
    }
}
