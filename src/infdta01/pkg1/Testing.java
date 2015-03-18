/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infdta01.pkg1;

import java.io.FileNotFoundException;

/**
 *
 * @author isaacdecuba
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException {
        Calculation calc = new Calculation();
        calc.printUsers();
    }

}
