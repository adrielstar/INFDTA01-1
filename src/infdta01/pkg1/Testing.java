package infdta01.pkg1;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author isaacdecuba
 */
public class Testing {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String args[]) throws FileNotFoundException {
        Calculation calc = new Calculation("UserItem.txt");
        
        HashMap<Integer, Double> user3 = calc.getUser(3).getRatedItems();
        
        for (Map.Entry<Integer, Double> item : user3.entrySet()) {
            System.out.println("item: " + item.getKey() + " value: " + item.getValue());
        }
        
        System.out.println("\n");
        
        HashMap<Integer, Double> user4 = calc.getUser(4).getRatedItems();
        
        for (Map.Entry<Integer, Double> item : user4.entrySet()) {
            System.out.println("item: " + item.getKey() + " value: " + item.getValue());
        }
        
        System.out.println("\n");
        
        Pearson pearsonCalculation = new Pearson();
        pearsonCalculation.calcPearson(calc.getUser(3).getRatedItems(), calc.getUser(4).getRatedItems());
        pearsonCalculation.printPearson();
        
        Euclidean euclideanCalculation = new Euclidean();
        euclideanCalculation.calcEuclidean(calc.getUser(3).getRatedItems(), calc.getUser(4).getRatedItems());
        System.out.println("Euclidean: " + euclideanCalculation.getEuclidean());
        
        Cosine cosine = new Cosine();
        cosine.calcCosine(calc.getUser(3).getRatedItems(), calc.getUser(4).getRatedItems());
        
    }

}
