package be.intecbrussel.repository;

import be.intecbrussel.Order;
import be.intecbrussel.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

    private final EntityManagerFactory emf;

    private List<Product> productList;
    public ProductRepositoryImpl(EntityManagerFactory emf) {
        this.emf = emf;
    }

//    @Override
//    public Product saveProduct(Product product) {
//        EntityManager em = emf.createEntityManager();
//        em.persist(product);
//
//        em.getTransaction().begin();
//        em.getTransaction().commit();
//
//        return product;
//
//    }

    @Override
    public Product readProduct(Integer id) {
        EntityManager em = emf.createEntityManager();

        return em.find(Product.class, id);
    }
}
