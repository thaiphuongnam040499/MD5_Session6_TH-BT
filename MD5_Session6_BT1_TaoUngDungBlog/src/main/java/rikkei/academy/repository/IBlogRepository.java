package rikkei.academy.repository;

import rikkei.academy.model.Blog;

import java.util.List;

public interface IBlogRepository {
    List<Blog> findAll();
    Blog findById(Long id);
    void save(Blog blog);
    void remove(Long id);
}
