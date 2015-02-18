/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infdta01.pkg1;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author Adriel
 */
public class UserItem 
{

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        // TODO code application logic here
        File file = new File ("UserItem.txt");
        Scanner read = new Scanner(file);
        while(read.hasNextLine())
        {
            String line = read.nextLine();
            System.out.println(line);
        }
    }    
}