package com.alibou.security.rest;


import com.alibou.security.entity.Category;
import com.alibou.security.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryRestController {

    private CategoryService categoryService;

    public CategoryRestController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/category")
    public List<Category> findAll(){
        List<Category> categories = categoryService.findAll();

        return categories;
    }

    @GetMapping("/category/{categoryId}")
    public Category getCategoryById(@PathVariable int categoryId){
        Category category = categoryService.findById(categoryId);

        if(category == null){
            throw new RuntimeException("Category id not found: " + categoryId);
        }

        return category;
    }

    @PostMapping("/category")
    public Category addCategory(@RequestBody Category category){
        category.setCategoryId(0);
        Category dbCategory = categoryService.save(category);
        return dbCategory;
    }

    @PutMapping("/category")
    public Category updateCategory(@RequestBody Category category){
        Category dbCategory = categoryService.save(category);
        return dbCategory;
    }

    @DeleteMapping("/category/{categoryId}")
    public String deleteCategory(@PathVariable int categoryId) {
        Category theCategory = categoryService.findById(categoryId);

        if (theCategory == null) {
            throw new RuntimeException("Category is not found: " + categoryId);
        }

        categoryService.deleteById(categoryId);

        return "Deleted category id: " + categoryId;
    }
}
