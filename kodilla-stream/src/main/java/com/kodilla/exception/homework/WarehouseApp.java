package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("456"));

        try {
            Order order = warehouse.getOrder("789");
            System.out.println("Found order with number " + order.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
