package com.crud_exam.spring_project.repository;
import com.crud_exam.spring_project.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByName(String name);
}
