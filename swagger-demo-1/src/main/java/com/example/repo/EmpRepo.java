package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.EmpEntity;

@Repository
public interface EmpRepo extends JpaRepository<EmpEntity,Integer>{

}
