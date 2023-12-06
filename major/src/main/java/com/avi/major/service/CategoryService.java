package com.avi.major.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avi.major.model.Category;
import com.avi.major.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	public List<Category> getAllCategory(){
		return categoryRepository.findAll();
	}
	public void addCategory(Category category) {
		categoryRepository.save(category);
	}
	public void removeCategoryById(Integer id) {
		categoryRepository.deleteById(id);
	}
	public Optional<Category> getCategoryById(Integer id) {
		return categoryRepository.findById(id);
	}
}
