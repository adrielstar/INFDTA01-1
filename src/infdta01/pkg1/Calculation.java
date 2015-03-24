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
    
    public Calculation() throws FileNotFoundException {
        System.out.println("Calculation begin..\n");
        this.users = new ArrayList<>();
        this.fillData();
        System.out.println("Calculation end..\n");
    }
    public final void fillData() throws FileNotFoundException {
        System.out.println("fillData begin..");
        String fileName = "UserItem.txt";
        File file = new File (fileName);
        Scanner read = new Scanner(file);
        
        while(read.hasNextLine())
        {
            String line = read.nextLine();
            System.out.println(line);
            String[] tokens = line.split(",", -1);
            
            int aUserId = Integer.parseInt(tokens[0]);
            int aItemId = Integer.parseInt(tokens[1]);
            double aRating = Double.parseDouble(tokens[2]);
            
            this.addUserAndInfo(aUserId, aItemId, aRating);
        }
        System.out.println("fillData end..\n");
    }
    
    public boolean userExists(User user) {
        int id = user.getUserId();
        int index = 0;
        for (User temp : this.users) {
            if (temp.getUserId() == id) {
                return true;
            }
            index++;
        }
        return false;
    }
    
    public void addDetails(User user, int itemId, double rating) {
        user.setItemAndRating(itemId, rating);
    }
    
    public void addUserAndInfo(int userId, int itemId, double rating) {
        User user = new User(userId);
        user.setItemAndRating(itemId, rating);
        if (this.userExists(user)) {
            this.addDetails(user, itemId, rating);
        } else {
            this.users.add(user);
        }
    }
    
    public void printUsers() {
        System.out.println("UserList size " + this.users.size());
    }
}
