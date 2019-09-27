package be.intecbrussel;

import javax.persistence.*;
import java.util.List;


@Entity
public class Offerte {
    @Id
    @GeneratedValue
    private Integer idOfferte;
    private Double price;

    @ManyToOne
    private Client client;

    @ManyToMany
    private List<Product> productList;

    @OneToOne
    private Order order;

    public Offerte() {
    }

    public Integer getIdOfferte() {
        return idOfferte;
    }

    public void setIdOfferte(Integer idOfferte) {
        this.idOfferte = idOfferte;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
