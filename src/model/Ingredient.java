package model;

import javafx.beans.property.*;

import java.text.*;

public class Ingredient {
    private String name;
    private StringProperty ingName = new SimpleStringProperty();
    private double price;
    private Category category;
    private int sold;

    public Ingredient(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
        sold = 0;
    }

    public final void setIngName() {ingName.set(getName());}
    public ReadOnlyStringProperty ingName() {return ingName;}

    public void sell() {
        sold++;
    }

    public boolean in(Category category) {
        return this.category == category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getSold() {
        return sold;
    }

    public double getIncome() {
        return sold * price;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return name + " " + category;
    }

    private String formatted(double n) {
        return new DecimalFormat("###,##0.00").format(n);
    }
}
