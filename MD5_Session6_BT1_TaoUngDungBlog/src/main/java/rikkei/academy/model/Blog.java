package rikkei.academy.model;

import javax.persistence.*;

@Entity
@Table(name = "Blogs")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String message;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Blog(Long id, String title, String message) {
        this.id = id;
        this.title = title;
        this.message = message;
    }

    public Blog() {
    }
}
