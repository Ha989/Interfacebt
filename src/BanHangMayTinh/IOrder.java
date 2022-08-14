package BanHangMayTinh;

import DTO.Color;
import DTO.Order;

import java.util.LinkedList;

public interface IOrder {

    LinkedList<Order> getAll();

    void editOrder(Order newOrder);

    void insertOrder(Order order);

    Order findByIdCustomer(Long idCustomer);

    void deleteOrder(Long idCustomer);

    void displayData(LinkedList<Order> orders);

    void getCost(int quantity, float price);

}
