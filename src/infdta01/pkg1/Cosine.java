package infdta01.pkg1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author isaacdecuba
 */
public class Cosine {
    
    public double pearson;
    
    // persons to compare
    public double[] personA;
    public double[] personB;
    
    public double calcCosine(HashMap<Integer,Double> personARatedItems, HashMap<Integer,Double> personBRatedItems) {
        Collections.sort(personARatedItems);
        int timesToLoop = 0;
        if (personARatedItems.size() > personBRatedItems.size()) {
            timesToLoop = personARatedItems.size();
        } else {
            timesToLoop = personBRatedItems.size();
        }
        
        this.personA = new double[timesToLoop+1];
        this.personB = new double[timesToLoop+1];
        
        int pos = 1;
        double resultA = 0.0;
        double resultB = 0.0;
        double resultM = 0.0;
        double result = 0.0;
        
        for (HashMap.Entry<Integer, Double> entry : personARatedItems.entrySet()) {
            resultA+= this.personA[pos] = Math.pow(entry.getValue(),2);
            pos++;
        }
        
        pos = 1;
        for (HashMap.Entry<Integer, Double> entry : personBRatedItems.entrySet()) {
            resultB+= this.personB[pos] = Math.pow(entry.getValue(),2);
            pos++;
        }
        
        resultA = Math.abs(Math.sqrt(resultA));
        resultB = Math.abs(Math.sqrt(resultB));
        
        for (int i = 0; i < timesToLoop; i++) {
            System.out.println("A -- " + this.personA[i]);
            System.out.println("B -- " + this.personB[i]);
            resultM+= this.personA[i] * this.personB[i];
        }
        
        result = resultM / ( resultA * resultB );
        System.out.println("A: " + resultA);
        System.out.println("B: " + resultB);
        System.out.println("M: " + resultM);
        System.out.println("res: " + result);
        return resultA;
    }
}
