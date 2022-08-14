package BanHangMayTinh.impl;

import BanHangMayTinh.IColor;
import BanHangMayTinh.IOrder;
import DTO.Color;
import DTO.MayTinh;
import DTO.Order;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class OrderService implements IOrder {

    static LinkedList<Order> listOrder = new LinkedList<>();
    static LinkedList<MayTinh> listMay = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public LinkedList<Order> getAll() {
        if (listOrder.size() > 0) {
            return listOrder;
        }
        return dataOrder();
    }

    @Override
    public void editOrder(Order newOrder) {
        for (Order order: listOrder
             ) {
            if (order.getIdCustomer().equals(newOrder.getIdCustomer()));
            order.setNameCustomer(newOrder.getNameCustomer());
            order.setPhoneNumber(newOrder.getPhoneNumber());
        }
    }
    @Override
    public void insertOrder(Order order) {
        listOrder.add(order);
    }

    @Override
    public Order findByIdCustomer(Long idCustomer) {
        for (Order order: listOrder
        ) {
            if (order.getIdCustomer().equals(idCustomer));
            return order;
        }
        return null;
    }

    @Override
    public void deleteOrder(Long idCustomer) {
        for (Order order: dataOrder()
             ) {
            if (order.getIdCustomer().equals(idCustomer));
            listOrder.remove(order);
            break;
        }

    }


    @Override
    public void displayData(LinkedList<Order> orders) {
        for (Order order : orders
        ) {
            System.out.println("id " + order.getIdCustomer());
            System.out.println("Name" + order.getNameCustomer());
            System.out.println("phone number" + order.getPhoneNumber());
        }
    }

    @Override
    public void getCost(int quantity, float price) {
        System.out.println(" total Bill " + (quantity * price));
    }

    public static LinkedList<Order> dataOrder() {
        listOrder.add(new Order(1L, new Date ("2022/08/13"), 31L, "Jenny", "1234"));
        listOrder.add(new Order(2L,new Date ("2022/08/13"), 32L, "Jeni", "1245"));
        listOrder.add(new Order(3L, new Date ("2022/08/13"), 33L, "Jen", "12345"));
        listOrder.add(new Order(4L, new Date ("2022/08/13"), 34L, "Je", "1235"));
        return listOrder;
    }
}
