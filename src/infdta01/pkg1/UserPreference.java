/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infdta01.pkg1;

public class UserPreference {

    private int userid=0;
    private int[] itemid=new int[0];
    private double[] rating =new double[0];
    
    public void vul(int itemid,float rating) {
/*
        
        105, 3
        
        103, 6
        
        vrsgrn
        komt 103 al voor?
        Hoe binary search komt voor dan >0 
        komt niet voor dan < 0
        index van invoer = -1 * binary Search
        
        
        array 3 situatie invoegen
        1) in het begin
        2) tussen in : bin Search
        3) ....
        
        kopieer stukken mbv system.array.copy
        
        
        
        
        
        
        */
        
        this.itemid[1] = itemid;
        this.rating[1] = rating;
    
    }
}
