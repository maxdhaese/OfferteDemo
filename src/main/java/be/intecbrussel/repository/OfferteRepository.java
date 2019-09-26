package be.intecbrussel.repository;

import be.intecbrussel.Offerte;

public interface OfferteRepository {
    //Create
    Offerte saveOfferte (Offerte offerte);

    //Read
    Offerte readOfferte (Integer id);

    //Delete
    boolean deleteOfferte (Integer id);

    boolean deleteOfferte (Offerte offerte);

}
