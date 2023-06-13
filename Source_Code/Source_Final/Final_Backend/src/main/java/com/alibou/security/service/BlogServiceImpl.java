package com.alibou.security.service;


import com.alibou.security.dao.BlogRepository;
import com.alibou.security.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BlogServiceImpl implements BlogService{

    private BlogRepository blogRepository;
    @Autowired
    public BlogServiceImpl(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }


    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findById(int id) {
        Optional<Blog> result = blogRepository.findById(id);
        Blog blog = null;
        if(result.isPresent()){
            blog = result.get();
        }else{
            throw new RuntimeException("Did not find Blog id" + id);
        }
        return blog;
    }

    @Override
    public Blog save(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public void deleteById(int id) {
        blogRepository.deleteById(id);
    }
}
