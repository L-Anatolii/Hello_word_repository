package com.auto.autodemo.repository;

import com.auto.autodemo.model.Automobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoRepository extends JpaRepository <Automobile, Long> {

}

