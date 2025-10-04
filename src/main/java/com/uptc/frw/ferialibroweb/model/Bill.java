package com.uptc.frw.ferialibroweb.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "COMPRAS")
public class Bill {
    @Id
    @Column(name = "ID_COMPRA")
    private long id;
    @Column(name = "ID_PERSONA", insertable = false, updatable = false)
    private long personId;
    @Column(name = "FECHA")
    private Date date;
    @ManyToOne
    @JoinColumn(name = "ID_PERSONA")
    private Person person;
    @OneToMany(mappedBy = "bill")
    private List<BillDetail> billDetails;

    public Bill() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<BillDetail> getBillDetails() {
        return billDetails;
    }

    public void setBillDetails(List<BillDetail> billDetails) {
        this.billDetails = billDetails;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", personId=" + personId +
                ", date=" + date +
                '}';
    }
}
