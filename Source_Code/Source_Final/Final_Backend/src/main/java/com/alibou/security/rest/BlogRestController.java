package com.alibou.security.rest;


import com.alibou.security.entity.Blog;
import com.alibou.security.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class BlogRestController {

    private BlogService blogService;

    @Autowired
    public BlogRestController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/blog")
    public List<Blog> findAll(){
        List<Blog> blogs = blogService.findAll();

        return blogs;
    }

    // add mapping for GET/employees/{employeeId}

    @GetMapping("/blog/{blogId}")
    public Blog getBlogById(@PathVariable int blogId){
        Blog blog = blogService.findById(blogId);

        if(blog == null){
            throw new RuntimeException("Blog id not found_" + blogId);
        }
        return blog;
    }

    // add mapping for POST /employees - add new employee
    @PostMapping("/blog")
    public Blog addBlog(@RequestBody Blog blog){
        blog.setBlogID(0);
        Blog dbBlog = blogService.save(blog);
        return dbBlog;
    }

    // add Mapping for Put
    @PutMapping("/blog")
    public Blog updateBlog(@RequestBody Blog blog){
        Blog dbBlog = blogService.save(blog);
        return dbBlog;
    }

    // add Mapping for Delete / employees/{employeeId}

    @DeleteMapping("/blog/{blogId}")
    public String deleteBlog(@PathVariable int blogId) {
        Blog theBlog = blogService.findById(blogId);

        if (theBlog == null) {
            throw new RuntimeException("Blog is not found " + blogId);
        }
        blogService.deleteById(blogId);

        return "Deleted blog id " + blogId;
    }
}
