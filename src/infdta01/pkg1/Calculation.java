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
        System.out.println(this.users.size() + "\n");
    }
    public void fillData() throws FileNotFoundException {
        System.out.println("fillData begin..\n");
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
    
    public void addUserAndInfo(int userId, int itemId, double rating) {
        System.out.println("Size: " + this.users.size());
        User user = new User(userId);
        user.setItemAndRating(itemId, rating);
        if (this.userExists(user)) {
            int index = this.users.indexOf(user);
            System.out.println("index: " + index);
            // show index of the user >> this.list.get(index).setItemAndRating(itemId, rating);
            // add the itemid and rating into the user object
            // index turning to be -1 check this out !!!!!
            this.users.get(index).setItemAndRating(itemId, rating);
        } else {
            // add user to the users list
            // add the itemid and rating into the user object
            this.users.add(user);
            System.out.println("Size: " + this.users.size());
        }
    }
    
    public void printUsers() {
        System.out.println("Size " + this.users.size());
        System.out.println("UserList " + this.users);
    }
}
