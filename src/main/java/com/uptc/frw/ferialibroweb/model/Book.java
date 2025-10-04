package com.uptc.frw.ferialibroweb.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "LIBROS")
public class Book {
    @Id
    @Column(name = "ID_LIBRO")
    private long id;
    @Column(name = "TITULO")
    private String title;
    @Column(name = "PRECIO")
    private double price;
    @JsonIgnore
    @OneToOne(mappedBy = "book")
    private Edition edition;
    @JsonIgnore
    @OneToMany(mappedBy = "book")
    private List<BillDetail> billDetails;
    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "AUTOR_LIBRO",
            joinColumns = @JoinColumn(name = "ID_LIBRO"),
            inverseJoinColumns = @JoinColumn(name = "ID_AUTOR")
    )
    private List<Person> authors;

    public Book() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Edition getEdition() {
        return edition;
    }

    public void setEdition(Edition edition) {
        this.edition = edition;
    }

    public List<BillDetail> getBillDetails() {
        return billDetails;
    }

    public void setBillDetails(List<BillDetail> billDetails) {
        this.billDetails = billDetails;
    }

    public List<Person> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Person> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
