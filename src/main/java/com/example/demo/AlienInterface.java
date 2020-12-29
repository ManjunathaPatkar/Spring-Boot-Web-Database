package com.example.demo;

import com.example.demo.Alien;
import org.aspectj.apache.bcel.util.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlienInterface extends CrudRepository<Alien,Integer>{
    List<Alien> findByTech(String tech);
    List<Alien> findByAidGreaterThan(int aid);
    @Query("from Alien where tech=?1 order by aname")
    List<Alien> findByTechSorted(String tech);
}
