package rikkei.academy.repository;

import org.springframework.transaction.annotation.Transactional;
import rikkei.academy.model.Blog;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Transactional
public class BlogRepositoryIMPL implements IBlogRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Blog> findAll() {
        TypedQuery<Blog> query = entityManager.createQuery("select b from Blog as b", Blog.class);
        return query.getResultList();
    }

    @Override
    public Blog findById(Long id) {
        Blog blog = entityManager.find(Blog.class, id);
        return blog;
    }

    @Override
    public void save(Blog blog) {
        if (blog.getId() != null) {
            entityManager.merge(blog);
        } else {
            entityManager.persist(blog);
        }
    }

    @Override
    public void remove(Long id) {
        Blog blog = findById(id);
        if (blog != null) {
            entityManager.remove(blog);
        }
    }
}
