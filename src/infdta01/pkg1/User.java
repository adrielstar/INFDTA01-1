/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infdta01.pkg1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author isaac
 */
public class User {
    
    public final int userId;
    public final HashMap<Integer,Double> ratedItems; 

    public User(int userId) {
        this.ratedItems = new HashMap<>();
        this.userId = userId;
    }
    
    /**
     * Set the item id and rating
     * 
     * @param itemId
     * @param rating 
     */
    public void setItemAndRating(int itemId, double rating) {
        this.ratedItems.put(itemId, rating);
    }

    public int getUserId() {
        return this.userId;
    }
    
    public HashMap<Integer, Double> getRatedItems() {
        return this.ratedItems;
    }
    
    public void printRatedItems() {
        System.out.println("User id: " + this.userId);
        for (Map.Entry<Integer,Double> item : this.ratedItems.entrySet()) {
            System.out.println("Key: " + item.getKey() + " Value: " + item.getValue());
        }
    }
}
