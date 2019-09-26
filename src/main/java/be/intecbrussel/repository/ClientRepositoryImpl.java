package be.intecbrussel.repository;

import be.intecbrussel.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class ClientRepositoryImpl implements ClientRepository{

    private final EntityManagerFactory emf;

    public ClientRepositoryImpl(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public Client saveClient(Client client) {
        EntityManager em = emf.createEntityManager();
        em.persist(client);

        em.getTransaction().begin();
        em.getTransaction().commit();

        return client;
    }

    @Override
    public Client readClient(Integer id) {
        EntityManager em = emf.createEntityManager();

        return em.find(Client.class, id);
    }

    @Override
    public boolean deleteClient(Integer id) {
        EntityManager em = emf.createEntityManager();
        Client c = em.find(Client.class, id);

        if (c == null) return false;
        else {
            em.remove(c);
            em.getTransaction().begin();
            em.getTransaction().commit();
            return true;
        }

    }

    @Override
    public boolean deleteClient(Client client) {
        return false;
    }


}
