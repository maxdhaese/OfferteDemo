package be.intecbrussel;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Integer idProduct;

    @ManyToMany
    private Set<Offerte> offerteSet;

    @ManyToOne
    private Order order;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdProduct() {
        return idProduct;
    }


    public Set<Offerte> getOfferteSet() {
        return offerteSet;
    }

    public void setOfferteSet(Set<Offerte> offerteSet) {
        this.offerteSet = offerteSet;
    }

    public Product setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
        return this;
    }



    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}


