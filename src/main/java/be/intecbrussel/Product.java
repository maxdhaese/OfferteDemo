package be.intecbrussel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Integer idProduct;

    @ManyToMany(mappedBy = "productList")
    private Set<Offerte> offerteSet;

    public Product() {
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
}
