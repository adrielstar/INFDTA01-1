/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infdta01.pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author isaacdecuba
 */
public class Calculation {
    public List<User> users;
    
    public Calculation(String location) throws FileNotFoundException {
        this.users = new ArrayList<>();
        this.fillData(location);
    }
    public final void fillData(String location) throws FileNotFoundException {
        String fileName = location;
        File file = new File (fileName);
        Scanner read = new Scanner(file);
        
        while(read.hasNextLine())
        {
            String line = read.nextLine();
            String[] tokens = line.split(",", -1);
            
            int aUserId = Integer.parseInt(tokens[0]);
            int aItemId = Integer.parseInt(tokens[1]);
            double aRating = Double.parseDouble(tokens[2]);
            
            this.addUserAndInfo(aUserId, aItemId, aRating);
        }
    }
    
    public void addDetails(User user, int itemId, double rating) {
        user.setItemAndRating(itemId, rating);
    }
    
    public void addUserAndInfo(int userId, int itemId, double rating) {
        for (User user : this.users) {
            if (user.getUserId() == userId) {
                user.setItemAndRating(itemId, rating);
                return;
            } 
        }
        
        User user = new User(userId);
        this.users.add(user);
        this.addDetails(user, itemId, rating);
    }
    
    public void printUsers() {
        System.out.println("UserList size " + this.users.size());
        for (User user : this.users) {
            System.out.println("index: " + this.users.indexOf(user));
            System.out.println("User Id: " + user.getUserId());
        }
    }
    
    /**
     * Get the user object from the [unsorted] user list
     * 
     * @param userId
     * @return User
     */
    public User getUser(int userId) {
        for (User user : this.users) {
            if (user.getUserId() == userId) {
                return this.users.get(this.users.indexOf(user));
            }
        }
        return null;
    }
}
