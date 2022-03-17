package com.example.webpos.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Cart {

    private List<Item> items = new ArrayList<>();

    public boolean addItem(Item item) {
        for (Item temp : items) {
            if (temp.getProduct() == item.getProduct()) {
                temp.add(item.getQuantity());
                if (temp.getQuantity() <= 0) {
                    items.remove(temp);
                }
                return true;
            }
        }
        return items.add(item);
    }
    public boolean delete(String productId){
        for(Item temp:items){
            if(temp.getProduct().getId() == productId){
                items.remove(temp);
                return true;
            }
        }
        return false;
    }
    public double total(){
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).getQuantity() * items.get(i).getProduct().getPrice();
        }
        return total;
    }
    public void cancel(){
        items.clear();
    }
    public boolean charge(){
        items.clear();
        return true;
    }
    @Override
    public String toString() {
        if (items.size() ==0){
            return "Empty Cart";
        }
        double total = 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cart -----------------\n"  );

        for (int i = 0; i < items.size(); i++) {
            stringBuilder.append(items.get(i).toString()).append("\n");
            total += items.get(i).getQuantity() * items.get(i).getProduct().getPrice();
        }
        stringBuilder.append("----------------------\n"  );

        stringBuilder.append("Total...\t\t\t" + total );

        return stringBuilder.toString();
    }
}
