package be.intecbrussel;

import be.intecbrussel.repository.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("datasourceLocal");
        EntityManager em = emf.createEntityManager();

        Client client = new Client();
        client.setName("Intec BV");
        client.setAddress("Brussel");

        List<Product> products = new ArrayList<>();
        ProductRepositoryImpl pr = new ProductRepositoryImpl(emf);
        products.add(pr.readProduct(4));
        products.add(pr.readProduct(5));
        products.add(pr.readProduct(6));

        Offerte offerte = new Offerte();
        offerte.getIdOfferte();
        offerte.setClient(offerte.getClient());
        offerte.setPrice(1500.0);
        offerte.setProductList(products);

        Order order = new Order();
        order.setOfferte(offerte);
        order.setClient(offerte.getClient());
        order.setProductList(offerte.getProductList());

        ClientRepositoryImpl cr = new ClientRepositoryImpl(emf);
        cr.saveClient(client);

        OfferteRepositoryImpl ofr = new OfferteRepositoryImpl(emf);
        ofr.saveOfferte(offerte);

        OrderRepositoryImpl or = new OrderRepositoryImpl(emf);
        or.saveOrder(order);

        em.close();
        emf.close();
    }
}
