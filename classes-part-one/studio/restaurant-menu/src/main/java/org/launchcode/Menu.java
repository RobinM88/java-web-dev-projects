package org.launchcode;

import java.util.Date;
import java.util.HashMap;


public class Menu {
    private HashMap<String, MenuItem> itemsByName;
    private Date lastUpdate;

    public Menu() {
        this.itemsByName = new HashMap<>();
        this.lastUpdate = new Date();
    }

    public void addItem(MenuItem item) {
        itemsByName.put(item.getName(), item);
        lastUpdate = new Date();
    }

    public void removeItem(String itemName) {
        itemsByName.remove(itemName);
        lastUpdate = new Date();
    }

    public boolean isNewItem(String itemName) {
        MenuItem item = itemsByName.get(itemName);
        return item != null && item.isNew();
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void displayMenuItem(String itemName) {
        MenuItem item = itemsByName.get(itemName);
        if (item != null) {
            System.out.println(item);
        }
    }

    public void displayMenu() {
        for (MenuItem item : itemsByName.values()) {
            System.out.println(item);
            System.out.println("------------------------");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Menu otherMenu = (Menu) obj;
        return itemsByName.equals(otherMenu.itemsByName) && lastUpdate.equals(otherMenu.lastUpdate);
    }
}
