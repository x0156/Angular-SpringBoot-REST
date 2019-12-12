package com.app.repo;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.*;
import com.app.model.customer.*;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer>, CrudRepository<Customer,Integer> {
    public List<Customer> findAll();
    public Page<Customer> findAll(Pageable p);
    Customer save(Customer c);

    default void delete(Integer id){
        deleteById(id);
    }
    default boolean exists( Integer id){
        return  existsById(id);
    }

}

