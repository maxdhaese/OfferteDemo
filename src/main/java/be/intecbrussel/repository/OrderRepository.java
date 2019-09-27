package be.intecbrussel.repository;


import be.intecbrussel.Order;

public interface OrderRepository {
    //Create & Update
    Order saveOrder(Order order);

    //Read
    Order readOrder(Integer id);

    //Delete
    boolean deleteOrder(Integer id);

    boolean deleteOrder(Order order);
}
