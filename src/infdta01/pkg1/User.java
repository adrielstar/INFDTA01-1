/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infdta01.pkg1;

/**
 *
 * @author isaac
 */
public class User {
    
    private final int userId;
    private int[] itemId;
    private double[] rating;

    public User(int userId) {
        this.userId = userId;
    }

    public int[] getItemId() {
        return itemId;
    }

    public double[] getRating() {
        return rating;
    }
    
    public int getUserId()
    {
        return this.userId;
    }
    
}
