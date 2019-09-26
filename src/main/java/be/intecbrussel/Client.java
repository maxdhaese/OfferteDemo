package be.intecbrussel;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue
    private Integer idClient;
    private String name;
    private String address;
    @Email
    private String email;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Offerte> offerteList;

    public Client() {
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Offerte> getOfferteList() {
        return offerteList;
    }

    public void setOfferteList(List<Offerte> offerteList) {
        this.offerteList = offerteList;
    }
}
