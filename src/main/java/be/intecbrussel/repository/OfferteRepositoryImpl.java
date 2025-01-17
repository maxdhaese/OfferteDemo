package be.intecbrussel.repository;

import be.intecbrussel.Offerte;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class OfferteRepositoryImpl implements OfferteRepository {

    private final EntityManagerFactory emf;

    public OfferteRepositoryImpl(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public Offerte saveOfferte(Offerte offerte) {
        EntityManager em = emf.createEntityManager();
        em.persist(offerte);

        em.getTransaction().begin();
        em.getTransaction().commit();

        return offerte;

}

    @Override
    public Offerte readOfferte(Integer id) {
        EntityManager em = emf.createEntityManager();

        return em.find(Offerte.class, id);

    }

    @Override
    public boolean deleteOfferte(Integer id) {
        EntityManager em = emf.createEntityManager();
        Offerte o = em.find(Offerte.class, id);

        if (o == null) return false;
        else {
            em.remove(o);
            em.getTransaction().begin();
            em.getTransaction().commit();
            return true;
        }

    }

    @Override
    public boolean deleteOfferte(Offerte offerte) {
        return false;
    }
}
