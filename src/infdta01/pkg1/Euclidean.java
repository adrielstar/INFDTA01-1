package infdta01.pkg1;

import java.util.HashMap;

/**
 *
 * @author isaacdecuba
 */
public class Euclidean {
    private double euclidean;
    
    /**
     * Calculates the Euclidean between the 2 persons in the parameters
     * 
     * @param personARatedItems
     * @param personXRatedItems
     * @return 
     */
    public double calcEuclidean(HashMap<Integer,Double> personARatedItems, HashMap<Integer,Double> personXRatedItems)
    {
        Filter filter = new Filter(personARatedItems, personXRatedItems);
        double[] ratingPersonA = filter.getPersonA();
        double[] ratingPersonX = filter.getPersonB();
        
        // length ratingP A can differ from ratingX
        double result = 0.0;
        
        for (int i = 0; i < ratingPersonA.length; i++) {
            result+= Math.pow(Math.abs(ratingPersonA[i] - ratingPersonX[i]),2);
        }
        result = this.euclidean = Math.sqrt(result);
        return result;
    }
    
    public double getEuclidean() {
        return this.euclidean;
    }
}
