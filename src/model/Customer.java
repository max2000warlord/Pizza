package model;

import java.util.LinkedList;

import javafx.beans.property.*;
import javafx.collections.*;

public class Customer {
    private Kitchen kitchen;
    private String phone;
    private String name;
    private ObservableList<Pizza> ordered = FXCollections.observableArrayList();
    private ObservableList<Pizza> order = FXCollections.observableArrayList();
    private DoubleProperty balance = new SimpleDoubleProperty();
    private StringProperty cash = new SimpleStringProperty();

    public Customer(Kitchen kitchen, String phone, String name) {
        this.kitchen = kitchen;
        this.phone = phone;
        this.name = name;
        this.balance.set(0.0);
    }

    public final void setBalance() {balance.set(getOrderPrice());}
    public ReadOnlyDoubleProperty orderPrice() {return balance;}

    public void cancelOrder() {
        order.clear();
    }

    public void submitOrder() {
        if (order.size() > 0) {
            for (Pizza pizza : order) {
                pizza.sell();
                if (ordered.contains(pizza))
                    bubble(pizza);
                else
                    ordered.add(pizza);
            }
            order.clear();
        }
    }

    public double getOrderPrice() {
        double sum = 0.0;
        for (Pizza pizza : order)
            sum += pizza.getPrice();
        return sum;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public ObservableList<Pizza> getOrdered() {return ordered;}

    public ObservableList<Pizza> getOrder() {return order;}

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public Pizza createPizza() {
        return new Pizza(this);
    }

    private void bubble(Pizza pizza) {
        for (int i = ordered.indexOf(pizza);
                i > 0 && ordered.get(i).getSold() > ordered.get(i-1).getSold();
                i--) {
            Pizza temp = ordered.get(i - 1);
            ordered.set(i - 1, ordered.get(i));
            ordered.set(i, temp);
        }
    }

    // This method is package protected so that it can't be used outside this package.
    // If you want to order a pizza, you should instead use pizza.order();
    void order(Pizza pizza) {
        order.add(pizza);
    }

    public boolean matches(String phone) {
        return this.phone.equals(phone);
    }

    @Override
    public String toString() {
        return name + ": " + phone;
    }
}
