package com.emergon.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity(name = "Customer")
@Table(name = "customer")
@NamedQueries({
@NamedQuery(name = "Customer.deleteById", query = "DELETE FROM Customer c WHERE c.ccode=:kwdikos")
})
public class Customer implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ccode")
    private int ccode;
    @Column(name = "cname")
    private String cname;
    

    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" + "cname=" + cname + ", ccode=" + ccode + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.cname);
        hash = 53 * hash + this.ccode;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customer other = (Customer) obj;
        if (this.ccode != other.ccode) {
            return false;
        }
        if (!Objects.equals(this.cname, other.cname)) {
            return false;
        }
        return true;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCcode() {
        return ccode;
    }

    public void setCcode(int ccode) {
        this.ccode = ccode;
    }

    public Customer(String cname, int ccode) {
        this.cname = cname;
        this.ccode = ccode;
    }

    
}
