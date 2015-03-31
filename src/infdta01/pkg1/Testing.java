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
        
        int userChoiceA = 3;
        int userChoiceB = 6;
        
        HashMap<Integer, Double> userA = calc.getUser(userChoiceA).getRatedItems();
        
        System.out.println("List for user: " + userChoiceA);
        for (Map.Entry<Integer, Double> item : userA.entrySet()) {
            System.out.println("item: " + item.getKey() + " value: " + item.getValue());
        }
        
        System.out.println("\n");
        
        HashMap<Integer, Double> userB = calc.getUser(userChoiceB).getRatedItems();
        
        System.out.println("List for user: " + userChoiceB);
        for (Map.Entry<Integer, Double> item : userB.entrySet()) {
            System.out.println("item: " + item.getKey() + " value: " + item.getValue());
        }
        
        System.out.println("\n");
        
        Pearson pearsonCalculation = new Pearson();
        pearsonCalculation.calcPearson(calc.getUser(userChoiceA).getRatedItems(), calc.getUser(userChoiceB).getRatedItems());
        pearsonCalculation.printPearson();
        
        Euclidean euclideanCalculation = new Euclidean();
        euclideanCalculation.calcEuclidean(calc.getUser(userChoiceA).getRatedItems(), calc.getUser(userChoiceB).getRatedItems());
        System.out.println("Euclidean: " + euclideanCalculation.getEuclidean());
        
//        Cosine cosine = new Cosine();
//        cosine.calcCosine(calc.getUser(3).getRatedItems(), calc.getUser(4).getRatedItems());
        
    }

}
