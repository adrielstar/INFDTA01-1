/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infdta01.pkg1;

import java.util.ArrayList;

/**
 *
 * @author isaac
 */
public class User {
    
    private final int userId;
    private ArrayList itemId;
    private ArrayList rating;

    public User(int userId) {
        
        this.itemId = new ArrayList<>();
        this.rating = new ArrayList<>();
        this.userId = userId;
    }

    User() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setItemId(int itemId) {
        this.itemId.add(itemId);
    }
    
    /**
     * Set the item id and rating
     * 
     * @param itemId
     * @param rating 
     */
    public void setItemAndRating(int itemId, double rating) {
        this.itemId.add(itemId);
        this.rating.add(rating);
    }

    public int getUserId() {
        return this.userId;
    }

    public ArrayList getItemsList() {
        return this.itemId;
    }

    public ArrayList getRatingsList() {
        return this.rating;
    }
}
