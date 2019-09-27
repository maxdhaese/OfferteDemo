package be.intecbrussel;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Order_Table")
public class Order {

    @Id
    @GeneratedValue
    private Integer idOrder;

    @OneToOne (mappedBy = "order")
    private Offerte offerte;

    @OneToOne (mappedBy = "order")
    private Client client;

    @OneToMany (mappedBy = "order")
    private List<Product> productList;

    public Order() {

        }


    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

  public Offerte getOfferte() {
        return offerte;
    }

    public void setOfferte(Offerte offerte) {
        this.offerte = offerte;
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

    public Order setProductList(List<Product> productList) {
        this.productList = productList;
        return this;
    }
}
