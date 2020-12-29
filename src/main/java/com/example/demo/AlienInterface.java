package com.example.demo;

import com.example.demo.Alien;
import org.aspectj.apache.bcel.util.Repository;
import org.springframework.data.repository.CrudRepository;

public interface AlienInterface extends CrudRepository<Alien,Integer>{

}
