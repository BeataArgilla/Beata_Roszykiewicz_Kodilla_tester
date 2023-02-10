package com.kodilla.execution_model.homework;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrders(Order orders) {
        this.orders.add(orders);
    }

    public Order getOrder(int index) {
        if (index >= 0 && index < orders.size()) {
            return this.orders.get(index);
        }
        return null;
    }

    public void clear() {
        this.orders.clear();
    }
    public int getSize() {
        return this.orders.size();
    }
    public List<Order> getOrdersWithinDateRange(Date startDate, Date endDate) {
        List<Order> result = new ArrayList<>();
        for (Order order : orders) {
            if (order.getDate().after(startDate) && order.getDate().before(endDate)) {
                result.add(order);
            }
        }
        return result;
    }

    public List<Order> getOrdersWithinValueRange(double minValue, double maxValue) {
        List<Order> result = new ArrayList<>();
        for (Order order : orders) {
            if (order.getOrderValue() >= minValue && order.getOrderValue() <= maxValue) {
                result.add(order);
            }
        }
        return result;
    }

    public int getOrderCount() {
        return orders.size();
    }

    public double getTotalOrderValue() {
        double total = 0;
        for (Order order : orders) {
            total += order.getOrderValue();
        }
        return total;
    }
}

