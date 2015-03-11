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
    /**
     * userId array has to be sorted first to use it
     */
    private int[] userId;
    private int[] itemId;
    private double[] rating;
    
    public void __construct() {
    }
    
    public void setItemRating(int itemId, double rating) {
        // if lenght is 0
        if (this.itemId.length > 0) {
        this.itemId[1] = itemId;
        this.rating[1] = rating;
    
        }
    }
}
