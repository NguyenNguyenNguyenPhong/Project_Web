package com.alibou.security.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoryID")
    private int categoryId;

    @Column(name = "parentcategoryID")
    private Integer parentCategoryId;

    @Column(name = "categoryname")
    private String categoryName;

    @Column(name = "issubcategory")
    private Boolean isSubCategory;

    // Constructors, getters, and setters

    public Category() {
    }

    public Category(Integer parentCategoryId, String categoryName, Boolean isSubCategory) {
        this.parentCategoryId = parentCategoryId;
        this.categoryName = categoryName;
        this.isSubCategory = isSubCategory;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(Integer parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Boolean getIsSubCategory() {
        return isSubCategory;
    }

    public void setIsSubCategory(Boolean isSubCategory) {
        this.isSubCategory = isSubCategory;
    }
}
