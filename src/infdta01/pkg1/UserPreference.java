/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infdta01.pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class UserPreference {

    public int[] userId = new int[0];
    public int[] itemId = new int[0];
    public double[] rating = new double[0];
    
    public void vul(int userId, int itemId, double rating) {
        
        int itemIdLength = this.itemId.length;
        int newItemIdLength = itemIdLength + 1;
        
        if (itemIdLength == 0) {
            this.itemId = new int[newItemIdLength];
            this.rating = new double[newItemIdLength];
            
            this.itemId[itemIdLength] = itemId;
            this.rating[itemIdLength] = rating;
            
                
        } else {
            this.binaryInsert(userId, itemId, rating);
        } 
    }
   
    public void binaryInsert(int userId, int itemId, double rating) {
        int[] biggerItemId = new int[this.itemId.length+1];
        int[] biggerUserId = new int[this.userId.length+1];
        double[] biggerRating = new double[this.rating.length+1];
        
        /** Define a variable to indicate that if a property location is found.*/
        boolean found = false;
        /** Define a variable to store an index for insert*/
        int indexToInsert = 0;
        for (int i = 0; i < this.itemId.length; i++){
            if ( !found && itemId >= this.itemId[i]){
                found = true;
                indexToInsert = i;
                biggerUserId[indexToInsert] = userId;
                biggerItemId[indexToInsert] = itemId;
                biggerRating[indexToInsert] = rating;
                i--;
            }
            else{
               if(found)
               {
                  biggerUserId[i+1] = this.userId[i]; 
                  biggerItemId[i+1] = this.itemId[i]; 
                  biggerRating[i+1] = this.rating[i]; 
               }else
               {
                  biggerUserId[i] = this.userId[i];
                  biggerItemId[i] = this.itemId[i];
                  biggerRating[i] = this.rating[i];
               }

            }
        }

        /*
         * If a property index is not found. Then put the value at last. 
         */
        if(!found)
        {
            indexToInsert = this.itemId.length;//
            biggerUserId[indexToInsert] = userId;
            biggerItemId[indexToInsert] = itemId;
            biggerRating[indexToInsert] = rating;
        }
        this.itemId = biggerItemId;
        this.rating = biggerRating;
        this.userId = biggerUserId;
    }
    
    /**
     * Auto fill array using text files
     * 
     * @param fileName
     * @throws FileNotFoundException 
     */
    public void autoFill(String fileName) throws FileNotFoundException {
        File file = new File (fileName);
        Scanner read = new Scanner(file);
        while(read.hasNextLine())
        {
            String line = read.nextLine();
            String[] tokens = line.split(",", -1);
            int userId = Integer.parseInt(tokens[0]);
            int itemId = Integer.parseInt(tokens[1]);
            double rating = Double.parseDouble(tokens[2]);
            this.binaryInsert(userId, itemId, rating);
        }
    }
    
    /**
     * Search the position of a key in an array
     * 
     * @param array
     * @param lowerbound
     * @param upperbound
     * @param key 
     */
    public void binarySearch(int[ ] array, int lowerbound, int upperbound, int key)
    {
        int position;
        int comparisonCount = 1;    // counting the number of comparisons (optional)

        // To start, find the subscript of the middle position.
        position = ( lowerbound + upperbound) / 2;

        while((array[position] != key) && (lowerbound <= upperbound))
        {
            comparisonCount++;
            if (array[position] > key)             // If the number is > key, ..
            {                                              // decrease position by one. 
                upperbound = position - 1;   
            }                                                             
            else                                                   
            {                                                        
                lowerbound = position + 1;    // Else, increase position by one. 
            }
        position = (lowerbound + upperbound) / 2;
        }
        if (lowerbound <= upperbound)
        {
            System.out.println("The number was found in array subscript" + position);
            System.out.println("The binary search found the number after " + comparisonCount +
                 "comparisons.");
            // printing the number of comparisons is optional
        }
        else
            System.out.println("Sorry, the number is not in this array.  The binary search made "
                 +comparisonCount  + " comparisons.");
    }
    
    public boolean itemIdExists(int key, int size, int[] data) 
    {
        int low = 0;
        int high = size - 1;

        while(high >= low) {
            int middle = (low + high) / 2;
            if(data[middle] == key) {
                return true;
            }
            if(data[middle] < key) {
                low = middle + 1;
            }
            if(data[middle] > key) {
                high = middle - 1;
            }
        }
        return false;
   }
}
