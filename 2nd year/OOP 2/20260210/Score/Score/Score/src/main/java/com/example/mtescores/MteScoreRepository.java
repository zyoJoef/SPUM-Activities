package com.example.mtescores;

import org.springframework.data.jpa.repository.JpaRepository;  
import org.springframework.stereotype.Repository;

@Repository
public interface MteScoreRepository extends JpaRepository<MteScore, Integer> {
}
