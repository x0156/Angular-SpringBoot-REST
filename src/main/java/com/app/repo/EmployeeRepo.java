package com.app.repo;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.*;
import com.app.model.employee.*;
import org.springframework.data.repository.CrudRepository;


public interface EmployeeRepo extends JpaRepository<Employee, Integer>, CrudRepository<Employee,Integer> {
    public List<Employee> findAll();
    public Page<Employee> findAll(Pageable p);
    Employee save(Employee e);
    void delete(Employee e);
    default  void delete(Integer id){
        deleteById(id);
    }
    default boolean exists( Integer id){
        return existsById(id);
    }
}

