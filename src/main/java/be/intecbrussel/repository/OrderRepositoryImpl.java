package be.intecbrussel.repository;

import be.intecbrussel.Order;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class OrderRepositoryImpl implements OrderRepository {

    private final EntityManagerFactory emf;

    public OrderRepositoryImpl(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public Order saveOrder(Order order) {
        EntityManager em = emf.createEntityManager();
        em.persist(order);

        em.getTransaction().begin();
        em.getTransaction().commit();

        return order;

    }

    @Override
    public Order readOrder(Integer id) {
        EntityManager em = emf.createEntityManager();

        return em.find(Order.class, id);

    }

    @Override
    public boolean deleteOrder(Integer id) {
        EntityManager em = emf.createEntityManager();
        Order or = em.find(Order.class, id);

        if (or == null) return false;
        else {
            em.remove(or);
            em.getTransaction().begin();
            em.getTransaction().commit();
            return true;
        }

    }

    @Override
    public boolean deleteOrder(Order order) {
        return false;
    }
}
