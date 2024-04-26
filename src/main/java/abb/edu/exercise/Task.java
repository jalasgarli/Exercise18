package abb.edu.exercise;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String title;
    private String description;

    public Long getId() {
        return Id;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setId(Long Id) {
        this.Id = Id;
    }
    public  void setDescription(String description) {
        this.description = description;
    }
}
