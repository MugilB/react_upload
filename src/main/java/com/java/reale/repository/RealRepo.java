package com.java.reale.repository;

import com.java.reale.model.Real;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealRepo extends JpaRepository<Real, Integer> {
}
