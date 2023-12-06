package com.avi.major.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avi.major.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
