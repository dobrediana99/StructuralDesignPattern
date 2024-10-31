package org.example.structural.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String category;
    private boolean featured;
    private boolean bestseller;

    // Constructors
    public Book() {}

    public Book(String title, String author, String category) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.featured = false;
        this.bestseller = false;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public boolean isFeatured() { return featured; }
    public void setFeatured(boolean featured) { this.featured = featured; }

    public boolean isBestseller() { return bestseller; }
    public void setBestseller(boolean bestseller) { this.bestseller = bestseller; }
    public String getDescription() {
        StringBuilder description = new StringBuilder();
        description.append("Title: ").append(this.title)
                .append(", Author: ").append(this.author)
                .append(", Category: ").append(this.category);

        if (this.featured) {
            description.append(" (Featured)");
        }
        if (this.bestseller) {
            description.append(" (Bestseller)");
        }
        return description.toString();
    }

}

