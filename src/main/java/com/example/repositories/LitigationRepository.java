package com.example.legal.repositories;

import com.example.legal.models.Contract;
import com.example.legal.models.Litigation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LitigationRepository extends JpaRepository<Litigation, Integer> {
}
