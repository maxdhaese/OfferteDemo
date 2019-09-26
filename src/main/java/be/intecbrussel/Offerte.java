package be.intecbrussel;

import javax.persistence.*;


@Entity
public class Offerte {
    @Id
    @GeneratedValue
    private Integer idOfferte;
    private Double price;

    @ManyToOne
    private Client client;

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
}
