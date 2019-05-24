package com.example.phuvo.recyclerview_v3;

import java.util.ArrayList;

public class MyDB {
    public static ArrayList<Product> product_list = new ArrayList<>();
    public static ArrayList<Integer> cart_items = new ArrayList<>();

    public MyDB() {
        this.product_list.add(new Product("Túi Mini", 1200, "Túi xách hiện đại, trẻ trung, năng động", R.drawable.a));

        this.product_list.add(new Product("Túi Dự tiệc", 750, "Túi xách hiện đại, trẻ trung, năng động", R.drawable.b));
        this.product_list.add(new Product("Túi Model", 420, "Túi xách hiện đại, trẻ trung, năng động", R.drawable.h));
        this.product_list.add(new Product("Túi Nhe Nhang", 999, "Túi xách hiện đại, trẻ trung, năng động", R.drawable.t));

    }

    public static float getTotal() {
        float total = 0;
        for (int i = 0; i < product_list.size(); i++) {
            for (int item:cart_items){
                if (item == i){
                    total+= product_list.get(i).getPrice();
                }
            }

        }
        return total;
    }
}
