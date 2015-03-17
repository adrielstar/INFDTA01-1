package infdta01.pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class INFDTA011 {
 
  public static void main(String[] args) throws FileNotFoundException, IOException {
      
      UserPreference dummy = new UserPreference();
//      dummy.vul(101, 2.5);
//      dummy.vul(102, 3.0);
//      dummy.vul(102, 2.5);
      
      dummy.autoFill("UserItem.txt");
      System.out.println("Userid: " + Arrays.toString(dummy.userId));
      System.out.println("Itemid: " + Arrays.toString(dummy.itemId)); 
      System.out.println("Rating: " + Arrays.toString(dummy.rating));
//      dummy.vul(102, 2.5);
      
      Pearson calculator = new Pearson();
      double[] ratingPersonA = new double[5];
      ratingPersonA[0] = 4.75;
      ratingPersonA[1] = 4.50;
      ratingPersonA[2] = 5.0;
      ratingPersonA[3] = 4.25;
      ratingPersonA[4] = 4.0;
      double[] ratingPersonB = new double[5];
      ratingPersonB[0] = 4.0;
      ratingPersonB[1] = 3.0;
      ratingPersonB[2] = 5.0;
      ratingPersonB[3] = 2.0;
      ratingPersonB[4] = 1.0;
      calculator.calcPearson(ratingPersonA, ratingPersonB);
      calculator.printPearson();
      
    User[] users = new User[0];
      
    File file = new File ("UserItem.txt");
    Scanner read = new Scanner(file);
    int j = 1;
    while(read.hasNextLine())
    {
        String line = read.nextLine();
        String[] tokens = line.split(",", -1);
        
        // if user doesn't exist create user & add to array
        
        users = new User[j];
        User user = new User(1);
        users[1] = user;
        
        // add user -> userList
        // add movie -> movieList
    }
  }
}
