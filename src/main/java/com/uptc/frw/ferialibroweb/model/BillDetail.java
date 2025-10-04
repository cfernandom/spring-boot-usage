package com.uptc.frw.ferialibroweb.model;

import jakarta.persistence.*;

@Entity
@Table(name = "DETALLES_COMPRA")
public class BillDetail {
    @Id
    @Column(name = "ID_DETALLE")
    private long id;
    @Column(name = "ID_COMPRA", updatable = false, insertable = false)
    private long BillId;
    @Column(name = "ID_LIBRO", updatable = false, insertable = false)
    private long BookId;
    @Column(name = "CANTIDAD")
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "ID_COMPRA")
    private Bill bill;
    @ManyToOne
    @JoinColumn(name = "ID_LIBRO")
    private Book book;

    public BillDetail() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBillId() {
        return BillId;
    }

    public void setBillId(long billId) {
        BillId = billId;
    }

    public long getBookId() {
        return BookId;
    }

    public void setBookId(long bookId) {
        BookId = bookId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "BillDetail{" +
                "id=" + id +
                ", BillId=" + BillId +
                ", BookId=" + BookId +
                ", quantity=" + quantity +
                '}';
    }
}
