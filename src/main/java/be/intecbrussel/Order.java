package be.intecbrussel;

import javax.persistence.*;

@Entity
public class Order {

    @Id
    @GeneratedValue
    private Integer idOrder;

    @OneToOne
    private Offerte offerte;

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


}
