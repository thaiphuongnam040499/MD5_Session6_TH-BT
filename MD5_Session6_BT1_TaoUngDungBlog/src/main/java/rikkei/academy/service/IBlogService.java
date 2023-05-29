package rikkei.academy.service;

import rikkei.academy.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();
    Blog findById(Long id);
    void save(Blog blog);
    void remove(Long id);
}
