package gr.aueb.cf.study.oop;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayInvetory() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
}
