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
    
    private int userId;
    // sortert zijn
    // lezen van de data set (Text file)
    private int itemID[];
    private double rating[];
    //

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int[] getItemID() {
        return itemID;
    }

    public void setItemID(int[] itemID) {
        this.itemID = itemID;
    }

    public double[] getRating() {
        return rating;
    }

    public void setRating(double[] rating) {
        this.rating = rating;
    }
}
